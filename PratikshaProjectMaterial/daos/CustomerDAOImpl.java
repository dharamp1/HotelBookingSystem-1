package com.fujitsu.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fujitsu.beans.Customer;

@Repository
@Transactional
 public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCutomerById(int customer_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
