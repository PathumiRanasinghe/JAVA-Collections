# JAVA-Collections - CS1040 Project 2

We were required to test the performance of several Java Collection implementations for a few methods.

### The list of Java Collection implementations are:

* HashSet
* TreeSet
* LinkedHashSet
* ArrayList
* LinkedList
* ArrayDeque
* PriorityQueue
* HashMap
* TreeMap
* LinkedHashMap
  
### The list of methods for performance checking are:

* `add` a given element to the collection
* check if a collection `contains` a given element
* `remove` a given element from the collection (if it is present)
* `clear` all the elements in the collection
  
### Guidelines

* Perform the tests using default initialCapacity and loadFactor values.
* When testing, first each collection must be loaded with 100,000 items.
* The items to be loaded are Integer objects.
* Each Integer object must be of a random value between 0 and 99,999 (inclusive).
* The time measurements must be obtained at nanoseconds.
* Run each test 100 times and get the average value as the result.
  
We were required to submit a report in PDF format with a cover page and 4 sections containing

* A brief and concise description of your program design
* Full Java program code used for testing
* A comparison table of performance data
* Brief descriptive discussions on the reasons for performance variations
  
___

# Project Overview - Performance of Java Collections

This project evaluates the performance of various Java Collection implementations across four critical methods: `add`, `contain`, `remove`, and `clear`. The evaluation process is divided into three main stages: data preparation, testing, and report creation.

* Data Preparation: The project generates a dataset of 100,000 randomly generated Integer objects, serving as test elements for performance evaluation.

* Testing Process: Each Collection implementation undergoes rigorous testing, where each method is executed multiple times to ensure accurate time measurements. By repeating each operation 100 times and averaging the results, the program delivers reliable performance data.

* Report Creation: The results are compiled into a detailed report, including the testing code, a comparison table of performance data, and discussions on the underlying factors contributing to performance variations. The discussions focus on the design of data structures, the efficiency of algorithms, and optimization strategies.

### Key Findings:

* Best Performers:

  * Add: ArrayList leads in efficiency, followed by LinkedHashSet and LinkedHashMap.
  * Contain: HashSet is the most efficient, with LinkedHashSet also performing well.
  * Remove: LinkedHashSet is the fastest, with LinkedHashMap and HashSet showing good performance.
  * Clear: TreeMap is the most efficient for clearing elements.
    
* Worst Performers:

  * Add: TreeSet exhibits the longest times, indicating inefficiency.
  * Contain: TreeMap and PriorityQueue perform poorly in checking element existence.
  * Remove: PriorityQueue shows inefficiency in removal operations.
  * Clear: LinkedList demonstrates the slowest performance.
    
These findings highlight the importance of selecting the appropriate data structure based on specific application requirements and usage patterns to achieve optimal performance.

___

![Screenshot (416)](https://github.com/user-attachments/assets/623f5454-708b-4590-8dfb-cfddac6990a8)




