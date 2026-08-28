package in.mecw.dao;



	import java.util.List;
    import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.TypedQuery;
    import in_mecw_entity.Department;
	import in_mecw_entity.Student;

	public class StudentDao {
		private EntityManagerFactory emf;
		public StudentDao(EntityManagerFactory emf){
			this.emf=emf;
		}

	public String addStudent(Student s) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(s);
		et.commit();
		return "stored successfully";
	}
	public Student updateStudent(Student s ) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 et.begin();
			 s=em.merge(s);
			 et.commit();
			 return s;
		}
	public void deleteStudent(Student s ) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 et.begin();
			 em.merge(s);
			 em.remove(s);
			 et.commit();
			 
	}
	public Student findStudentById(int id) {
		EntityManager em=emf.createEntityManager();
		return em.find(Student.class, id);
	}
	public List<Student> findAllStudent() {
		EntityManager em=emf.createEntityManager();
		TypedQuery<Student>result=em.createQuery("select s from Student s",Student.class);
		return result.getResultList();
	}
	
	}


