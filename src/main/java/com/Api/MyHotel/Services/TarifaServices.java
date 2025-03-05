package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Api.MyHotel.Model.TarifaModel;
import com.Api.MyHotel.Repository.ITarifaRepository;

@Service
public class TarifaServices {

		@Autowired
		ITarifaRepository tarifaRepository;
		
		public ArrayList<TarifaModel> getTarifa(){
			return (ArrayList<TarifaModel>) tarifaRepository.findAll();
		}
		public TarifaModel saveTarifa(TarifaModel tarifa) {
			return tarifaRepository.save(tarifa);
			
		}
		public Optional<TarifaModel> getById(Long id){
			return tarifaRepository.findById(id);
		}
		public TarifaModel updateById(TarifaModel request, Long id){
			TarifaModel tarifa = tarifaRepository.findById(id).get();

			tarifa.setFecha_ini_tarifa(request.getFecha_ini_tarifa());
			tarifa.setFecha_out_tarifa(request.getFecha_out_tarifa());
			tarifa.setPrecio_tarifa(request.getPrecio_tarifa());
			
			
			
			return tarifa;
			
		}
		public Boolean deleteTarifa (Long id) {
			try {
				tarifaRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
