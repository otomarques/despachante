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

import com.oto.despachante.domain.Recibo;
import com.oto.despachante.domain.dto.ReciboDTO;
import com.oto.despachante.service.ReciboService;

//@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/financas/api/v1/recibo")
public class ReciboController {
	@Autowired
	private ReciboService service;

	@GetMapping()
	public ResponseEntity<List<ReciboDTO>> getAll() {
//		return new ResponseEntity<Iterable<Recibo>>(service.getRecibos(),HttpStatus.OK);
		return ResponseEntity.ok(service.buscarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity buscarPorID(@PathVariable("id") Long id) throws IllegalArgumentException {
		Optional<ReciboDTO> recibo = service.getReciboById(id);
		return recibo.isPresent() ? ResponseEntity.ok(recibo.get()) : ResponseEntity.notFound().build();
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
		List<ReciboDTO> recibos = service.getReciboByPeriodo(dataIni, dataFim);
		return recibos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(recibos);
	}

	@PostMapping
	public ResponseEntity InsereRecibo(@RequestBody Recibo recibo) {
		try {
			ReciboDTO rec = service.insert(recibo);
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
	public ResponseEntity AlteraRecibo(@PathVariable("id") Long id, @RequestBody Recibo recibo) {
		ReciboDTO rec = service.update(recibo, id);
		return rec != null ? ResponseEntity.ok(rec) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable("id") Long id) {
		return service.delete(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
}
