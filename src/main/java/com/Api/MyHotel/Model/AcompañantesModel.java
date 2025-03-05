package com.Api.MyHotel.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "acompañantes")
public class AcompañantesModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idacompañantes;
		@Column
		private String nombre_acompañante;
		@Column
		private String apellido_acompañante;
		@Column
		private String tipo_id_acompañante;
		@Column
		private String numero_id_acompañante;
		@Column
		private String edad_acompañante;
		
		//getter y setter
		public Long getIdacompañante() {
			return idacompañantes;
		}
		public void setIdacompañante(Long idacompañante) {
			this.idacompañantes = idacompañante;
		}
		public String getNombre_acompañante() {
			return nombre_acompañante;
		}
		public void setNombre_acompañante(String nombre_acompañante) {
			this.nombre_acompañante = nombre_acompañante;
		}
		public String getApellido_acompañante() {
			return apellido_acompañante;
		}
		public void setApellido_acompañante(String apellido_acompañante) {
			this.apellido_acompañante = apellido_acompañante;
		}
		public String getTipo_id_acompañante() {
			return tipo_id_acompañante;
		}
		public void setTipo_id_acompañante(String tipo_id_acompañante) {
			this.tipo_id_acompañante = tipo_id_acompañante;
		}
		public String getNumero_id_acompañante() {
			return numero_id_acompañante;
		}
		public void setNumero_id_acompañante(String numero_id_acompañante) {
			this.numero_id_acompañante = numero_id_acompañante;
		}
		public String getEdad_acompañante() {
			return edad_acompañante;
		}
		public void setEdad_acompañante(String edad_acompañante) {
			this.edad_acompañante = edad_acompañante;
		}
		
		

		
		
	
}
