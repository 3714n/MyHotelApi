package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Api.MyHotel.Model.HabitacionModel;

@Repository
public interface IHabitacionRepository extends JpaRepository<HabitacionModel, Long> {
	
	
}
