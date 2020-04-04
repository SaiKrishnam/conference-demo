package com.example.spring.demoConf.repositories;

import com.example.spring.demoConf.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {

}