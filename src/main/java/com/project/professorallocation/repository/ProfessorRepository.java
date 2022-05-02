package com.project.professorallocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professorallocation.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
	List<Professor> findByDepartmentId(Long departmentId);

	List<Professor> findByNameContaining(String name);

	List<Professor> findByNameLike(String likePattern);
}
