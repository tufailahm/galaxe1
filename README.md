JDK 1.8
Eclipse IDE


--platform

object (OOPS)


class
objects

ABSTRACTION
ENCAPSULATION
POLYMORPHISM
INHERITANCE


STATE
BEHAVIOR

Employee
	
	employeeId
	employeeName
	

	completeProjects()		-- behavior	

Language Fundamentals, Interfaces, OO Programming with Java

loops	
if else
switch


packages
==========


public class Welcome {
	public void accept() {
		System.out.println("Accept called");
	}
	public void display() {
		accept();
		System.out.println("Display called");
	}
	public static void main(String []abc) {
		System.out.println("Welcome");
		Welcome welcome = new Welcome();
		welcome.display();
		Bye bye = new Bye();
		bye.sayHello();
	}
}
class Bye
{
	public void sayHello() {
		System.out.println("Say Hello called ");
	}
	public static void main(String[] args) {
		System.out.println("Bye main called");
	}
}


Code Structure in java
Statements in methods

Variables scopes
==================
static





==========Access specifiers


public
private 
protected
default







https://github.com/tufailahm/galaxe1










Constructors
==============

special method which has the same name as the class name
it does not have any return type . not even void
It gets called automatically whenever you create an object.
It is used to initialize the member variables


this keyword
==============



String class
=================

java.lang
array of characters
immutable - cannot be changed
String name = "Kalpana";
String name = new String("Kalpana");
































































String
StringBuffer
StringBuilder

Overloading
================


Var args
JDK 1.5


Inheritance
=======================
extends



https://github.com/tufailahm/galaxe1



Inheritance
Overriding
abstract class
===================




interfaces
--------------
pure abstraction
by default all rge methods in an interface are abstract
-- constants	(final)

GC


Object class and its methods

Exception Handling



Customer
	customerId
	customerName
	customerAddress
	billAmount



Exception Handling
=====================

Compilation
Logical error
Runtime errors

Why exception handling is required ?

1) to end program gracefully
2) to give proper message
3) do some closing operations




try
catch
finally



Throwable



throw		- is used to bring exception


throws
User defined exception
















File I/O

JAVA.IO 


file

File IO, Threads


Streams


InputStream	- Reading
OutputStream 	- Writing



Reader
Writer












Thread
===============================
Process within a process

by extending the Thread class	- java.lang
	run()

by implemntation Runnable interface	- java.lang
	run()


#1: 3
#3: 3
#3: 2
#3: 1
#2: 3
#2: 2
#2: 1
#1: 2
#1: 1



Thread safety


Collections
==================
framework used for different data structures
reduces programming efforts
easy learning curve
performance of your app will be good
already tested

java.util

<I>					Collection

<I>	List				Set
	accept duplicate values		not accept duplicate values


<C>	ArrayList	(Not sync)		HashSet - - no order is guranteed
	LinkedList			TreeSet - sorted
	Vector	(Sync and Thread safe)	LinkedHashSet -as it is 



Iterator



Collections	- class
Lots of useful static methods





Map
Anonymous Inner classes
Comparator
Comparable
New Features of JDK1.8
Design Principles
Design Patterns


HashMap	- no order
TreeMap	-sorted
LinkedHashMap	-  as it is


Comparator	- jav.util		compare(p1,p2)

Comparable	- java.lang	- compareTo(p1);



















JDK5
jdk1.8 new features
==================

Lambdas Expression
only works with functional interfaces
-- interfaces with a single method
interface Calculation
{
	void operation(int num1,int num2);
}








Design Principle
Design Patterns




Hibernate - ORM


something.save(product);

something.update(product);



Use case :  We have to store product info in db.


galaxeblr	- DB - Mysql

https://github.com/tufailahm/galaxe1/blob/master/hibernate_jar-files.zip




Hibernate - Day2
====================

Product App
Problem - 
Solution
HQL - Hibernate Query Language - similar to SQL
=========================
select * from Product;	- Query

Criteria

Lifecycle of Hibernate
Sync
Inheritance Mapping
===================


Spring
=============
framework
Important terms
Autowiring - The process by which Spring identifies dependencies and matches and populates them.

Bean - A Spring bean is an object that is instantiated, created, and managed by the IoC container. Beans are the backbone of an application.

