## Types of Data Structure:
- Primitive Data Structure
    - boolean, char, byte, short, int, long, float, double.
- Non-Primitive Data Structure
    - Example are: String, Files, Arrays, Collections Framework (Collection, Map)

### Application of Arrays:
- Arrays are used to store multiple data with single variable name which reduces the number of variables to be declared.
- Arrays are used to develop some algorithms like Bubble sort, Insertion sort, Selection sort etc.
- Arrays can be used to perform matrix operations
- Arrays can be used for CPU scheduling.
- Arrays are used to implement data structure for example Stack, ArrayList, Queues etc.

## Point to remember for Array & Collection Framework:
- Array is java language feature inbuild support provided by sun Microsystems. We have to develop algorithms to sort or insert or delete etc.
    - Collection Framework are API feature. It predefined classes and interfaces and methods by which we can easily iterate, delete or sort the elements
- Array can store primitive(int, char, long) and non-primitive(objects) data types
    - Collection framework can store only non-primitive data types (objects).
- Arrays can store only homogeneous data types i.e. array can store only similar type of data.
    - Collection Framework can store hetrogeneous data i.e. We can store different type of data
- The size of an array cannot be increased or decreased according to our requirement at runtime.
    - The size of collection can be increased or decreased according to our needs
- Array are not good with respect to memory.
    - Collection framework are very good with respect to memory.
- Array are good by performance wise.
    - Collection are not good by performance wise.


## What is Collection Framework?
- Collection Framwork consists of 2 words i.e. Collection and Framework
    - Collection is a single entity or an object which contains multiple data.
    - Framework represents the library.
- Collection framework is the set of classes and interfaces that implement commonly reusable collection data structure.
- Collection framework contains 2 main parts:
    - java.util.Collection
    - java.util.Map
- "9 key interfaces" of Collection Framework
    - java.util.Collection
        - Collection
        - List
        - Set
        - SortedSet
        - NavigableSet
        - Queue
    - java.util.Map
        - Map
        - SortedMap
        - NavigableMap

- Hierarchy of Collection Framework:

- In Collection, we can store the data directly but in Map we can store the data in key-value pairs.

## Collection:
- Collection is an interface which is present in java.util package
- Syntax: public interface Collection<E> extends Iterable { - }
- Collection was introduced in JDK 1.2 version
- Collection is an object which is used to represent a group of individual object as single unit.
- Collection interface is the root interface of Collection Framework.
- There is no concrete class which implements the Collection interface directly but there are interfaces which inherit the Collection interface i.e. List, Set & Queue.
- Hierarchy of Collection interface:

- Collection interface contains most common methods which are applicable for any collection object.

- Method of Collection Interface:
    - boolean add(Object obj);
    - boolean addAll(Collection c);
    - boolean remove(Object obj);
    - boolean removeAll(Collection c);
    - default boolean removeIf(-) { - }
    - boolean retainAll(Collection c);
    - void clear();

    - boolean contains(Object obj);
    - boolean containsAll(Collection c);
    - boolean isEmpty();
    - int size();
    - Iterator iterator();
    - Object toArray();
    
    - boolean equals (Object obj);
    - int hashCode();

## What is difference between Collection & Collections
- Collection is an interface.
    - Collection is a utility class.
- Collections is an object which is used to represent a group of individual object as a single unit.
    - Collections defines several utility methods that are used to operate on collection objects like sorting, searching etc.
- Collection interface contains default, abstract method and static method.
    - Collections class contains only static methods.

## What is Utility Class in Java?
- Utility class is also known as helper class which cannot be initantiated.
- Utility class contains only static methods.
- Example are Arrays, Collections.
- How we can create utility class:
    - declare the class as public and final
    - we have to declare private constructor to prevent object creation.
    - class should contains only static methods and does not contains abstract methods
    - every method should have deep documentation

## What is Utility Methods:
- Utility methods perform common, often reused methods.
- Utility methods are always static types
- Examples are sorting, searting, methods performing string manipulation, methods connectiong to string databases etc.


## List Interface:
- List is an interface which is present in java.util package
- List is the interface of Collection interface
- Syntax: public interface List extends Collection { - };
- List was introduced in JDK 1.2 version
- Hierarchy of List interface.
    - ArrayList
    - LinkedList
    - Vector
        - Stack
- Properties of List Interface:
    - List is an index based Data Structure, which means that first element will be inserted at 0 index position.
    - List can store different data types or hetrogeneous elements.
    - We can store duplicate elements in the List.
    - We can store any number of null values in the List.
    - List follows the insertion order which means the sequence in which we are inserting the elements, in the same sequence we can retrieve the elements.
    - List does not follow the sorting order

- Methods of List Interface:
    - List contains all the methods of Collection interface
    - void add(int index, object obj);
    - boolean addAll(int index, Collection c);
    - Object get(int index);
    - Object remove(int index);
    - Object set(int index, Object newobj); //set method is used to replace the object at given index position.
    - int indexOf(Object obj); //It will return the index position of provided object and if object is not found then it will return -1
    - int lastIndexOf(Object obj);

## ArrayList
- ArrayList is an implemented class of List interface which is present in java.util package 
- Syntax: public class ArrayList extends AbstractList implements List, RandomAccess, Cloneable, Serializable
- The underline Data-Structure of ArrayList is resizable array or growable array
- ArrayList was introduced in JDK 1.2 version

## Properties of ArrayList:
- ArrayList is an index based Data Structure which means that first element will be inserted at 0 index position
- ArrayList can store different data types elements or hetrogeneous elements
- We can store duplicate elements in the ArrayList.
- We can store any number of null values in the ArrayList
- ArrayList follows the insertion order which means the sequence in which we are inserting the elements, in the same sequence we can retrieve the elements
- ArrayList does not follow the sorting order 

    -(Above properties are same as List interface)

- ArrayList is non-synchronized collection because ArrayList does not contain any synchronized method
- ArrayList allows more than one thread at a time.
- ArrayList allows parallel execution.
- ArrayList reduces the execution time which in turn makes the application fast.
- ArrayList is not threadsafe.
- ArrayList does not gurantee for data inconsistency.

## Working of an ArrayList:
- When we create default ArrayList, a new ArrayList with initial capacity 10 is created (but size is 0).
- When the ArrayList capacity is full, a new ArrayList will be created with new capacity. 
    - The new Capacity is calculated by this formula:
        (CurrentCapacity * 3 / 2) + 1
- Then all the elements will be copied into the new ArrayList (and due to this reason performance of an ArrayList decreases).

- When new ArrayList is created auromatically, then reference variable will point to the new ArrayList.
- Then old ArrayList object will be not referenced by any reference and then garbage collection will delete that object.


# Note: There is no way by which we can find the capacity of an ArrayList.
