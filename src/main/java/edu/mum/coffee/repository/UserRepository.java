package edu.mum.coffee.repository;

<<<<<<< HEAD
=======
import java.util.Date;
>>>>>>> c86621785757ba0495c0fd239a3f210b27c98405
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.User;

public interface UserRepository extends JpaRepository<User, String>{
	

	public User findByUsername(String username);
=======
import edu.mum.coffee.domain.Order;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.Product;

public interface UserRepository extends JpaRepository<Order, Integer>{
	
	List<Order> findDistinctOrderByOrderLines_Product(Product product);
	List<Order> findOrderByPerson(Person person);
	List<Order> findOrderByOrderDateBetween(Date minDate, Date maxDate);
	

>>>>>>> c86621785757ba0495c0fd239a3f210b27c98405
}
