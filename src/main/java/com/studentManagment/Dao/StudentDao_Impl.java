package com.studentManagment.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.studentManagment.Pojo.Student;
import com.studentManagment.RowMapper.Student_RowMapper;

@Repository
public class StudentDao_Impl implements StudentDao {
 
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Student> AllStudents() {
		
		String query = "select * from students";
	List<Student> studentList =	jdbcTemplate.query(query, new Student_RowMapper());
		
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
     		
	Object[] args =	{student.getName(),student.getMobile(),student.getCountry()};
		
	    String query = "insert into students(name,mobile,country) values(?,?,?)";
	    
	    jdbcTemplate.update(query,args);
	    
	    System.out.println("One Record is Updated ");
	    
	}

	@Override
	public Student getStudent(int id) {
		String query = "select * from students where id=?";
	   Student record=	jdbcTemplate.queryForObject(query, new Student_RowMapper() ,id);
		
		return record;
	}

	@Override
	public void update(Student student) {

		 String query = "update students set name=?,mobile=?,country=? where id=?";
		 
		 jdbcTemplate.update(query, student.getName(),student.getMobile(),student.getCountry(),student.getId());
		 System.out.println("One Record is Updated");
	}

	@Override
	public void deleteStudent(int id) {
      
	String query = "delete from students where id =?";
	jdbcTemplate.update(query,id);
	}

}
