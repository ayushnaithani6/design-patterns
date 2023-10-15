## Solid principles

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

