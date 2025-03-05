package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.MyHotel.Model.AcompañantesModel;

import com.Api.MyHotel.Repository.IAcompañantesRepository;


@Service
public class AcompañantesServices {

		@Autowired
		IAcompañantesRepository acompañanteRepository;
		
		public ArrayList<AcompañantesModel> getAcompañante(){
			return (ArrayList<AcompañantesModel>) acompañanteRepository.findAll();
		}
		public AcompañantesModel saveAcompañante(AcompañantesModel acompañante) {
			return acompañanteRepository.save(acompañante);
			
		}
		public Optional<AcompañantesModel> getById(Long id){
			return acompañanteRepository.findById(id);
		}
		public AcompañantesModel updateById(AcompañantesModel request, Long id){
			AcompañantesModel acompañante = acompañanteRepository.findById(id).get();

			acompañante.setNombre_acompañante(request.getNombre_acompañante());
			acompañante.setApellido_acompañante(request.getApellido_acompañante());
			acompañante.setTipo_id_acompañante(request.getTipo_id_acompañante());
			acompañante.setNumero_id_acompañante(request.getNumero_id_acompañante());
			acompañante.setEdad_acompañante(request.getEdad_acompañante());
			
			
			return acompañante;
			
		}
		public Boolean deleteAcompañante (Long id) {
			try {
				acompañanteRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
