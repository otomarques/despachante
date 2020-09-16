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
	
	@GetMapping("/{id}")
	public ResponseEntity buscarPorID(@PathVariable("id") Long id) throws IllegalArgumentException{
		Optional<UsuarioDTO> recibo =  service.getUsuarioById(id);
		return recibo.isPresent() ?
			 ResponseEntity.ok(recibo.get()) :
			 ResponseEntity.notFound().build();
	}
	@GetMapping("/login/{login}")
	public ResponseEntity buscarPorLogin(@PathVariable("login") String login){
		List<UsuarioDTO> usuarios =  service.getUsuarioByLogin(login);
		return usuarios.isEmpty() ? ResponseEntity.noContent().build() :
			ResponseEntity.ok(usuarios);
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
	
	@PutMapping("/{id}")
	public ResponseEntity AlteraUsuario(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
		UsuarioDTO rec = service.update(usuario, id);
		return rec != null ? ResponseEntity.ok(rec) :
			ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable("id") Long id) {
		return service.delete(id) ? ResponseEntity.ok().build() :
			ResponseEntity.notFound().build();
	}

}
