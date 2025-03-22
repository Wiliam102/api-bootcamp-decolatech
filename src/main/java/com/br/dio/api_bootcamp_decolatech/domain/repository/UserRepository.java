package com.br.dio.api_bootcamp_decolatech.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.dio.api_bootcamp_decolatech.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
