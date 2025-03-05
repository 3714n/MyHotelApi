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

import com.Api.MyHotel.Model.CuentaModel;
import com.Api.MyHotel.Services.CuentaServices;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {
	
	@Autowired
	private CuentaServices cuentaService;
	
	@GetMapping
	public ArrayList<CuentaModel> getCuenta(){
		return this.cuentaService.getCuenta();
	}
	@PostMapping
	public CuentaModel saveCuenta(@RequestBody CuentaModel cuenta ) {
		return this.cuentaService.saveCuenta(cuenta);
	}
	@GetMapping(path = "/{idcuenta}")
	public Optional<CuentaModel> getCuentaById(@PathVariable("idcuenta") Long id){
		return this.cuentaService.getById(id);
	}
	
	@PutMapping(path = "/{idcuenta}")
	public CuentaModel updateCuentaById(@RequestBody CuentaModel request, Long id) {
		return this.cuentaService.updateById(request, id);
	}
	@DeleteMapping(path = "/{idcuenta}")
	public String deleteById(@PathVariable("idcuenta") Long id) {
		Boolean ok = this.cuentaService.deleteCuenta(id);
		
		if (ok) {
			return "Cuenta con idcuenta " + id + " eliminado";
		} else {
			return "Error al eliminar el id " + id;
		}
	}
}
