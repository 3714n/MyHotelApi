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


import com.Api.MyHotel.Model.TarifaModel;

import com.Api.MyHotel.Services.TarifaServices;

@RestController
@RequestMapping("/tarifa")
public class TarifaController {
	
	@Autowired
	private TarifaServices tarifaService;
	
	@GetMapping
	public ArrayList<TarifaModel> getTarifa(){
		return this.tarifaService.getTarifa();
	}
	@PostMapping
	public TarifaModel saveTarifa(@RequestBody TarifaModel tarifa ) {
		return this.tarifaService.saveTarifa(tarifa);
	}
	@GetMapping(path = "/{idtarifa}")
	public Optional<TarifaModel> getTarifaById(@PathVariable("idtarifa") Long id){
		return this.tarifaService.getById(id);
	}
	
	@PutMapping(path = "/{idtarifa}")
	public TarifaModel updateTarifaById(@RequestBody TarifaModel request, Long id) {
		return this.tarifaService.updateById(request, id);
	}
	@DeleteMapping(path = "/{idtarifa}")
	public String deleteById(@PathVariable("idtarifa") Long id) {
		Boolean ok = this.tarifaService.deleteTarifa(id);
		
		if (ok) {
			return "Tarifa con id " + id + " eliminado";
		} else {
			return "Error al eliminar el id " + id;
		}
	}
}
