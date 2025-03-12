package com.Api.MyHotel.Model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;


@Entity
@Table(name = "pago")
public class PagoModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idpago;
		@Column
		private Long monto_pago;
		@Column
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
		private Date fecha_pago;
		
		
		public Long getIdpago() {
			return idpago;
		}
		public void setIdpago(Long idpago) {
			this.idpago = idpago;
		}
		public Long getMonto_pago() {
			return monto_pago;
		}
		public void setMonto_pago(Long monto_pago) {
			this.monto_pago = monto_pago;
		}
		public Date getFecha_pago() {
			return fecha_pago;
		}
		public void setFecha_pago(Date fecha_pago) {
			this.fecha_pago = fecha_pago;
		}
		
		
}
