package edu.mum.coffee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.coffee.domain.Person;
<<<<<<< HEAD
import edu.mum.coffee.domain.Product;
=======
>>>>>>> c86621785757ba0495c0fd239a3f210b27c98405
import edu.mum.coffee.repository.PersonRepository;

@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
<<<<<<< HEAD
	
	public List<Person> getAllPerson() {
		return  personRepository.findAll() ;
	}
=======
>>>>>>> c86621785757ba0495c0fd239a3f210b27c98405

	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

	public List<Person> findByEmail(String email) {
		return personRepository.findByEmail(email);
	}

	public Person findById(Long id) {
		return personRepository.findOne(id);
	}

	public void removePerson(Person person) {
		personRepository.delete(person);
	}

}
