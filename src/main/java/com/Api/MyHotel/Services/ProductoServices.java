package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Api.MyHotel.Model.ProductoModel;
import com.Api.MyHotel.Repository.IProductoRepository;

@Service
public class ProductoServices {

		@Autowired
		IProductoRepository productoRepository;
		
		public ArrayList<ProductoModel> getProducto(){
			return (ArrayList<ProductoModel>) productoRepository.findAll();
		}
		public ProductoModel saveProducto(ProductoModel producto) {
			return productoRepository.save(producto);
			
		}
		public Optional<ProductoModel> getById(Long id){
			return productoRepository.findById(id);
		}
		public ProductoModel updateById(ProductoModel request, Long id){
			ProductoModel producto = productoRepository.findById(id).get();

			producto.setCodigo_producto(request.getCodigo_producto());
			producto.setPrecio_producto(request.getCantidad_producto());
			producto.setCantidad_producto(request.getCantidad_producto());
			producto.setNombre_producto(request.getNombre_producto());
			producto.setMedida_producto(request.getMedida_producto());
			
			
			return producto;
			
		}
		public Boolean deleteProducto (Long id) {
			try {
				productoRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
