package com.studentManagment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.studentManagment.Dao.StudentDao;
import com.studentManagment.Pojo.Student;

@org.springframework.stereotype.Service
public class StudentService implements Service {
 
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> loadStudents() {
		List<Student> studentList =studentDao.AllStudents();
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
          		
		studentDao.saveStudent(student);
	}

	@Override
	public Student getStudent(int id) {
		
		return studentDao.getStudent(id);
	
	}

	@Override
	public void update(Student student) {
		studentDao.update(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}

	

}
