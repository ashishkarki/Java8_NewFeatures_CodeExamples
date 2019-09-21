This project displays examples of using the most exiciting features introuduced by Java 8
-----------------------------------------
Some features to be covered include (but not limited to):
- Lambdas
- Functional Interfaces
- Streams
- Default Methods
- Date and Time API

Documentation of the features that are demostrated with real, Java examples in this project
===========================================================================================

Java8 introduces Lambda expressions and functional programming. With functional programming, we can do declarative style of programming as opposed to imperative style of programming (which works closely with OOP).
- Imperative: style focus on How to do certain things; it lists everything step by step
- Declarative: style focus on What is the desired Result; in this lots of times, we use ready-to-use functions from the Java Library itself.

What are Lambda expressions?
- Lambda is  equivalent to a function (method) without a name. They are also referred to as Anonymous functions.
- Lambdas are also not tied to any class unlike regular methods
- They can be passed around and be assigned to a variable.
- They are mainly used to implement Functional Interfaces or (SAM: Single Abstract Method Interfaces). 
- Functional interfaces are interfaces with only one abstract method and are annotated with @FunctionalInterface. Existing functional interfaces in Java8 are Runnable (with one abstract method run) and  Comparator

What are Functional Interfaces?
- These have existing in Java since version 1.0. Back then, these were called SAM (Single Abstract Method) Interfaces
- A Functional Interface is an interface that has exactly one abstract method.
- They are denoted by an optional annotation @FunctionalInterface. It is considered a good practice to use the annotation to indicate that certain interface is supposed to be functional.
- There are four new functional interfaces in Java8:
  1. Consumer: represents an operation that accepts one argument and returns no result
  2. Predicate
  3. Function
  4. Supplier
- All these above interfaces are part of the java.util.function package.
- Each of the above interfaces also have one or more extensions.
  1. Consumer’s extension: BiConsumer which represents an operation that accepts two arguments and returns no result
  2. Predicate’s extension: 

<more to be added..>
