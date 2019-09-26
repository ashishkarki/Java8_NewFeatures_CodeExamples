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

Introduction
-------------
Java8 introduces Lambda expressions and functional programming. With functional programming, we can do declarative style of programming as opposed to imperative style of programming (which works closely with OOP).
1. Imperative: style focus on How to do certain things; it lists everything step by step
2. Declarative: style focus on What is the desired Result; in this lots of times, we use ready-to-use functions from the Java Library itself.

### What are Lambda expressions?
Lambda is  equivalent to a function (method) without a name. They are also referred to as Anonymous functions.
- Lambdas are also not tied to any class unlike regular methods
- They can be passed around and be assigned to a variable.
- They are mainly used to implement Functional Interfaces or (SAM: Single Abstract Method Interfaces). 
- Functional interfaces are interfaces with only one abstract method and are annotated with @FunctionalInterface. 
- Existing functional interfaces in Java8 are Runnable (with one abstract method run) and  Comparator

### What are Functional Interfaces?
These have existing in Java since version 1.0. Back then, these were called SAM (Single Abstract Method) Interfaces.
- A Functional Interface is an interface that has exactly one abstract method.
- They are denoted by an optional annotation @FunctionalInterface. It is considered a good practice to use the annotation to indicate that certain interface is supposed to be functional.
- There are four new functional interfaces in Java8:
    1. __Consumer__: represents an operation that accepts one argument and returns no result.
    2. __Predicate__: represents a boolean-valued function (also called predicate) of one argument and returns a boolean true/false result
    3. __Function__: represents a function which accepts one argument and produces a result. The idea behind this is to be able to assign and pass around functions like we do any variables.
    4. __Supplier__: represents a function which does not take in any arguments but produces a result of type T.
- All these above interfaces are part of the java.util.function package.
- Each of the above interfaces also have one or more extensions. Some of them are discussed below:
    1. __Consumer’s extension__: 
        a. __BiConsumer__ which represents an operation that accepts two arguments and returns no result
    2. __Predicate’s extension__: 
        a. __BiPredicate__ which represents a predicate which is a boolean-valued function of two arguments and which represents a boolean-value.
    3. __Function’s extension__:
        a. __BiFunction__ which represents a function that accepts two arguments and produces a result. Obviously, this is a two-arity specialization of Function interface.
        b. __UnaryOperator__ which represents an operation on a single argument that produces a single result whose type is the same type as the argument.
        c. __BinaryOperator__ which represents an operation on two arguments of the same types that produces a single result whose type is the same type as the two arguments.
- Method References: their purpose is to simply the implementation of Functional Interfaces. 
    + A reference refers to a method within a class. 
    + And, references provide shortcut to writing the lambda expressions.
    + Method references have one of the following syntax:
   ```
        ClassName::instance-methodName
        ClassName::static-methodName
        Instance::methodName
    ```
- Where to use Method references ?
    + Cases where lambda expressions are referring to a method directly like 
        ```Function<String, String> uppercase = (s)-> s.toUppercase();```
    Can be re-written with method reference as follows:
        ```Function<String, String> uppercase = String::toUppercase;```
- Constructor Reference: their purpose is to utilize lambda expression to create new objects.
    + A constructor reference has the following syntax:
        ```ClassName::new```
    + For this syntax to work, the ClassName class must have an explicit no-argument constructor
    + Remember, we can only use a constructor reference in the context of functional interfaces i.e.
    This is okay: ```Supplier<Person> personSupplier = Person::new;```
    But, this gives compilation issue: ```Person person = Person::new;```
