package com.example.wly_demo.Service;

import com.example.wly_demo.dao.Student;
import com.example.wly_demo.dto.StudentDTO;

public interface StudentService {
    StudentDTO getStudentById(long id);

    Long addNewStudent(StudentDTO studentDTO);

    void deleteStudentById(long id);

    StudentDTO updateStudnetById(long id, String name, String email);
}
