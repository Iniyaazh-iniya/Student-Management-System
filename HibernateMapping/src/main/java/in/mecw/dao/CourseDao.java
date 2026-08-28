package in.mecw.dao;



	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Query;

	import in_mecw_entity.Course;
	import in_mecw_entity.Student;

	public class CourseDao{
		
		 EntityManagerFactory emf;
	public CourseDao(EntityManagerFactory emf) {
	    this.emf = emf;
	}


	public void addCourseDAO(Course c) {

	    EntityManager em = emf.createEntityManager();

	    em.getTransaction().begin();

	    em.persist(c);

	    em.getTransaction().commit();

	    em.close();
	}

	// 2. Update course
	public void updateCourseDAO(Course c) {

	    EntityManager em = emf.createEntityManager();

	    em.getTransaction().begin();

	    em.merge(c);

	    em.getTransaction().commit();

	    em.close();
	}

	// 3. Delete course
	public void deleteCourseDAO(int id) {

	    EntityManager em = emf.createEntityManager();
	    
	    em.getTransaction().begin();

	    Course c = em.find(Course.class, id);

	    if (c != null) {
	        em.remove(c);
	    }

	    em.getTransaction().commit();

	    em.close();
	}

	// 4. Find course by ID
	public Course findCourseByIdDAO(int id) {

	    EntityManager em = emf.createEntityManager();

	    Course c = em.find(Course.class, id);

	    em.close();

	    return c;
	}

	// 5. Display all courses
	public void displayAllCoursesDAO() {

	    EntityManager em = emf.createEntityManager();

	    Query query = em.createQuery("select c from Course c");

	    List<Course> courses = query.getResultList();

	    for (Course c : courses) {
	        System.out.println(
	            c.getCourseId() + " " +
	            c.getCourseName() + " " +
	            c.getDuration()
	        );
	    }

	    em.close();
	}

	// 6. Find course's department
	public void findCourseDepartmentDAO(int id) {

	    EntityManager em = emf.createEntityManager();

	    Course c = em.find(Course.class, id);

	    if (c != null) {
	        System.out.println(
	            "Department: " +
	            c.getDept().getDepartmentName()
	        );
	    }

	    em.close();
	}

	// 7. Find all students in a course
	public void findAllStudentsInCourseDAO(int id) {

	    EntityManager em = emf.createEntityManager();

	    Course c = em.find(Course.class, id);

	    if (c != null) {

	        List<Student> students = c.getStudents();

	        for (Student s : students) {
	            System.out.println(
	                s.getStudentId()+" "+
	                s.getName()
	            );
	        }
	    }

	    em.close();
	}
	
	}


