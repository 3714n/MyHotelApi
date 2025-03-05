package com.Api.MyHotel.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "cuenta")
public class CuentaModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idcuenta;
		@Column
		private String estado_cuenta;
		
		
		//getter y setter
		public Long getIdcuenta() {
			return idcuenta;
		}
		public void setIdcuenta(Long idcuenta) {
			this.idcuenta = idcuenta;
		}
		public String getEstado_cuenta() {
			return estado_cuenta;
		}
		public void setEstado_cuenta(String estado_cuenta) {
			this.estado_cuenta = estado_cuenta;
		}
		
		
	
}