Dependency injection - A programming design pattern that makes code loosely coupled, meaning that any change in the application of one, will not affect the other.

Inversion of control (IoC) - Taking control away from the class and giving it to the Spring Framework.

Inversion of control container - This is the core of the Spring Framework where objects are created, wired together, configured, and managed throughout their life cycle.


Spring
---------------
Lots of configuration

Spring Boot
--------------
Zero configuration
Embedded Tomcat
Just run


Order
Review
OrderDetails


getDetails()



=========

product-app-final2

String Data JPA
Spring Web
Devtools
MySQL

localhost:9090/welcome


==============
Rest Parameters

@PathVariable


HTTP methods
------------------

GET	-retrieve/fetch 
POST	-save/create
PUT	-update/modify
DELETE	-remove



spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/galaxe
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=create


Use case : Create a product back end app that should serve the front end app

Way 1

http:\\localhost:9090/product/getProduct/101
http:\\localhost:9090/product/getAllProduct


http:\\localhost:9090/product/saveProduct
http:\\localhost:9090/product/updateProduct

http:\\localhost:9090/product/deleteProduct


Way2 
http://localhost:9090/product	- GET
http://localhost:9090/product/101	- GET
http://localhost:9090/product/101	- 






http://localhost:9090/product	- POST 
http://localhost:9090/product	- PUT


==============================

JPA

CrudRepository


Two requirements :
2) If qoh or price is negative , we dont want to insert	- resolved

1) If duplicate id is given , this is to handled properly


Http Status Codes

200

300

400

500

ResponseEntity

@CrossOrigin(origins = "http://localhost:4200")


http://localhost:9090/product







1) If duplicate id is given , this is to handled properly
--------------------------------------------------------------------

ResponseEntity


================================
Day 13
=========
-> Http Status Codes
Spring JPA keywords
Lombok
AOP 
Actuator

Use case : If duplicate id is given , this is to handled properly

404
400
500
200
204

ResponseEntity



Use case : If the product already exists , then appropriate message and status code also to be sent
Lombok
=============
Third party library which reduces boilerplate code of model class.
JPA keywords
==============

use case : 
http://localhost:9090/product/searchByProductName/Car



public List<Product> findByProductName(String productName);
public List<Product> findByPrice(int price);	
public List<Product> findByPriceBetween(int min,int max);	



use case : http://localhost:9090/product/searchByProductPriceRange/100/300


Day 14
==============
AOP (Aspect Oriented Programming )
====================================
Cross cutting concerns

security
logging
transaction


@Before
@After
@Around
@Throws



Point cut expressions

*

Use case : I want to do logging for every methods of service impl 


Actuator
Microservices
Spring Data Rest





Monolith vs Microservices


Small team ?
Dynamic team ?
Diverse tech teams ?

amazon
	products		http://localhost:9090/product
	carts
	orders
	wishlist
	reviews		http://localhost:9091/reviews

http://localhost:9091/reviews	- GET
http://localhost:9091/reviews/1	- GET
http://localhost:9091/reviews	- POST
http://localhost:9091/reviews/1	- PUT
http://localhost:9091/reviews/1	- DELETE
	
	primevideo
	delivery


Spring Data Rest
--------------------
Rest Repositories




Spring Actuator
===============

by which monitoring your app

Use case : I want to see how many beans are there in application













Spring Security - Demo1










package com.training;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello and welcome";
	}
}



==========

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{

	@Autowired
	private MyUserDetailsService myUserDetailService = null;

		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			
			auth.userDetailsService(myUserDetailService);
		}
	//No hashing is required
		@Bean
		public PasswordEncoder passwordEncoder() {
			return NoOpPasswordEncoder.getInstance();
		}
}


==================

package com.training;
import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User("tufail", "ahmed", new ArrayList<>());
	}

	
}

==================
** From the previous program, We don’t need MyUserDetailsService and SecurityConfigurer.java
Custom login form and adding some fine grained permissions :

Security - Demo2

pom.xml

<!-- JSTL tag lib -->
		<dependency>
			<groupId>javax.servlet.jsp.jstl</groupId>
			<artifactId>javax.servlet.jsp.jstl-api</artifactId>
			<version>1.2.1</version>
		</dependency>

		<dependency>
			<groupId>taglibs</groupId>
			<artifactId>standard</artifactId>
			<version>1.1.2</version>
		</dependency>

		<!-- Tomcat for JSP rendering -->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>


