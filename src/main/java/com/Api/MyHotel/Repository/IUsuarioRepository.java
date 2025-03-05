package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.UsuarioModel;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioModel
,Long> {

}
