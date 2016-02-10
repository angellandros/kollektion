# Kollektion
a java data structure extension

## LinkedList
Import using:

```java
import ir.angellandros.kollektion.LinkedList;
```

Construct from another Java collection:

```java
List<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
LinkedList<Integer> ll = new LinkedList<Integer>(list);

// Now linked list equals to 1, 2, 3, 4
```

Use insert, remove, and restart:

```java
ll.next();
ll.next();
ll.next();
ll.remove();
ll.remove();
ll.insert(10);
ll.restart();

// Now linked list equals 1, 10, 4
```

## OrderedPair
Import using:

```java
import ir.angellandros.kollektion.OrderedPair;
```

Very easy to use:

```java
OrderedPair<Integer, Integer> pair = new OrderedPair<Integer, Integer>(12, 16);
System.out.println(pair._2);  // 16
```