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

import com.Api.MyHotel.Model.AcompañantesModel;

import com.Api.MyHotel.Services.AcompañantesServices;


@RestController
@RequestMapping("/acompañantes")
public class AcompañantesController {
	
	@Autowired
	private AcompañantesServices acompañanteService;
	
	@GetMapping
	public ArrayList<AcompañantesModel> getAcompañantes(){
		return this.acompañanteService.getAcompañante();
	}
	@PostMapping
	public AcompañantesModel saveAcompañantes(@RequestBody AcompañantesModel acompañantes ) {
		return this.acompañanteService.saveAcompañante(acompañantes);
	}
	@GetMapping(path = "/{idacompañantes}")
	public Optional<AcompañantesModel> getAcompañantesById(@PathVariable("idacompañantes") Long id){
		return this.acompañanteService.getById(id);
	}
	
	@PutMapping(path = "/{idacompañantes}")
	public AcompañantesModel updateAcompañantesById(@RequestBody AcompañantesModel request, Long id) {
		return this.acompañanteService.updateById(request, id);
	}
	@DeleteMapping(path = "/{idacompañantes}")
	public String deleteById(@PathVariable("idacompañantes") Long id) {
		Boolean ok = this.acompañanteService.deleteAcompañante(id);
		
		if (ok) {
			return "Acompañantes con idacompañante " + id + " eliminado";
		} else {
			return "Error al eliminar el idacompañante " + id;
		}
	}
}
