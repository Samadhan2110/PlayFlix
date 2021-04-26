package com.samlab.PlayFlix.Register.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samlab.PlayFlix.Register.model.Register;

public interface RegisterRepository extends JpaRepository <Register,Long>{

}
