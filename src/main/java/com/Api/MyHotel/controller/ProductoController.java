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


import com.Api.MyHotel.Model.ProductoModel;

import com.Api.MyHotel.Services.ProductoServices;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoServices productoService;
	
	@GetMapping
	public ArrayList<ProductoModel> getProducto(){
		return this.productoService.getProducto();
	}
	@PostMapping
	public ProductoModel saveProducto(@RequestBody ProductoModel producto ) {
		return this.productoService.saveProducto(producto);
	}
	@GetMapping(path = "/{id}")
	public Optional<ProductoModel> getProductoById(@PathVariable("idproducto") Long id){
		return this.productoService.getById(id);
	}
	
	@PutMapping(path = "/{id}")
	public ProductoModel updateProductoById(@RequestBody ProductoModel request, Long id) {
		return this.productoService.updateById(request, id);
	}
	@DeleteMapping(path = "/{id}")
	public String deleteById(@PathVariable("idproducto") Long id) {
		Boolean ok = this.productoService.deleteProducto(id);
		
		if (ok) {
			return "Producto con id " + id + " eliminado";
		} else {
			return "Error al eliminar el id " + id;
		}
	}
}
