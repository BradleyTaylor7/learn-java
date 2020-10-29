# Learning Java
I want to relearn Java and its fundamentals. I will be going back to the very beginning to relearn Java. I will be following a tutorial by amigoscode to do this.

## What I will be going over:
- [x] First Java App
    - Creating a Java project in IntelliJ and printing "First Java App" when running main class
- [x] Understanding Java Syntax
- [x] Compiling with Javac and Byte Code
    - In terminal I did "cd src/com/bradleytaylor/" then "javac Main.java" which then created the Main.class file. The javac command allows you to compile a java source file into a bytecode class file. The Java Virtual Machine (JVM) understands the bytecode when I want to execute the java file in terminal.
- [x] Running Java programs from Terminal
    - To execute the Main java file the file must be compiled as shown in the step before. First go into the src file, "cd src" then the execute Main from terminal, "java com.bradleytaylor.Main"  
- [x] Compile and Run with IntelliJ
    - Much simpler way of compiling and executing a java file. Does exactly the same as the last step but with a click of the "Play Button"
- [x] Packages
    - A package is a directory structure that allows you to group classes together. Packages can also be nested.
- [x] Comments
    - Very simple, // allows you to comment a single line and a multi line comment you would use /* and end with */
- [x] Variables
    - Variables are used to store data values.
- [x] Creating Variables
    - Defined variables using int and String data types.
- [x] Primitive Data Types
    - Primitive data type specifies the size and type of variable values. Byte, Short, Int and Long allows you to store whole numbers, the only difference is the size in the memory. Furthermore _ can be used to separate longer numbers just like , would do normally. Float and Double allows you to store decimal numbers, the only differences are the size in memory and decimal digits stored. Boolean allows you to store true or false values. Char allows you to store single characters.
    ![Primitive Data Types](https://github.com/BradleyTaylor7/learn-java/blob/master/PrimitiveDataTypes.png)
- [x] Reference Data Types
    - String is one example of a reference data type which allows you to store a sequence of characters. Lots of built in data types that comes with the JRE. For example, LocalDate.
- [x] Difference Between Primitives and Reference Types
    - int a = 10 and int b = a. a and b is stored in its own memory address. With primitive data type variables are given different memory allocations. When a is modified to equal 100, b will not change as b has a different memory address.
    - Created Person("Bradley") object with reference Bradley and another reference Taylor = Bradley. Both Bradley and Taylor are pointing to the initial object. If reference Bradley is modified, reference Taylor will also be modified as it point to the same reference. This works the other way around so if you modify Taylor, Bradley will be modified too. 
- [x] The String Class
    - name is a object of type String. Objects have behaviours associated with them. Behaviour methods such as toUpperCase(), toLowerCase(), charAt(), contains(), equals() etc.
- [x] Packages and Import Keyword
- [x] Reserved Keywords
    - Reserved keywords are used for the language itself. For example, package, public, class, static, void etc. These words cannot be used for variable names etc.
- [x] Arithmetic Operations
    - Addition +, subtraction -, multiplication *, division /, modulus %. BODMAS is also taken into account.
- [x] The Math Class
    - The math class contains many mathematical methods such as pow(), min(), max(), abs(), sqrt() etc. Using (int) is called casting to an integer.  
- [x] Comparison Operators
    - Less than <, less than equal to <=, greater than >, greater than equal to >=, equal to ==, not equal to !=. Referred to as boolean expressions as they return true or false.
- [x] Logical Operators
    - AND operator &&, OR operator || and you can flip the value using !.
    ![Logical Operators](https://github.com/BradleyTaylor7/learn-java/blob/master/LogicalOperators.png)
- [x] If Statements
- [x] Ternary Operator
    - Using an ternary operator is another way of using an if statement. ? acts as if and : acts as else. 
- [x] Switch Statements
    - Switch statements is a cleaner way to write if statements. If a case meets the argument criteria then break is used so that the rest of the switch statement is not being used.
- [x] Arrays
    - [] are used to define an array. Size of array is 2 but index starts at 0. When you initialise the size of the array you cannot change it.
- [x] Arrays and Indexes
    - You can retrieve an element from an array by giving the index of that element. Indexes start from 0 not 1.
- [x] ++ & --
    - ++ is used to increment by 1. -- is used to decrement by 1.
- [ ] Enhanced For Loop
- [ ] Break and Continue
- [ ] While Loop
- [ ] Do While
- [ ] Taking User Input 
- [ ] Methods
- [ ] Understanding Methods
- [ ] User Defined Methods
- [ ] Classes and Objects
- [ ] Creating Classes
- [ ] Creating Objects
- [ ] Printing Object Attributes

## What I will be using:
* IntelliJ IDEA
* Java 11
  * adoptopenjdk11