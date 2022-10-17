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
















