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

import com.Api.MyHotel.Model.ClienteModel;
import com.Api.MyHotel.Services.ClienteServices;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteServices clienteService;
	
	@GetMapping
	public ArrayList<ClienteModel> getCliente(){
		return this.clienteService.getCliente();
	}
	@PostMapping
	public ClienteModel saveCliente(@RequestBody ClienteModel cliente ) {
		return this.clienteService.saveCliente(cliente);
	}
	@GetMapping(path = "/{id}")
	public Optional<ClienteModel> getClienteById(@PathVariable("id") Long id){
		return this.clienteService.getById(id);
	}
	
	@PutMapping(path = "/{id}")
	public ClienteModel updateClienteById(@RequestBody ClienteModel request, Long id) {
		return this.clienteService.updateById(request, id);
	}
	@DeleteMapping(path = "/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		Boolean ok = this.clienteService.deleteCliente(id);
		
		if (ok) {
			return "Cliente con id " + id + " eliminado";
		} else {
			return "Error al eliminar el id " + id;
		}
	}
}
