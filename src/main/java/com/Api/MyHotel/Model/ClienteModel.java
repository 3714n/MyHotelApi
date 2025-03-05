package com.Api.MyHotel.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "cliente")
public class ClienteModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long Id;
		@Column
		private String nombre_cliente;
		@Column
		private String apellido_cliente;
		@Column
		private String tipo_id_cliente;
		@Column
		private String numero_id_cliente;
		@Column
		private String correo_cliente;
		@Column
		private String telefono_cliente;
		@Column
		private String nacionalidad_cliente;
		@Column
		private String edad_cliente;
		@Column
		private String profesion_cliente;
		
		//getter y setter
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			this.Id = id;
		}
		public String getNombre_cliente() {
			return nombre_cliente;
		}
		public void setNombre_cliente(String nombre_cliente) {
			this.nombre_cliente = nombre_cliente;
		}
		public String getApellido_cliente() {
			return apellido_cliente;
		}
		public void setApellido_cliente(String apellido_cliente) {
			this.apellido_cliente = apellido_cliente;
		}
		public String getTipo_id_cliente() {
			return tipo_id_cliente;
		}
		public void setTipo_id_cliente(String tipo_id_cliente) {
			this.tipo_id_cliente = tipo_id_cliente;
		}
		public String getNumero_id_cliente() {
			return numero_id_cliente;
		}
		public void setNumero_id_cliente(String numero_id_cliente) {
			this.numero_id_cliente = numero_id_cliente;
		}
		public String getCorreo_cliente() {
			return correo_cliente;
		}
		public void setCorreo_cliente(String correo_cliente) {
			this.correo_cliente = correo_cliente;
		}
		public String getTelefono_cliente() {
			return telefono_cliente;
		}
		public void setTelefono_cliente(String telefono_cliente) {
			this.telefono_cliente = telefono_cliente;
		}
		public String getNacionalidad_cliente() {
			return nacionalidad_cliente;
		}
		public void setNacionalidad_cliente(String nacionalidad_cliente) {
			this.nacionalidad_cliente = nacionalidad_cliente;
		}
		public String getProfesion_cliente() {
			return profesion_cliente;
		}
		public void setProfesion_cliente(String profesion_cliente) {
			this.profesion_cliente = profesion_cliente;
		}
		public String getEdad_cliente() {
			return edad_cliente;
		}
		public void setEdad_cliente(String edad_cliente) {
			this.edad_cliente = edad_cliente;
		}
		
	
}