- Lambdas and Local Variables:
    + Lambdas can capture or use static variables, instance variables and local variables. Only local variable access from lambdas come with restrictions.
    + To reiterate, a local variable is a variable that is declared inside a method body, block or constructor. That particular variable is only accessible within the method or block or constructor that declared it.
    + There are some restrictions on how Lambdas can access local variables. Two of them are as follows:
        + Your are not allowed to re-assign a value to a local variable within a lambda expression. This rule is called __Effectively Final__ variable.
            + Once, a local variable becomes final or effectively final (in this case by being used inside a lambda), then it’s value cannot be modified anywhere (including inside or outside the lambda)
            + Prior to Java 8, in order to use a variable inside an anonymous class (which is btw also an implementation of Function Interface, we had to declare that with the keyword final.
            + Although there are no such restrictions with Java 8 and after (meaning the final keyword is not explicitly required), the local variables used within a lambda are still effectively final and cannot have their value modified once declared.
        + You are not allowed to use the same local variable name as lambda parameters or inside the lambda body
        + Also, the local variables captured in lambdas have to be final or effectively final to avoid concurrency issues. Effectively final variables are the ones whose value do not change dynamically
    + Note again that these restrictions only apply to local variables but not instance variables and the reason for this is Java stores instance variables in heap memory unlike the local variables which are stored in stack. Storing in the heap means, Java can guarantee that we get the latest value of an instance variable and hence avoid concurrency issues.
- What is the Streams API? 
    + The main purpose of Streams API is to perform some sort of operation on collections like list, map, set etc. The API can also be used with arrays or any kind of I/O.
    + Streams API makes it easy to perform parallel operations without the need to create multiple threads.
    + These are all part of the java.util.stream package. This package contains classes to process sequences of elements,
- Now, the question arises - What is a Stream ?
    + A stream is a sequence of elements which can be created out of a collection or arrays or some I/O operation.
    + A stream() default method is added to the Collection interface and allows creating a Stream using any collection as an element source like so:
        ```Stream<Integers> myStream = integerList.stream();```
    + Stream API simplifies multithreading by providing the parallelStream() method that runs operations over stream's elements in parallel mode. It can be created and used like so:
	```integerList.parallelStream().forEach(i -> invokeFunction(i));```
    Here, invokeFunction is run in parallel for every element in the integerList.
    + An important note is that stream operations are lazy i.e. no other steps are started until a terminal operation (like .collect(..) ) is added.
    + You can use peek() method to view/debug the values being processed in a stream.
- Some differences between Streams and Collections
    + Streams are fixed set of data and cannot be modified once they are created. Whereas collections like lists allow addition, update or deletion of their elements at any point in time.
    + Collections => allow their elements to be accessed in any order (for example using the get(index) method of a list). Whereas, Streams => only allow sequential access to their elements.
    + Collections => are eagerly created (meaning they have to be built totally before doing anything with them). Whereas,Streams => are lazily constructed (meaning nothing happens until a terminal operation is invoked).
    + Collections => can be traversed multiple/n-number of times. Whereas, Streams => can be traversed only once (meaning once you go through your stream of data, there is no way to go back and do the same. The stream once traversed gets closed.)
    + Collections => perform External iteration to iterate through its elements. Whereas, Streams => perform Internal iteration to iterate through its elements (meaning with streams we don’t have to worry about how-to iterate, we just specify the kind of operation to perform and how is taken care of for us)
- Some methods of the Stream API are discussed below:
    + __map()__ - is different from a Collection’s map function. Stream API’s map is used to transform from one type to another.
    + __flatMap()__ - Similar to map, flatMap() converts/transforms one type to another. But, it is used in the context where each element of a given stream itself is a collection of some sort for example Stream<Array> or Stream<List>
        + __Difference between map and flatMap__: The map() method wraps the underlying sequence in a Stream instance, whereas the flatMap() method allows avoiding nested Stream<Stream<R>> structure.
    + __distinct()__ - operation returns a stream with only unique elements
    + __count()__ - operation returns a Long value which is the total number of elements in the stream
    + __sorted()__ - operation sorts the elements in a stream
    + __filter()__ - operation filters the elements in a given stream based on a Predicate (Functional Interface) which is provided as input to the function.
    + __reduce()__ - operation reduces the content of a stream to a single value. It is a terminal operation. Reduce takes two parameters as input:
        + _First parameter_: is the default or initial value of the operation
        + _Second parameter_: should be a BinaryOperator
    + __limit(n)__: creates a sub-stream by limiting to n number of elements which get processed.
    + __skip(n)__: also creates a sub-stream by skipping n number of elements from the stream.
    + __anyMatch(), allMatch() and noneMatch()__: all of these functions take a Predicate as an input and return a Boolean value as the result. These test whether a given element is present in the stream or not.
        + __anyMatch()__: returns True if any one of the elements in the stream matches the predicate, else return false
        + __allMatch()__: returns True only if all the elements in the stream match the predicate, else return false
        + __noneMatch()__: the Opposite of allMatch(). Returns True only if none of the elements in the stream match the predicate, else returns false.
    + __findFirst() and findAny()__: both of these are used to find an element in the stream. They return a result type of Optional, meaning they with either return the element they find or null if they don’t. The difference between these two becomes evident when using parallelStreams (To be discussed a bit later).
        + __findFirst()__: returns the first element it finds per the condition. It stops after it finds the first element that satisfies the condition or predicate.
        + __findAny()__: returns the first encountered element in the stream. It stops immediately after finding any first element it encounters, it doesn’t take or bother itself with any conditions or predicates.
    + __Stream API Factory methods: Of(), generate(), iterate()__ : these methods are used to create new streams.
    	+ __Of()__: this method creates a stream based on the values passed to it. For example: 
        	```Stream<String> myStream = Stream.Of("John", "Jenny", "Robin");```
        + __generate()__: used to create an infinite stream. Usage like so
        	``` Stream.generate(<Some-Supplier>) ```
        + __iterate()__: also used to create an infinite stream.Usage like so:
        	``` Stream.iterate(1, x -> x * 2) ```

- Short Circuiting operations 
    + The idea behind short circuiting is that once the specified condition is met, the remaining chunk of stream or data isn't processed.
    + Streams API has few short circuit operations that we have discussed so far. They are: limit, findFirst, findAny, anyMatch, allMatch() and noneMatch.

- __Numeric Streams__ in Java: these represent the __primitive values__ in a Stream. They are of three types: IntStream, LongStream and DoubleStream.
    + Numeric stream ranges: The three streams support these types of range operations:
        + __IntStream__ : supports range() and rangeClosed()
        + __LongStream__ : supports range() and rangeClosed()
        + __IntStream__ : Doesn't support range() and rangeClosed(). One workaround this is to do something like
                ``` IntStream.range(a, b).asDoubleStream().forEach(...) ```
    + __range(), rangeClosed(), count(), forEach()__ : as obvious, these are used to create or loop through a range of numbers.
    + Numeric stream aggregate functions are:  __sum(), min(), max(), average()__
    + Numeric stream __Boxing and Unboxing__: conversion from primitive to Wrapper class and vice-versa
        + __Boxing()__: converting a primitive type to its Wrapper class Type. For eg: converting int to Integer.
        + __Unboxing()__: converting a Wrapper class Type to primitive type. For eg: converting Integer to int.
    + Numeric stream map methods: __mapToObj(), mapToLong(), mapToDouble()__

- Stream Terminal Operations: these operations start the whole stream pipeline and collect the resulting data.
    + some terminal operations are: forEach, collect, sum etc
    + __collect()__ : takes a Collector type as input and produces an output based on that Collector. Some Collectors 
    are discussed below:
        + __joining()__ : this collector performs string concatenation on the elements of a stream. It has three overloaded methods.
            1. First version doesn't any parameter: joining()
            2. Second version a delimiter as a parameter: joining(delimiter)
            2. Second version a delimiter, a prefix  and a suffix as parameters: joining(delimiter, prefix, suffix)
        + __counting()__: this Collector returns the total number of elements as its result.
        + __mapping()__: this collector type first applies a mapping/transformation function and collects the data into
        a collection.
        + __maxBy() and minBy()__: both of these collectors take a Comparator as input and return an Optional as output
        + __summingInt() and averagingInt()__: these return the sum and average of a collection. They also have corresponding 
        versions for long (as in summingLong()) and double (as in summingDouble()).
        + __groupingBy()__: is equivalent to applying a groupBy clause in a SQL.Basically it is used to group elements
        based on an input parameter. It's output is a Map<k, V> of key-value pairs. It has three versions:
            + First version is _groupingBy(classifier)_: where classifier is the string used to group the elements
            + Second version is _groupingBy(classifier, downstream)_: where downstream is any Collector
            + Third version is _groupingBy(classifier, supplier, downstream)_: where supplier is any Supplier
        + __partitioningBy()__: this is also a type of groupingBy and accepts a predicate as an input. Its output is always
        a Map<K, V> where Key(K) is always of Boolean type. There are two versions:
            + First version is _partitioningBy(predicate)_
            + Second versio is _partitioningBy(predicate, downstream)_ : where downstream can be any collector

- What are Parallel Streams ?
    + Basically, a parallel stream splits the source of data into multiple parts, works on them in parallel and finally 
    combines the result.
    + How does Parallel streams work ?
        + Parallel streams use the __Fork/Join Framework__ underneath. Fork/Join were introduced in Java 7.
        + The number of threads created = the number of processors available in the host machine
        + Note that parallel streams might not be the best solutions in all cases. So checking to see if parallelized
        does indeed perform better is important. 
            + One such case when parallel stream performs poorly is the case of Unboxing
        Wrapper types to primitive types such when calculating their sum.
            + Another example of parallel streams being inefficient or even giving wrong results is when we have 
            "Mutable" variables involved. In such cases, the mutable variable is accessed concurrently leading to a situation
            where the most updated value of the output variable might be ready when a return happens giving a wrong result.

- What are Optionals ?
    + Optionals are containers used to represent non-null objects.It is used to represent a null with an absent value.
    + Optionals help avoid Null Pointer Exception and Unnecessary null checks.
    + Some optionals methods are discussed below:
        + __ofNullable()__: use ofNullable if you have doubts that the argument might be null
        + __of()__: use of if you are certain that the argument will never be null. Sending a null as argument to Of(), 
        gives you NullPointerException.
        + __empty()__: use or return Optional.empty() when there is a null object and you want to still return an Optional 
        type object
        + __orElse()__: to return a default/custom value in cases where an operation returns a null
        + __orElseGet()__: same as orElse (to return a default/custom value in cases where an operation returns a null),
        but, it takes a Supplier as input rather than any object.
        + __orElseThrow()__: similar to orElseGet, it requires a supplier as argument; in case of a null value throws an exception
        back to the caller 
        + __isPresent()__: checks if an Optional object has a non-null value or not.
        + __ifPresent()__: same as isPresent() checks if an optional object has value. Additionally, takes a Consumer as
        its argument and allow you to perform some consumer operation with it like printing or calling another method.
        + __filter()__: similar to stream filter, performs a filtration based on some predicate
        + __map()__: similar to stream map, converts/transforms one type to another type
        + __flatMap()__: similar to stream flatMap, converts/transforms one type to another type using a flat structure.

- Defaults and static methods in Java8 and beyond
    + Prior to Java 8, Interfaces were only allowed to contain abstract methods (without implementation). This made is
    difficult for extending interfaces with new functionalities since adding any new method would break the implementating 
    interfaces and classes. 
    + So, Java8 brought forward the concept of default and static methods.
    + What are default methods?
        + Default methods are non-abstract (with implementation or method body) in an interface. Default methods are 
        identified by the keyword 'default' in front of such methods.
        + An example is the built-in 'sort' methods with List interface. Prior to Java8, we have to use sort() from Collections
        interface (a parent of List) to do any kind of sorting.
        + Importantly, default methods can be overridden in the implementing classes.
    +  What are static methods?
        + Static methods are similar to default methods with the exception that they cannot be overriden by implementing 
        classes.  

- Differences between Abstract Classes and Interfaces in Java8::
    + One is that instance variables are allowed in abstract classes but disallowed in Interfaces.
    + Other is a class an extend only one (abstract) class but can implement multiple interfaces.
    + Essentially, __after Java8, multiple inheritance is allowed__
    + Resolving precedence during multiple inheritance done using multiple interfaces. Remember:
        + The highest precedence is given to the class that implements any interface
        + The second highest precedence goes to the sub-interface that implements an interface
        + Another thing to note is if an implementation class say ImplAB implements Interfaces A and B both of which have 
        exactly same signature default methods, then Java gives error. The only way to fix this would be implement the 
        conflicting method in the ImplAB implementation class.

- New Date and Time libraries in Java8
    + The new libraries are __LocalDate, LocalTime and LocalDateTime__.
    + All of these are part of the java.time package.
    + All these libraries are Immutable and help promote functional way of programming.
    + __Period__ class: represents a time in Days, Months and Years based on date-representation.
        + Period class is also part of the java.time package.
        + Period is compatible with LocalDate.
        + More importantly, this class represents a __Period or stretch of Time__ and not a specific date and time. Eg:
            ``` Period p1 = Period.ofDays(10); ``` // represents a period of 10 days
            ``` Period p2 = Period.ofYears(10); ``` // represents a period of 10 years
        + Following are some use cases of Period class:
            + More general use is to calculate the difference between two dates. Eg:
                ``` Period pDiff = Period.between(localDate1, localDate2); ```
    + __Duration__ class: this class is a time based representation of time in __hours, minutes, seconds and nanoseconds__
        + Duration is compatible with LocalTime and LocalDateTime.
        + Duration represents a duration of time and not just a specific time. For eg:
            ``` Duration d1 = Duration.ofHours(3); ``` // represents a duration of 3 hours
        + Most general use case of Duration is to calculate the difference between the time based objects like LocalTime
        and LocalDateTime. eg:
            ``` var duration = Duration.between(localTime1, localTime2); ```
    + __Instant__ class: this class represents time in a machine readable format (in huge number format). eg:
        ``` var instant = Instant.now() ``` // where the instant represents the time in seconds from Jan 01, 1970 (Epoch)
                                    to the current time
                                    
    
<more to be added..>
