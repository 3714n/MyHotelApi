package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.MyHotel.Model.HistorialModel;
import com.Api.MyHotel.Repository.IHistorialRepository;

@Service
public class HistorialServices {
	@Autowired
	IHistorialRepository historialRepository;
	
	public ArrayList<HistorialModel> getHistorial(){
		return (ArrayList<HistorialModel>) historialRepository.findAll();
	}
	public HistorialModel saveHistorial(HistorialModel historial) {
		return historialRepository.save(historial);
	}
	public Optional<HistorialModel> getById(Long id){
		return historialRepository.findById(id);
	}
	public HistorialModel updateById(HistorialModel request, Long id) {
		HistorialModel historial = historialRepository.findById(id).get();
		
		
		historial.setCambio_historial(request.getCambio_historial());
		historial.setFecha_historial(request.getFecha_historial());
		
		
		return historial;
	}
	public Boolean deleteHistorial (Long id) {
		try {
			historialRepository.deleteById(id);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
}
