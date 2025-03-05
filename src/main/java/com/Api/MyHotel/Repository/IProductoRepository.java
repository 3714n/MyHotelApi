package com.Api.MyHotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.MyHotel.Model.ProductoModel;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoModel
,Long> {

}
