package com.Api.MyHotel.Model;

import java.sql.Date;


import jakarta.persistence.*;


@Entity
@Table(name = "tarifa")
public class TarifaModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idtarifa;
		@Column
		private Date fecha_ini_tarifa;
		@Column
		private Date fecha_out_tarifa;
		@Column
		private Long precio_tarifa;
		
		public Long getIdtarifa() {
			return idtarifa;
		}
		public void setIdtarifa(Long idtarifa) {
			this.idtarifa = idtarifa;
		}
		public Date getFecha_ini_tarifa() {
			return fecha_ini_tarifa;
		}
		public void setFecha_ini_tarifa(Date fecha_ini_tarifa) {
			this.fecha_ini_tarifa = fecha_ini_tarifa;
		}
		public Date getFecha_out_tarifa() {
			return fecha_out_tarifa;
		}
		public void setFecha_out_tarifa(Date fecha_out_tarifa) {
			this.fecha_out_tarifa = fecha_out_tarifa;
		}
		public Long getPrecio_tarifa() {
			return precio_tarifa;
		}
		public void setPrecio_tarifa(Long precio_tarifa) {
			this.precio_tarifa = precio_tarifa;
		}
		
		
}
