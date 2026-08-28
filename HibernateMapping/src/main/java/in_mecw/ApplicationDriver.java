package in_mecw;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import in.mecw.dao.AddressDao;
import in.mecw.dao.CourseDao;
import in.mecw.dao.DepartmentDao;
import in.mecw.dao.StudentDao;
import in.mecw.dao.TeacherDao;
import in_mecw_entity.Address;
import in_mecw_entity.Course;
import in_mecw_entity.Department;
import in_mecw_entity.Student;
import in_mecw_entity.Teacher;

public class ApplicationDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
//		DepartmentDao deptDao=new DepartmentDao(emf);
//		Department d=new Department();
//		d.setDepartmentId(1);
//		d.setDepartmentName("CSE");
//		d.setLocation("Thanjavur");
//		List<Course>courses=new ArrayList<Course>();
//		Course c1=new Course(1,"DataScience",4);
//		Course c2=new Course(2,"DataAnalytics",4);
//		Course c3=new Course(3,"AIML",4);
//		courses.add(c1);
//		courses.add(c2);
//		courses.add(c3);
		
//		d.setCourses(courses);
//		deptDao.addDepartment(d);
		
//	StudentDao StudentDao=new StudentDao(emf);
//		Student s=new Student();
//		s.setAge(20);
//		s.setEmail("ini@gmail.com");
//		s.setName("dev");
//		s.setPhone(904370);
//		s.setStudentId(52);
//		StudentDao.addStudent(s);
//		
//TeacherDao TeacherDao=new TeacherDao(emf);
//Teacher t=new Teacher();
//t.setEmail("ini826@gmail.com");
//t.setName("Visha");
//t.setSpecialization("Java");
//
//t.setTeacherId(102);
//TeacherDao.addTeacher(t);
		
		CourseDao cdeo=new CourseDao(emf);
		Course c=new Course();
		c.setCourseId(1);
		c.setCourseName("Data Science");
		c.setDuration(4);
		cdeo.addCourseDAO(c);
}
}