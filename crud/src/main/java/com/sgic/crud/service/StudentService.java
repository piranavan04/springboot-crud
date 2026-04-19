package com.sgic.crud.service;


import com.sgic.crud.entity.Student;
import com.sgic.crud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    //CREATE
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    //READ ALL
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    //READ BY ID
    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    //UPDATE
    public Student updateStudent(Long id, Student student) {
        Student existingStudent = repository.findById(id).orElse(null);

        if (existingStudent != null) {
            existingStudent.setFirst_name(student.getFirst_name());
            existingStudent.setLast_name(student.getLast_name());
            existingStudent.setEmail(student.getEmail());

            return repository.save(existingStudent);
        }
        return null;
    }

    //DELETE
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }



}
