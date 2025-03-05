package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.ConsumoModel;

@Repository
public interface IConsumoRepository extends JpaRepository<ConsumoModel
,Long> {

}
