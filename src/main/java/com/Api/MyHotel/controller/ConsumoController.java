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

import com.Api.MyHotel.Model.ConsumoModel;
import com.Api.MyHotel.Services.ConsumoServices;

@RestController
@RequestMapping("/consumo")
public class ConsumoController {
	
	@Autowired
	private ConsumoServices consumoService;
	
	@GetMapping
	public ArrayList<ConsumoModel> getConsumo(){
		return this.consumoService.getConsumo();
	}
	@PostMapping
	public ConsumoModel saveConsumo(@RequestBody ConsumoModel consumo ) {
		return this.consumoService.saveCuenta(consumo);
	}
	@GetMapping(path = "/{idconsumo}")
	public Optional<ConsumoModel> getConsumoById(@PathVariable("idconsumo") Long id){
		return this.consumoService.getById(id);
	}
	
	@PutMapping(path = "/{idcuenta}")
	public ConsumoModel updateConsumoById(@RequestBody ConsumoModel request, Long id) {
		return this.consumoService.updateById(request, id);
	}
	@DeleteMapping(path = "/{idconsumo}")
	public String deleteById(@PathVariable("idconsumo") Long id) {
		Boolean ok = this.consumoService.deleteConsumo(id);
		
		if (ok) {
			return "Consumo con idcuenta " + id + " eliminado";
		} else {
			return "Error al eliminar el id " + id;
		}
	}
}
