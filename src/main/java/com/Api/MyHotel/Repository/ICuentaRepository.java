package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.CuentaModel;

@Repository
public interface ICuentaRepository extends JpaRepository<CuentaModel
,Long> {

}
