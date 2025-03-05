package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.MyHotel.Model.ConsumoModel;
import com.Api.MyHotel.Repository.IConsumoRepository;

@Service
public class ConsumoServices {

		@Autowired
		IConsumoRepository consumoRepository;
		
		public ArrayList<ConsumoModel> getConsumo(){
			return (ArrayList<ConsumoModel>) consumoRepository.findAll();
		}
		public ConsumoModel saveCuenta(ConsumoModel consumo) {
			return consumoRepository.save(consumo);
			
		}
		public Optional<ConsumoModel> getById(Long id){
			return consumoRepository.findById(id);
		}
		public ConsumoModel updateById(ConsumoModel request, Long id){
			ConsumoModel consumo = consumoRepository.findById(id).get();

			consumo.setCantidad_consumo(request.getCantidad_consumo());
			return consumo;
			
		}
		public Boolean deleteConsumo (Long id) {
			try {
				consumoRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