application.properties

spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp


======================

Create /src/main/webapp/WEB-INF/views/login.jsp

==========================

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value=""/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your credentials</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>

<body>

<div class="container">

    <form method="POST" action="/login" class="form-signin">
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ">
            <span></span>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span></span>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
        </div>

    </form>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script></body>
</html>



===============================================


package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class EmployeeSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/index").hasAnyRole("USER", "ADMIN")
				.antMatchers("/viewAllProducts").hasAnyRole("USER", "ADMIN").antMatchers("/addProduct")
				.hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll()
				.and().logout().permitAll();

		http.csrf().disable();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		authenticationMgr.inMemoryAuthentication()
				.withUser("admin").password("admin").authorities("ROLE_USER").and()
				.withUser("tufail").password("ahmed").authorities("ROLE_USER", "ROLE_ADMIN");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}


=================

package com.training;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello and welcome";
	}
	
}


UserDetailService

loadByUsername

==================
package com.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";
	}

}


=======================

Day 15

Communicate with other services


localhost:9090/product/191


localhost:9091/reviews

Use case : I want to fetch a product by giving productid 

FeignClient
















@Bean
Spring Security
Spring MVC 



Git
SCM
File I/O








==================================
Day 15

Communication between services
=======================
http://localhost:9090/product
http://localhost:9091/reviews	-

Use case : Reviews services needs to fetch product using product id

OpenFeign - FeignClient - 























Spring Security

Use case : We want to secure or URI 
	http://localhost:9090/product	


@Bean
Spring MVC
Spring Security using customer login form



Day 16
Dev Ops Essentials
Git SCM







Spring MVC
================
MVC - Model View Controller

@RestController	- JSON			--> Application
@Controller	- Views(JSP/HTML)		--> Users


Step 1: Create a project with lombok,web, devtools
Step 2: Configure mvc 

a) update pom.xml
<dependency>
			<groupId>javax.servlet.jsp.jstl</groupId>
			<artifactId>javax.servlet.jsp.jstl-api</artifactId>
			<version>1.2.1</version>
		</dependency>

		<dependency>
			<groupId>taglibs</groupId>
			<artifactId>standard</artifactId>
			<version>1.1.2</version>
		</dependency>

		<!-- Tomcat for JSP rendering -->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>


b)
application.properties
server.port=9094
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp


c)
Right click on your project and create folder
 /src/main/webapp/WEB-INF/views





Use case : I want implement fine grained authorization and authentication - Custom Login Form

1) Add Spring security dependency
2) Create login.jsp
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value=""/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your credentials - Galaxe LoginPage</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>

<body>

<div class="container">

    <form method="POST" action="/login" class="form-signin">
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ">
            <span></span>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span></span>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
        </div>

    </form>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script></body>
</html>

3. Create LoginController.java
package com.training.pms.galaxe.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";
	}

}

4. package com.training.pms.galaxe.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class EmployeeSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/index").hasAnyRole("USER")
				.antMatchers("/viewAllProducts").hasAnyRole("USER", "ADMIN")
				.antMatchers("/addProduct").hasAnyRole("ADMIN")
				.anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll()
				.and().logout().permitAll();

		http.csrf().disable();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		authenticationMgr.inMemoryAuthentication()
				.withUser("yash").password("yash123").authorities("ROLE_USER").and()
				.withUser("tufail").password("ahmed123").authorities("ROLE_USER", "ROLE_ADMIN");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}

5. Updated HomeController
package com.training.pms.galaxe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


	@GetMapping("index")			//   http://localhost:9094/home
	public String home() {
		return "ashraf";				///WEB-INF/views/ashraf.jsp
	}	

	@GetMapping	//   http://localhost:9094
	public String hello() {
		return "index";				///WEB-INF/views/index.jsp
	}	
	
	@GetMapping("viewAllProducts")			//   http://localhost:9094/home
	public String jasdasd() {
		return "viewAllProducts";				///WEB-INF/views/ashraf.jsp
	}	
	
	@GetMapping("addProduct")			//   http://localhost:9094/home
	public String levin() {
		return "addProducts";				///WEB-INF/views/ashraf.jsp
	}	
}



6. Create jsps as shonw above.


































