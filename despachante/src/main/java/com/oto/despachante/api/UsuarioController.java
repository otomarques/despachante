package com.oto.despachante.api;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.oto.despachante.domain.Usuario;
import com.oto.despachante.domain.dto.UsuarioDTO;
import com.oto.despachante.service.UsuarioService;

//@CrossOrigin(origins = "", allowedHeaders = "", maxAge = 3600)
@RestController
@RequestMapping("/despachante/api/v1/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping()
	public ResponseEntity<List<UsuarioDTO>> getAll() {
//		return new ResponseEntity<Iterable<Recibo>>(service.getRecibos(),HttpStatus.OK);
		return ResponseEntity.ok(service.buscarTodos());
	}

	@PostMapping
	public ResponseEntity InsereUsuario(@RequestBody Usuario usuario) {
		try {
			UsuarioDTO rec = service.insert(usuario);
			URI location = getUri(rec.getId());
			return ResponseEntity.created(location).build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}

	private URI getUri(Long id) {
		return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
	}

}
