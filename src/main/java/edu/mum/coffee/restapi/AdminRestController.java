package edu.mum.coffee.restapi;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.coffee.domain.Address;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.PersonCreator;
import edu.mum.coffee.domain.Product;
import edu.mum.coffee.domain.User;
import edu.mum.coffee.service.OrderService;
import edu.mum.coffee.service.PersonService;
import edu.mum.coffee.service.ProductService;
import edu.mum.coffee.service.UserService;

@RestController
public class AdminRestController {

	@Resource
	private PersonService personService;

	@Resource
	private ProductService productService;

	@RequestMapping(value = "/listOfProducts", method = RequestMethod.GET)
	public List<Product> showListOfProduct() {
		List<Product> listProducts = productService.getAllProduct();
		return listProducts;
	}

	@RequestMapping(value = "/listOfPersons", method = RequestMethod.GET)
	public List<Person> showListOfPersons() {
		List<Person> listPersons = personService.getAllPerson();
		return listPersons;
	}

}