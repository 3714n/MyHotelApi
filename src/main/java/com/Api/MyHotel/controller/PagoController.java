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


import com.Api.MyHotel.Model.PagoModel;

import com.Api.MyHotel.Services.PagoServices;

@RestController
@RequestMapping("/pago")
public class PagoController {
	
	@Autowired
	private PagoServices pagoService;
	
	@GetMapping
	public ArrayList<PagoModel> getPago(){
		return this.pagoService.getPago();
	}
	@PostMapping
	public PagoModel savePago(@RequestBody PagoModel pago ) {
		return this.pagoService.savePago(pago);
	}
	@GetMapping(path = "/{idpago}")
	public Optional<PagoModel> getPagoById(@PathVariable("idpago") Long id){
		return this.pagoService.getById(id);
	}
	
	@PutMapping(path = "/{idpago}")
	public PagoModel updatePagoById(@RequestBody PagoModel request, Long id) {
		return this.pagoService.updateById(request, id);
	}
	@DeleteMapping(path = "/{idpago}")
	public String deleteById(@PathVariable("idpago") Long id) {
		Boolean ok = this.pagoService.deletePago(id);
		
		if (ok) {
			return "Pago con id " + id + " eliminado";
		} else {
			return "Error al eliminar el id " + id;
		}
	}
}
