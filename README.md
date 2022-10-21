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












