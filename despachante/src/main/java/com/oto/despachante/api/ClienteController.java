package com.oto.despachante.api;

import java.net.URI;
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

import com.oto.despachante.domain.Cliente;
import com.oto.despachante.domain.dto.ClienteDTO;
import com.oto.despachante.service.ClienteService;

//@CrossOrigin(origins = "", allowedHeaders = "", maxAge = 3600)
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/despachante/api/v1/cliente")
public class ClienteController {
	@Autowired
	private ClienteService service;

	@GetMapping()
	public ResponseEntity<List<ClienteDTO>> getAll() {
//		return new ResponseEntity<Iterable<Recibo>>(service.getRecibos(),HttpStatus.OK);
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity buscarPorID(@PathVariable("id") Long id) throws IllegalArgumentException{
		Optional<ClienteDTO> recibo =  service.getClienteById(id);
		return recibo.isPresent() ?
			 ResponseEntity.ok(recibo.get()) :
			 ResponseEntity.notFound().build();
	}
	@GetMapping("/nome/{nome}")
	public ResponseEntity buscarPorNome(@PathVariable("nome") String nome) throws IllegalArgumentException{
		List<ClienteDTO> recibo;
		if(nome == null) {
			recibo = service.buscarTodos();
		}
		recibo =  service.buscarPorNome(nome);
		return ResponseEntity.ok(recibo);
	}
	
	@PostMapping
	public ResponseEntity InsereCliente(@RequestBody Cliente cliente) {
		try {
			ClienteDTO rec = service.insert(cliente);
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
	public ResponseEntity AlteraCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
		ClienteDTO rec = service.update(cliente, id);
		return rec != null ? ResponseEntity.ok(rec) :
			ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable("id") Long id) {
		return service.delete(id) ? ResponseEntity.ok().build() :
			ResponseEntity.notFound().build();
	}

}
