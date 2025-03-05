package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.MyHotel.Model.ControlModel;
import com.Api.MyHotel.Repository.IControlRepository;

@Service
public class ControlServices {

		@Autowired
		IControlRepository controlRepository;
		
		public ArrayList<ControlModel> getControl(){
			return (ArrayList<ControlModel>) controlRepository.findAll();
		}
		public ControlModel saveControl(ControlModel control) {
			return controlRepository.save(control);
			
		}
		public Optional<ControlModel> getById(Long id){
			return controlRepository.findById(id);
		}
		public ControlModel updateById(ControlModel request, Long id){
			ControlModel control = controlRepository.findById(id).get();

			control.setTipo_control(request.getTipo_control());
			control.setFecha_control(request.getFecha_control());

			
			return control;
			
		}
		public Boolean deleteControl (Long id) {
			try {
				controlRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
