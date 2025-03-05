package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.ControlModel;


@Repository
public interface IControlRepository extends JpaRepository<ControlModel
,Long> {

}
