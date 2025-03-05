package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.ReservaModel;

@Repository
public interface IReservaRepository extends JpaRepository<ReservaModel
,Long> {

}
