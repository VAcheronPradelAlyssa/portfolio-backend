package com.vacheronpradelalyssa.portfolio.repository;

import com.vacheronpradelalyssa.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}