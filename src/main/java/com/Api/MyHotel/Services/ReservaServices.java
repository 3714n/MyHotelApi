package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Api.MyHotel.Model.ReservaModel;
import com.Api.MyHotel.Repository.IReservaRepository;

@Service
public class ReservaServices {

		@Autowired
		IReservaRepository reservaRepository;
		
		public ArrayList<ReservaModel> getReserva(){
			return (ArrayList<ReservaModel>) reservaRepository.findAll();
		}
		public ReservaModel saveReserva(ReservaModel reserva) {
			return reservaRepository.save(reserva);
			
		}
		public Optional<ReservaModel> getById(Long id){
			return reservaRepository.findById(id);
		}
		public ReservaModel updateById(ReservaModel request, Long id){
			ReservaModel reserva = reservaRepository.findById(id).get();

			reserva.setFecha_ini_reserva(request.getFecha_ini_reserva());
			reserva.setFecha_out_reserva(request.getFecha_out_reserva());
			reserva.setHora_in_reserva(request.getHora_in_reserva());
			reserva.setHora_out_reserva(request.getHora_out_reserva());
			reserva.setDetalle_reserva(request.getDetalle_reserva());
			
			
			return reserva;
			
		}
		public Boolean deleteReserva (Long id) {
			try {
				reservaRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
