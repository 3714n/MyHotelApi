package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.MyHotel.Model.HabitacionModel;
import com.Api.MyHotel.Repository.IHabitacionRepository;

@Service
public class HabitacionServices {
	@Autowired
	IHabitacionRepository habitacionRepository;
	
	public ArrayList<HabitacionModel> getHabitacion(){
		return (ArrayList<HabitacionModel>) habitacionRepository.findAll();
	}
	public HabitacionModel saveHabitacion(HabitacionModel habitacion) {
		return habitacionRepository.save(habitacion);
	}
	public Optional<HabitacionModel> getById(Long id){
		return habitacionRepository.findById(id);
	}
	public HabitacionModel updateById(HabitacionModel request, Long id) {
		HabitacionModel habitacion = habitacionRepository.findById(id).get();
		
		
		habitacion.setCodigo_habitacion(request.getCodigo_habitacion());
		habitacion.setPrecio_habitacion(request.getPrecio_habitacion());
		habitacion.setDescripcion_habitacion(request.getDescripcion_habitacion());
		habitacion.setEstado_habitacion(request.getEstado_habitacion());
		
		return habitacion;
	}
	public Boolean deleteHabitacion (Long id) {
		try {
			habitacionRepository.deleteById(id);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
}
