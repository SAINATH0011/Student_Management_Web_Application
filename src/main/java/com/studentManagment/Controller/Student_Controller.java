package com.studentManagment.Controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentManagment.Dao.StudentDao;
import com.studentManagment.Pojo.Student;
import com.studentManagment.Service.Service;
import com.studentManagment.Pojo.Student;

@Controller
public class Student_Controller {

	
	@Autowired
	private Service service;
	
     
	@GetMapping("/showStudents")
	public String showStudentList(Model model)
	{
		List<Student> studentList = service.loadStudents();
		  
		model.addAttribute("students",studentList);
		
		return "student-list";
	}
	
	
	@GetMapping("/add_Student")
	public String addStudent(Model model)
	{
		Student studentDto = new Student();
		System.out.println(studentDto);
		model.addAttribute("student",studentDto);
		
		return "add-student";
	}
	
   
	@PostMapping("/save-student")
      public String saveStudent(Student student)
	  {
		//
		if(student.getId()==0)
		{
			service.saveStudent(student);
		}
		else
		{
			service.update(student);
		}
		
		
		System.out.println(student);
		
		  return "redirect:/showStudents";
	  }
	
	
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId")int id,Model model)
	{


		Student student= service.getStudent(id);
		System.out.println(student);
		

		
		model.addAttribute("student",student);

		
 		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId")int id)
	{

            service.deleteStudent(id);
		
		
 		return "redirect:/showStudents";
	}
	
	
	
	
   
}
