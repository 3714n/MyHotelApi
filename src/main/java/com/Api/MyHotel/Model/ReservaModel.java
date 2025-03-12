package com.Api.MyHotel.Model;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;


@Entity
@Table(name = "reserva")
public class ReservaModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idreserva;
		@Column
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
		private Date fecha_ini_reserva;
		@Column
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
		private Date fecha_out_reserva;
		@Column
		private Time Hora_in_reserva;
		@Column
		private Time Hora_out_reserva;
		@Column
		private String detalle_reserva;
		
		public Long getIdreserva() {
			return idreserva;
		}
		public void setIdreserva(Long idreserva) {
			this.idreserva = idreserva;
		}
		public Date getFecha_ini_reserva() {
			return fecha_ini_reserva;
		}
		public void setFecha_ini_reserva(Date fecha_ini_reserva) {
			this.fecha_ini_reserva = fecha_ini_reserva;
		}
		public Date getFecha_out_reserva() {
			return fecha_out_reserva;
		}
		public void setFecha_out_reserva(Date fecha_out_reserva) {
			this.fecha_out_reserva = fecha_out_reserva;
		}
		public Time getHora_in_reserva() {
			return Hora_in_reserva;
		}
		public void setHora_in_reserva(Time hora_in_reserva) {
			Hora_in_reserva = hora_in_reserva;
		}
		public Time getHora_out_reserva() {
			return Hora_out_reserva;
		}
		public void setHora_out_reserva(Time hora_out_reserva) {
			Hora_out_reserva = hora_out_reserva;
		}
		public String getDetalle_reserva() {
			return detalle_reserva;
		}
		public void setDetalle_reserva(String detalle_reserva) {
			this.detalle_reserva = detalle_reserva;
		}
		
		
}
