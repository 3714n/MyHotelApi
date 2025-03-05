package com.Api.MyHotel.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Api.MyHotel.Model.UsuarioModel;

import com.Api.MyHotel.Services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices usuarioService;
	
	@GetMapping
	public ArrayList<UsuarioModel> getUsuario(){
		return this.usuarioService.getUsuario();
	}
	@PostMapping
	public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario ) {
		return this.usuarioService.saveUsuario(usuario);
	}
	@GetMapping(path = "/{idusuario}")
	public Optional<UsuarioModel> getTarifaById(@PathVariable("idtusuario") Long id){
		return this.usuarioService.getById(id);
	}
	
	@PutMapping(path = "/{idusuario}")
	public UsuarioModel updateUsuarioById(@RequestBody UsuarioModel request, Long id) {
		return this.usuarioService.updateById(request, id);
	}
	@DeleteMapping(path = "/{idusuario}")
	public String deleteById(@PathVariable("idusuario") Long id) {
		Boolean ok = this.usuarioService.deleteUsuario(id);
		
		if (ok) {
			return "Usuario con id " + id + " eliminado";
		} else {
			return "Error al eliminar el id " + id;
		}
	}
}
