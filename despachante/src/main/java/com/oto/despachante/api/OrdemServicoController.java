package com.oto.despachante.api;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.oto.despachante.domain.Orcamento;
import com.oto.despachante.domain.OrdemServico;
import com.oto.despachante.domain.dto.OrdemServicoDTO;
import com.oto.despachante.service.OrdemServicoService;
import com.oto.despachante.utils.OrcamentoUtils;

//@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/despachante/api/v1/ordemServico")
public class OrdemServicoController {
	@Autowired
	private OrdemServicoService service;

	@GetMapping()
	public ResponseEntity<List<OrdemServicoDTO>> getAll() {
//		return new ResponseEntity<Iterable<OrdemServico>>(service.getOrdemServicos(),HttpStatus.OK);
		return ResponseEntity.ok(service.buscarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity buscarPorID(@PathVariable("id") Long id) throws IllegalArgumentException {
		Optional<OrdemServicoDTO> ordemServico = service.getOrdemServicoById(id);
		return ordemServico.isPresent() ? ResponseEntity.ok(ordemServico.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping("/periodo/{periodo}")
	public ResponseEntity buscarPorPeriodo(@PathVariable("periodo") String periodo) {
		String[] dados = periodo.split(":");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataIni = null;
		Date dataFim = null;
		try {
			dataIni = sdf.parse(dados[0]);
			dataFim = sdf.parse(dados[1]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<OrdemServicoDTO> ordemServicos = service.getOrdemServicoByPeriodo(dataIni, dataFim);
		return ordemServicos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(ordemServicos);
	}

	@PostMapping
	public ResponseEntity InsereOrdemServico(@RequestBody Orcamento orcamento) {
		OrdemServico ordemServico = OrcamentoUtils.createOS(orcamento);
		try {
			OrdemServicoDTO rec = service.insert(ordemServico);
			URI location = getUri(rec.getId());
			return ResponseEntity.created(location).build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}

	private URI getUri(Long id) {
		return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
	}

	@PutMapping("/{id}")
	public ResponseEntity AlteraOrdemServico(@PathVariable("id") Long id, @RequestBody OrdemServico ordemServico) {
		OrdemServicoDTO rec = service.update(ordemServico, id);
		return rec != null ? ResponseEntity.ok(rec) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}
}
