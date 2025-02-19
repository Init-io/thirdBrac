# **🔥 thirdBrac - Pythonic Lists in Java (v1.0.0) 🔥**  
![Maven Central](https://img.shields.io/maven-central/v/io.github.init-io/thirdBrac.svg?label=Maven%20Central)
![GitHub Release](https://img.shields.io/github/v/release/init-io/thirdBrac?label=release)
[![License](https://img.shields.io/github/license/init-io/thirdBrac)](LICENSE)
![downloads](https://img.shields.io/badge/downloads-1k%2Fmonth-brightgreen)

**🚀 A fully Python-style list implementation for Java!**   
Now you can use lists like a **Python pro in Java!** 🎉  

---
## **📌 Features**
✅ **Simple & Pythonic:** Works just like Python’s `list`  
✅ **Fully Featured:** Supports all major list operations  
✅ **Iterable & Functional:** Supports `for-each`, `map`, `filter`, `reduce`  
✅ **Super Fast & Optimized!**  

---
## **📌 Installation**
Just download `thirdBrac.java` and add it to your project.  

---
## **📌 Quick Example**
```java
import io.github.initio.thirdBrac.thirdBrac;

public class Main {
    public static void main(String[] args) {
        thirdBrac<Integer> myList = thirdBrac.list(1, 2, 3, 4, 5);
        myList.append(6);
        myList.insert(2, 99);
        myList.extend(Arrays.asList(7, 8));

        System.out.println(myList); // [1, 2, 99, 3, 4, 5, 6, 7, 8]
    }
}
```
---

## **📌 Complete List of Methods in `thirdBrac`**
---
### **1️⃣ Creation Methods**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `thirdBrac.list(T... elements)` | Creates a `thirdBrac` list | `thirdBrac<Integer> myList = thirdBrac.list(1, 2, 3, 4, 5);` |
| `thirdBrac.of(T... elements)` | Alternate way to create a `thirdBrac` list | `thirdBrac<Integer> myList = thirdBrac.of(1, 2, 3);` |

---
### **2️⃣ Basic Operations**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `append(T value)` | Adds an element at the end | `myList.append(6);` |
| `insert(int index, T value)` | Inserts an element at a specific index | `myList.insert(2, 99);` |
| `extend(List<T> values)` | Extends list by adding multiple elements | `myList.extend(Arrays.asList(7, 8));` |
| `remove(T value)` | Removes the first occurrence of the value | `myList.remove(3);` |
| `pop()` | Removes and returns the last element | `T popped = myList.pop();` |
| `pop(int index)` | Removes and returns element at index | `T popped = myList.pop(2);` |
| `clear()` | Clears the entire list | `myList.clear();` |
| `set(int index, T value)` | Replaces an element at a given index | `myList.set(1, 100);` |
| `get(int index)` | Gets an element at a given index | `T first = myList.get(0);` |

---
### **3️⃣ Indexing & Slicing**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `first()` | Returns the first element | `T first = myList.first();` |
| `last()` | Returns the last element | `T last = myList.last();` |
| `slice(int start, int end)` | Returns a sublist (Python slicing) | `thirdBrac<Integer> subList = myList.slice(1, 4);` |
| `reverseSlice()` | Returns a reversed copy of the list | `thirdBrac<Integer> reversedList = myList.reverseSlice();` |

---
### **4️⃣ Searching & Counting**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `index(T value)` | Returns index of the first occurrence | `int idx = myList.index(100);` |
| `count(T value)` | Counts occurrences of a value | `int occurrences = myList.count(2);` |
| `contains(T value)` | Checks if the list contains a value | `boolean isPresent = myList.contains(5);` |

---
### **5️⃣ Sorting & Reversing**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `sort()` | Sorts list in ascending order | `myList.sort();` |
| `sortDescending()` | Sorts list in descending order | `myList.sortDescending();` |
| `reverse()` | Reverses the list | `myList.reverse();` |

---
### **6️⃣ Copying & Merging**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `copy()` | Returns a copy of the list | `thirdBrac<Integer> copyList = myList.copy();` |
| `merge(List<T> otherList)` | Merges two lists | `thirdBrac<Integer> merged = myList.merge(Arrays.asList(10, 11));` |

---
### **7️⃣ Functional Programming**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `map(Function<T, R> func)` | Applies a function to each element | `thirdBrac<Integer> squared = myList.map(x -> x * x);` |
| `filter(Predicate<T> predicate)` | Filters elements based on condition | `thirdBrac<Integer> evens = myList.filter(x -> x % 2 == 0);` |
| `reduce(BinaryOperator<T> reducer)` | Aggregates values | `Optional<Integer> sum = myList.reduce(Integer::sum);` |

---
### **8️⃣ List Comprehensions (Python-Style)**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `comprehension(int start, int end, IntFunction<Integer> func)` | Generates a list using a function | `thirdBrac<Integer> squares = thirdBrac.comprehension(0, 5, x -> x * x);` |

---
### **9️⃣ Conversion**
| **Method** | **Description** | **Usage Example** |
|-----------|--------------|-----------------|
| `toList()` | Converts `thirdBrac` to a Java `List` | `List<Integer> normalList = myList.toList();` |

---
### **🔄 Iteration (For-each Loop Support)**
```java
for (Integer num : myList) {
    System.out.println(num);
}
```

---
## **📌 FULL USAGE EXAMPLES**
```java
public class Main {
    public static void main(String[] args) {
        thirdBrac<Integer> myList = thirdBrac.list(1, 2, 3, 4, 5);

        myList.append(6);
        myList.insert(2, 99);
        myList.extend(Arrays.asList(7, 8));
        myList.remove(3);

        System.out.println(myList); // [1, 2, 99, 4, 5, 6, 7, 8]
        System.out.println("Popped: " + myList.pop()); // 8
        System.out.println(myList.slice(1, 4)); // [2, 99, 4]
        System.out.println("First: " + myList.first()); // 1
        System.out.println("Last: " + myList.last()); // 7
        System.out.println("Index of 99: " + myList.index(99)); // 2

        myList.reverse();
        System.out.println("Reversed: " + myList); // [7, 6, 5, 4, 99, 2, 1]

        thirdBrac<Integer> squares = thirdBrac.comprehension(0, 5, x -> x * x);
        System.out.println("Squares: " + squares); // [0, 1, 4, 9, 16]
    }
}
```

---
## **🚀 thirdBrac is the ULTIMATE PYTHONIC LIST LIBRARY FOR JAVA!**  
🔥 **Just import and code like a Python GOD in Java!** 🔥  

📌 **Version:** `1.0.0`  
📌 **Author:** *Siam Rayhan*  
📌 **License:** MIT  

