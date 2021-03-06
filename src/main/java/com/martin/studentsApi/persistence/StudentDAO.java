package com.martin.studentsApi.persistence;

import com.martin.studentsApi.model.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Profile("repo")
public interface StudentDAO extends CrudRepository<Student, Long>, JpaSpecificationExecutor {

    Optional<Student> findById(Long id);
    List<Student> findByStudyProgramId(Long id);
}
