package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Api.MyHotel.Model.HistorialModel;

@Repository
public interface IHistorialRepository extends JpaRepository<HistorialModel, Long> {
	
	
}
