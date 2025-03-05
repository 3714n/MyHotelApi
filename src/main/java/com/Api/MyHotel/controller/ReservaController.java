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


import com.Api.MyHotel.Model.ReservaModel;

import com.Api.MyHotel.Services.ReservaServices;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
	
	@Autowired
	private ReservaServices reservaService;
	
	@GetMapping
	public ArrayList<ReservaModel> getReserva(){
		return this.reservaService.getReserva();
	}
	@PostMapping
	public ReservaModel saveReserva(@RequestBody ReservaModel reserva ) {
		return this.reservaService.saveReserva(reserva);
	}
	@GetMapping(path = "/{idreserva}")
	public Optional<ReservaModel> getReservaById(@PathVariable("idreserva") Long id){
		return this.reservaService.getById(id);
	}
	
	@PutMapping(path = "/{idreserva}")
	public ReservaModel updateReservaById(@RequestBody ReservaModel request, Long id) {
		return this.reservaService.updateById(request, id);
	}
	@DeleteMapping(path = "/{idreserva}")
	public String deleteById(@PathVariable("idreserva") Long id) {
		Boolean ok = this.reservaService.deleteReserva(id);
		
		if (ok) {
			return "Reserva con id " + id + " eliminado";
		} else {
			return "Error al eliminar el id " + id;
		}
	}
}
