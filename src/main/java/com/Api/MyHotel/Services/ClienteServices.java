package com.Api.MyHotel.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.MyHotel.Model.ClienteModel;
import com.Api.MyHotel.Repository.IClienteRepository;

@Service
public class ClienteServices {

		@Autowired
		IClienteRepository clienteRepository;
		
		public ArrayList<ClienteModel> getCliente(){
			return (ArrayList<ClienteModel>) clienteRepository.findAll();
		}
		public ClienteModel saveCliente(ClienteModel cliente) {
			return clienteRepository.save(cliente);
			
		}
		public Optional<ClienteModel> getById(Long id){
			return clienteRepository.findById(id);
		}
		public ClienteModel updateById(ClienteModel request, Long id){
			ClienteModel cliente = clienteRepository.findById(id).get();
			
			cliente.setNombre_cliente(request.getNombre_cliente());
			cliente.setApellido_cliente(request.getApellido_cliente());
			cliente.setTipo_id_cliente(request.getTipo_id_cliente());
			cliente.setNumero_id_cliente(request.getNumero_id_cliente());
			cliente.setTelefono_cliente(request.getTelefono_cliente());
			cliente.setCorreo_cliente(request.getCorreo_cliente());
			cliente.setProfesion_cliente(request.getProfesion_cliente());
			cliente.setNacionalidad_cliente(request.getNacionalidad_cliente());
			
			return cliente;
			
		}
		public Boolean deleteCliente (Long id) {
			try {
				clienteRepository.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
}
