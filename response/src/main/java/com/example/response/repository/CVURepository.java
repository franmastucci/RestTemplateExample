package com.example.response.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.response.model.entity.CVUEntity;

public interface CVURepository extends JpaRepository<CVUEntity, String> {

}
