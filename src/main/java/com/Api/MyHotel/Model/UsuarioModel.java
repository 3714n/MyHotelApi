package com.Api.MyHotel.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idusuario;
		@Column
		private String nombre_usuario;
		@Column
		private String usuario;
		@Column
		private String correo_usuario;
		@Column
		private String contraceña_usuario;
		@Column
		private String rol_usuario;
		
		public Long getIdusuario() {
			return idusuario;
		}
		public void setIdusuario(Long idusuario) {
			this.idusuario = idusuario;
		}
		public String getNombre_usuario() {
			return nombre_usuario;
		}
		public void setNombre_usuario(String nombre_usuario) {
			this.nombre_usuario = nombre_usuario;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getCorreo_usuario() {
			return correo_usuario;
		}
		public void setCorreo_usuario(String correo_usuario) {
			this.correo_usuario = correo_usuario;
		}
		public String getContraceña_usuario() {
			return contraceña_usuario;
		}
		public void setContraceña_usuario(String contraceña_usuario) {
			this.contraceña_usuario = contraceña_usuario;
		}
		public String getRol_usuario() {
			return rol_usuario;
		}
		public void setRol_usuario(String rol_usuario) {
			this.rol_usuario = rol_usuario;
		}
		
}
