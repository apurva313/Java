
# Java Inheritance Types

Below are the different types of inheritance which are supported by Java.

- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance
- Multiple Inheritance
- Hybrid Inheritance

## 1. Single Inheritance
In single inheritance, subclasses inherit the features of one superclass. In the image below, class A serves as a base class for the derived class B.

![single](https://github.com/apurva313/Java/assets/102182985/e065dcb3-11b0-4405-963f-8251c10325c0)


## 2. Multilevel Inheritance
In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes. In the below image, class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. In Java, a class cannot directly access the grandparent’s members.

![Multilevel](https://github.com/apurva313/Java/assets/102182985/9a83516b-ed7e-486b-8cef-a1be7186060c)


## 3. Hierarchical Inheritance
In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass. In the below image, class A serves as a base class for the derived classes B, C, and D.

![Hierarchical](https://github.com/apurva313/Java/assets/102182985/3b9c69d4-b57d-4d2d-928a-ec3541937ffe)


## 4. Multiple Inheritance (Through Interfaces)
In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes. Please note that Java does not support multiple inheritances with classes. In Java, we can achieve multiple inheritances only through Interfaces. In the image below, Class C is derived from interfaces A and B.

![Multiple](https://github.com/apurva313/Java/assets/102182985/c75cd7ce-9e63-4307-b449-0c5f533f9bb7)


## 5. Hybrid Inheritance(Through Interfaces)
It is a mix of two or more of the above types of inheritance. Since Java doesn’t support multiple inheritances with classes, hybrid inheritance is also not possible with classes. In Java, we can achieve hybrid inheritance only through Interfaces.

![Hybrid](https://github.com/apurva313/Java/assets/102182985/6284b039-1866-4a55-b643-1f66138a3f54)
