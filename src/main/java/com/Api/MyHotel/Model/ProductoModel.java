package com.Api.MyHotel.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "producto")
public class ProductoModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idproducto;
		@Column
		private String codigo_producto;
		@Column
		private Long precio_producto;
		@Column
		private Long cantidad_producto;
		@Column
		private String nombre_producto;
		@Column
		private String medida_producto;
		public Long getIdProducto() {
			return idproducto;
		}
		public void setIdProducto(Long idProducto) {
			this.idproducto = idProducto;
		}
		public String getCodigo_producto() {
			return codigo_producto;
		}
		public void setCodigo_producto(String codigo_producto) {
			this.codigo_producto = codigo_producto;
		}
		public Long getPrecio_producto() {
			return precio_producto;
		}
		public void setPrecio_producto(Long precio_producto) {
			this.precio_producto = precio_producto;
		}
		public Long getCantidad_producto() {
			return cantidad_producto;
		}
		public void setCantidad_producto(Long cantidad_producto) {
			this.cantidad_producto = cantidad_producto;
		}
		public String getNombre_producto() {
			return nombre_producto;
		}
		public void setNombre_producto(String nombre_producto) {
			this.nombre_producto = nombre_producto;
		}
		public String getMedida_producto() {
			return medida_producto;
		}
		public void setMedida_producto(String medida_producto) {
			this.medida_producto = medida_producto;
		}
		
		
		//getter y setter
		
		
		
	
}
