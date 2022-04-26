package com.whatacite.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatacite.www.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
