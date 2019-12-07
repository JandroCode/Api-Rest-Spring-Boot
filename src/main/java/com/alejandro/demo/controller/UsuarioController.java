package com.alejandro.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alejandro.demo.entity.Usuario;
import com.alejandro.demo.repository.IUsuarioRepository;

@RestController
@CrossOrigin({"*"})
public class UsuarioController {
	
	@Autowired
	private IUsuarioRepository usuariorepo;
	
	
	//listar
	@GetMapping("/listar")
	public List<Usuario> listar(){
		return usuariorepo.findAll();
	}
	
	//Agregar
	@PostMapping("/insertar")
	public void insertar(@RequestBody @Valid Usuario user) {
		usuariorepo.save(user);
	}
	
	//Modificar

	@PutMapping("/modificar")
	public void modificar(@RequestBody  Usuario user) {
		usuariorepo.save(user);
	}
		
	//Eliminar
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		usuariorepo.delete(id);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
