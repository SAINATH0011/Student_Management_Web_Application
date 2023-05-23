package com.studentManagment.Service;

import java.util.List;

import com.studentManagment.Pojo.Student;

public interface Service {
   
  List<Student>  loadStudents()	;

void saveStudent(Student student);
  Student getStudent(int id);

void update(Student student);

void deleteStudent(int id);
}
