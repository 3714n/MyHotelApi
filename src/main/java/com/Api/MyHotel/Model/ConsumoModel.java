package com.Api.MyHotel.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "consumo")
public class ConsumoModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idconsumo;
		@Column
		private Long cantidad_consumo;
		
		public Long getIdconsumo() {
			return idconsumo;
		}
		public void setIdconsumo(Long idconsumo) {
			this.idconsumo = idconsumo;
		}
		public Long getCantidad_consumo() {
			return cantidad_consumo;
		}
		public void setCantidad_consumo(Long cantidad_consumo) {
			this.cantidad_consumo = cantidad_consumo;
		}
	
}
