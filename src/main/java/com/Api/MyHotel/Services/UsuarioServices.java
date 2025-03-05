package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Api.MyHotel.Model.UsuarioModel;
import com.Api.MyHotel.Repository.IUsuarioRepository;

@Service
public class UsuarioServices {

		@Autowired
		IUsuarioRepository usuarioRepository;
		
		public ArrayList<UsuarioModel> getUsuario(){
			return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
		}
		public UsuarioModel saveUsuario(UsuarioModel usuario) {
			return usuarioRepository.save(usuario);
			
		}
		public Optional<UsuarioModel> getById(Long id){
			return usuarioRepository.findById(id);
		}
		public UsuarioModel updateById(UsuarioModel request, Long id){
			UsuarioModel usuario = usuarioRepository.findById(id).get();

			usuario.setNombre_usuario(request.getNombre_usuario());
			usuario.setUsuario(request.getUsuario());
			usuario.setCorreo_usuario(request.getCorreo_usuario());
			usuario.setContraceña_usuario(request.getContraceña_usuario());
			usuario.setRol_usuario(request.getRol_usuario());
			
			
			
			return usuario;
			
		}
		public Boolean deleteUsuario (Long id) {
			try {
				usuarioRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
