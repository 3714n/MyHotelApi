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


import com.Api.MyHotel.Model.HistorialModel;
import com.Api.MyHotel.Services.HistorialServices;


@RestController
@RequestMapping("/historial")
public class HistorialController {
	
	@Autowired
	private HistorialServices historialService;
	
	@GetMapping
	public ArrayList<HistorialModel> getHistorial(){
		return this.historialService.getHistorial();
	}
	@PostMapping
	public HistorialModel saveHistorial(@RequestBody HistorialModel historial ) {
		return this.historialService.saveHistorial(historial);
	}
	@GetMapping(path = "/{idhistorial}")
	public Optional<HistorialModel> getHistorialById(@PathVariable("idhistorial") Long idhistorial){
		return this.historialService.getById(idhistorial);
	}
	
	@PutMapping(path = "/{idhabitacion}")
	public HistorialModel istorial(@RequestBody HistorialModel request, Long idhistorial) {
		return this.historialService.updateById(request, idhistorial);
	}
	@DeleteMapping(path = "/{idhabitacion}")
	public String deleteById(@PathVariable("idhistorial") Long idhistorial) {
		Boolean ok = this.historialService.deleteHistorial(idhistorial);
		
		if (ok) {
			return "Historial con id " + idhistorial + " eliminado";
		} else {
			return "Error al eliminar el id " + idhistorial;
		}
	}
}
