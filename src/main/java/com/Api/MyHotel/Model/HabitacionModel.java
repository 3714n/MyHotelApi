package com.Api.MyHotel.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "habitacion")
public class HabitacionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idhabitacion;
	@Column
	private String codigo_habitacion;
	@Column
	private Long precio_habitacion;
	@Column
	private String descripcion_habitacion;
	@Column
	private String estado_habitacion;
	
	//getter y setter
	public Long getIdhabitacion() {
		return idhabitacion;
	}
	public void setIdhabitacion(Long idhabitacion) {
		this.idhabitacion = idhabitacion;
	}
	public String getCodigo_habitacion() {
		return codigo_habitacion;
	}
	public void setCodigo_habitacion(String codigo_habitacion) {
		this.codigo_habitacion = codigo_habitacion;
	}
	public Long getPrecio_habitacion() {
		return precio_habitacion;
	}
	public void setPrecio_habitacion(Long precio_habitacion) {
		this.precio_habitacion = precio_habitacion;
	}
	public String getDescripcion_habitacion() {
		return descripcion_habitacion;
	}
	public void setDescripcion_habitacion(String descripcion_habitacion) {
		this.descripcion_habitacion = descripcion_habitacion;
	}
	public String getEstado_habitacion() {
		return estado_habitacion;
	}
	public void setEstado_habitacion(String estado_habitacion) {
		this.estado_habitacion = estado_habitacion;
	}
	
	
	
}
