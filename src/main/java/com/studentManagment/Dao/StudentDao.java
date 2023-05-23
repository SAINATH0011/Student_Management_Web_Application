package com.studentManagment.Dao;

import java.util.List;

import org.springframework.ui.Model;

import com.studentManagment.Pojo.Student;

public interface StudentDao {
	
	
  List<Student> AllStudents();
   
  void saveStudent(Student student);
  Student getStudent(int id);

void update(Student student);

void deleteStudent(int id);
}
