package com.oto.despachante.api;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.oto.despachante.domain.Servico;
import com.oto.despachante.domain.dto.ServicoDTO;
import com.oto.despachante.service.ServicoService;

//@CrossOrigin(origins = "", allowedHeaders = "", maxAge = 3600)
@RestController
@RequestMapping("/despachante/api/v1/servico")
public class ServicoController {
	@Autowired
	private ServicoService service;

	@GetMapping()
	public ResponseEntity<List<ServicoDTO>> getAll() {
//		return new ResponseEntity<Iterable<Recibo>>(service.getRecibos(),HttpStatus.OK);
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity buscarPorID(@PathVariable("id") Long id) throws IllegalArgumentException{
		Optional<ServicoDTO> recibo =  service.getServicoById(id);
		return recibo.isPresent() ?
			 ResponseEntity.ok(recibo.get()) :
			 ResponseEntity.notFound().build();
	}
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity buscarPorLogin(@PathVariable("descricao") String descricao){
		List<ServicoDTO> servicos =  service.getServicoByDescricao(descricao);
		return servicos.isEmpty() ? ResponseEntity.noContent().build() :
			ResponseEntity.ok(servicos);
	}

	@PostMapping
	public ResponseEntity InsereServico(@RequestBody Servico servico) {
		try {
			ServicoDTO rec = service.insert(servico);
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
	public ResponseEntity AlteraServico(@PathVariable("id") Long id, @RequestBody Servico servico) {
		ServicoDTO rec = service.update(servico, id);
		return rec != null ? ResponseEntity.ok(rec) :
			ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable("id") Long id) {
		return service.delete(id) ? ResponseEntity.ok().build() :
			ResponseEntity.notFound().build();
	}
}
