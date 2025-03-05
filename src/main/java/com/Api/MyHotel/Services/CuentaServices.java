package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.MyHotel.Model.CuentaModel;
import com.Api.MyHotel.Repository.ICuentaRepository;

@Service
public class CuentaServices {

		@Autowired
		ICuentaRepository cuentaRepository;
		
		public ArrayList<CuentaModel> getCuenta(){
			return (ArrayList<CuentaModel>) cuentaRepository.findAll();
		}
		public CuentaModel saveCuenta(CuentaModel cuenta) {
			return cuentaRepository.save(cuenta);
			
		}
		public Optional<CuentaModel> getById(Long id){
			return cuentaRepository.findById(id);
		}
		public CuentaModel updateById(CuentaModel request, Long id){
			CuentaModel cuenta = cuentaRepository.findById(id).get();

			cuenta.setEstado_cuenta(request.getEstado_cuenta());
			
			
			return cuenta;
			
		}
		public Boolean deleteCuenta (Long id) {
			try {
				cuentaRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
