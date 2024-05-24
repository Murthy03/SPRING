package store;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {
	@PersistenceContext
	private EntityManager em;

	public List<Employee> findAll() {
		return em.createQuery("SELECT e FROM Employee e").getResultList();
	}
}
