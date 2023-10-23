## Solid principles
Tip: For following code start from `Main.java` file in each folder.

### S - Single responsibility principle
- Class should have single responsibility, only one reason to change the class.
- It should be short and precise (to the point).

**Explanation of Code example:**

We have UserController class in badpath which has a responsibility of facilitating following functionalities
  1. taking json object converting it to User POJO
  2. If user is valid then store/save it

Remember its ***objective is to facilitate*** validations not actually doing validations. In badpath we have methods doing 
validations for User object.

*[This might look optional but can be a good practice]*
Also, we are storing the user if valid and having direct dependency on Store class, which can also be improved. 
If in future we change something in store class our controller might get impacted. Let's say we are using another 
datastore and we want to make some change that impacts controller. Inshort we should have wrapper over Store to prevent 
this from happening.

In happypath these problems are solved by separating responsibilities.


### O - Open Close Principle
You can extend what a class does, but you shouldn't have to modify the class itself to make it work with new features. 
This makes your code more flexible and easier to maintain.

**Explanation of Code example:**

We have different Types Employee and a Payroll system. BadPath scenario shows the way classes are written are difficult to maintain as requirements grows.
HappyPath Scenario is solution following OCP.

In this *badpath scenario*, if you want to introduce bonuses or handle different types of employees (e.g., full-time, part-time), 
you might be tempted to modify the PayrollSystem class. 
This violates the Open-Closed Principle.

In this *happypath scenario*, the Employee interface is open for extension. 
You can add new types of employees (e.g., PartTimeEmployee) without modifying the PayrollSystem class. 
The PayrollSystem depends on the abstraction provided by the Employee interface and its concrete implementations.
