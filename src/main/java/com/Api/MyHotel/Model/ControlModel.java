package com.Api.MyHotel.Model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;


@Entity
@Table(name = "control")
public class ControlModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idcontrol;
		@Column
		private String tipo_control;
		@Column
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
		private Date fecha_control;
		
		//getter y setter
		public Long getIdcontrol() {
			return idcontrol;
		}
		public void setIdcontrol(Long idcontrol) {
			this.idcontrol = idcontrol;
		}
		public String getTipo_control() {
			return tipo_control;
		}
		public void setTipo_control(String tipo_control) {
			this.tipo_control = tipo_control;
		}
		public Date getFecha_control() {
			return fecha_control;
		}
		public void setFecha_control(Date fecha_control) {
			this.fecha_control = fecha_control;
		}
		

		
	
}
