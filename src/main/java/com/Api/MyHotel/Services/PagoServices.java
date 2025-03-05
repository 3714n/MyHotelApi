package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Api.MyHotel.Model.PagoModel;
import com.Api.MyHotel.Repository.IPagoRepository;

@Service
public class PagoServices {

		@Autowired
		IPagoRepository pagoRepository;
		
		public ArrayList<PagoModel> getPago(){
			return (ArrayList<PagoModel>) pagoRepository.findAll();
		}
		public PagoModel savePago(PagoModel pago) {
			return pagoRepository.save(pago);
			
		}
		public Optional<PagoModel> getById(Long id){
			return pagoRepository.findById(id);
		}
		public PagoModel updateById(PagoModel request, Long id){
			PagoModel pago = pagoRepository.findById(id).get();

			pago.setMonto_pago(request.getMonto_pago());
			pago.setFecha_pago(request.getFecha_pago());
			return pago;
			
		}
		public Boolean deletePago (Long id) {
			try {
				pagoRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
