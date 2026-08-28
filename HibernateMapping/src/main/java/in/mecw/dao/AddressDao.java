package in.mecw.dao;


	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.TypedQuery;

	import in_mecw_entity.Address;
	import in_mecw_entity.Student;

	public class AddressDao {
		private EntityManagerFactory emf;
		public AddressDao(EntityManagerFactory emf){
			this.emf=emf;
		}

	public String addAddress(Address a) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(a);
		et.commit();
		return "stored successfully";
	}
	public Address updateAddress(Address a ) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 et.begin();
			 a=em.merge(a);
			 et.commit();
			 return a;
		}
	public void deleteAddress(Address a ) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 et.begin();
			 em.merge(a);
			 em.remove(a);
			 et.commit();
			 
	}
	public Address findAddressByStudentId(int id) {
		EntityManager em=emf.createEntityManager();
		return em.find(Address.class, id);
	}

	}

	


