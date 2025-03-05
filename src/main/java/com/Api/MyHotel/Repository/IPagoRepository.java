package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.PagoModel;

@Repository
public interface IPagoRepository extends JpaRepository<PagoModel
,Long> {

}
