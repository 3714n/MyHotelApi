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

import com.Api.MyHotel.Model.ControlModel;
import com.Api.MyHotel.Services.ControlServices;


@RestController
@RequestMapping("/control")
public class ControlController {
	
	@Autowired
	private ControlServices controlService;
	
	@GetMapping
	public ArrayList<ControlModel> getControl(){
		return this.controlService.getControl();
	}
	@PostMapping
	public ControlModel saveControl(@RequestBody ControlModel control ) {
		return this.controlService.saveControl(control);
	}
	@GetMapping(path = "/{idcontrol}")
	public Optional<ControlModel> getCheckById(@PathVariable("idcontrol") Long id){
		return this.controlService.getById(id);
	}
	
	@PutMapping(path = "/{idcontrol}")
	public ControlModel updateCheckById(@RequestBody ControlModel request, Long id) {
		return this.controlService.updateById(request, id);
	}
	@DeleteMapping(path = "/{idcontrol}")
	public String deleteById(@PathVariable("idcontrol") Long id) {
		Boolean ok = this.controlService.deleteControl(id);
		
		if (ok) {
			return "Control con idcontrol " + id + " eliminado";
		} else {
			return "Error al eliminar el idcontrol " + id;
		}
	}
}
