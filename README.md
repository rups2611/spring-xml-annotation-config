
# Spring XML Configuration Demo
This project demonstrates how to configure beans in Spring using XML configuration. It explains how beans are defined, injected, and how their lifecycle is managed using scopes.

# Project Structure
* `applicationContext.xml` → Contains all bean definitions and configurations.
* `MainApp.java` → Loads the Spring container and fetches beans.
* `Employee.java` → A simple POJO with properties like `id`, `name`, etc.
* `Department.java` → Another POJO used for demonstrating bean injection.

# Explanation of Code

# Bean Definition in XML
* Beans are defined inside `applicationContext.xml`.
* `<bean>` tag creates an object and registers it in the Spring container.
* `id` → unique name for the bean.
* `class` → fully qualified class name of the bean.

Example:
```xml
<bean id="employee" class="com.demo.Employee"/>
```
# Property Injection (Setter Injection)
* `<property>` tag is used to set values of fields inside the bean using setter methods.
* If `Employee` class has `setName()` method, then in XML we use:
```xml
<bean id="employee" class="com.demo.Employee">
    <property name="name" value="Rupshree"/>
</bean>
```
# Reference Injection (Bean to Bean)
* A bean can reference another bean instead of primitive values.
* Example: Employee has a `Department` object.
```xml
<bean id="department" class="com.demo.Department">
    <property name="deptName" value="CSE"/>
</bean>

<bean id="employee" class="com.demo.Employee">
    <property name="name" value="Rupshree"/>
    <property name="department" ref="department"/>
</bean>
```
# Bean Scope
* By default, beans are singleton (only one object is created when container loads).
* If scope is prototype, object is created only when `getBean()` is called.

Example:
```xml
<bean id="employee" class="com.demo.Employee" scope="prototype"/>
```
# Main Class Execution
In `MainApp.java`:
* Load context: `ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");`
* Fetch beans using `getBean()`.
* Spring automatically injects values as per XML configuration.

# Flow of Execution

1. Application starts.
2. Spring loads `applicationContext.xml`.
3. Container creates and manages beans based on scope.
4. `MainApp` retrieves bean objects using `getBean()`.
5. Injected values (primitive + references) are displayed.

