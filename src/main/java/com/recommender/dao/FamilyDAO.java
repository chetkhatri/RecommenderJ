package com.recommender.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.recommender.domain.Family;



@Repository
@Transactional
public class FamilyDAO {
	
	  public Family findByName(String firstName, String middleName, String lastName) {
		    return (Family) entityManager.createQuery(
		        "from Family where firstname = :firstName and middlename = :middleName and lastname = :lastName")
		        .setParameter("firstName", firstName)
		        .setParameter("middleName", middleName)
		        .setParameter("lastName", lastName)
		        .getSingleResult();
		  }

		
		@SuppressWarnings("unchecked")
		public List<Family> findAll() {
			return (List<Family>) entityManager.createQuery("from Family").getResultList();
		}
	  @PersistenceContext
	  private EntityManager entityManager;
}
