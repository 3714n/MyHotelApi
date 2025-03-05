package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.TarifaModel;

@Repository
public interface ITarifaRepository extends JpaRepository<TarifaModel
,Long> {

}
