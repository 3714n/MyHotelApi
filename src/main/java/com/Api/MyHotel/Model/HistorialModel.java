package com.Api.MyHotel.Model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "historial")
public class HistorialModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idhistorial;
	@Column
	private String cambio_historial;
	@Column
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date fecha_historial;
	
	
	public Long getIdhistorial() {
		return idhistorial;
	}
	public void setIdhistorial(Long idhistorial) {
		this.idhistorial = idhistorial;
	}
	public String getCambio_historial() {
		return cambio_historial;
	}
	public void setCambio_historial(String cambio_historial) {
		this.cambio_historial = cambio_historial;
	}
	public Date getFecha_historial() {
		return fecha_historial;
	}
	public void setFecha_historial(Date fecha_historial) {
		this.fecha_historial = fecha_historial;
	}
	
	
}
