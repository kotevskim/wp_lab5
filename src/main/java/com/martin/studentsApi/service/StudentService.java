package com.martin.studentsApi.service;

import com.martin.studentsApi.model.Student;
import com.martin.studentsApi.model.StudyProgram;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Iterable<Student> findAllStudents();

    Student findStudentById(Long id);

//    Student saveStudent(Long id, String firstName, String lastName, String studyProgramName);
    Student saveStudent(Student student);

    Student updateStudent(Long id, Student student);

    void deleteStudentById(Long id);

//    Student editStudent(Long index, Optional<String> firstName, Optional<String> lastName, Optional<String> studyProgramName);

    List<Student> findStudentsByStudyProgramId(Long id);

    void validateStudentId(Long id);


}
