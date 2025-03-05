package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.AcompañantesModel;


@Repository
public interface IAcompañantesRepository extends JpaRepository<AcompañantesModel
,Long> {

}
