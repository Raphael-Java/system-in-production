package com.raphaeldev.systemproduct.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.raphaeldev.systemproduct.entities.Order;

public interface OrderRepository extends JpaRepository <Order,Long>{ //registrar como componente do Spring

}