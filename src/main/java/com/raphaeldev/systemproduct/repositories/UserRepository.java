package com.raphaeldev.systemproduct.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.raphaeldev.systemproduct.entities.User;

public interface UserRepository extends JpaRepository <User,Long>{ //registrar como componente do Spring

}
