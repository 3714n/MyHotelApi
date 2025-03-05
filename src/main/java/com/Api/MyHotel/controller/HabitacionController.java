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


import com.Api.MyHotel.Model.HabitacionModel;
import com.Api.MyHotel.Services.HabitacionServices;


@RestController
@RequestMapping("/habitacion")
public class HabitacionController {
	
	@Autowired
	private HabitacionServices habitacionService;
	
	@GetMapping
	public ArrayList<HabitacionModel> getHabitacion(){
		return this.habitacionService.getHabitacion();
	}
	@PostMapping
	public HabitacionModel saveHabitacion(@RequestBody HabitacionModel habitacion ) {
		return this.habitacionService.saveHabitacion(habitacion);
	}
	@GetMapping(path = "/{idhabitacion}")
	public Optional<HabitacionModel> getHabitacionById(@PathVariable("idhabitacion") Long idhabitacion){
		return this.habitacionService.getById(idhabitacion);
	}
	
	@PutMapping(path = "/{idhabitacion}")
	public HabitacionModel updateHabitacionById(@RequestBody HabitacionModel request, Long idhabitacion) {
		return this.habitacionService.updateById(request, idhabitacion);
	}
	@DeleteMapping(path = "/{idhabitacion}")
	public String deleteById(@PathVariable("idhabitacion") Long idhabitacion) {
		Boolean ok = this.habitacionService.deleteHabitacion(idhabitacion);
		
		if (ok) {
			return "Habitacion con id " + idhabitacion + " eliminado";
		} else {
			return "Error al eliminar el id " + idhabitacion;
		}
	}
}
