# Project 2: Merging Sorted Lists

**Author:** Aryan Saxena  
**Purpose:** Implement the greedy merge algorithm for sorted lists, analyze its theoretical time complexity, experimentally measure merge cost and execution time, and compare the experimental results against the theoretical growth curve.

---

## Files Included

### 1. Merging-Sorted-Lists.java
- Java program implementing the greedy merge algorithm using a **min-heap**.  
- Accepts list sizes as input.  
- Computes:
  - Total merge cost  
  - Experimental runtime using `System.nanoTime()`  
- Prints results for each execution.

### 2. graphs.py
- Python script to visualize experimental results.  
- Computes theoretical values based on:  
  \(T(n) = n \log n\)  
- Scales theoretical values for comparison.  
- Generates a **log-log plot** comparing experimental merge times with the adjusted theoretical curve.

---

## How to Run

### Java Program

1. Compile:
   ```bash
   javac Merging-Sorted-Lists.java
   ```

2. Run:
   ```bash
   java Merging-Sorted-Lists
   ```

3. Output:
   - Displays merge cost and runtime (in milliseconds) for the given input sizes.

---

### Python Plot

1. Ensure Python 3 and `matplotlib` are installed.  
2. Run:
   ```bash
   python graphs.py
   ```
3. Output:
   - A log-log plot showing experimental merge times vs. adjusted theoretical \( n \log n \) curve.

---

## Purpose of This Project

### Theoretical Analysis
The greedy merge algorithm repeatedly merges the **two smallest lists first**, implemented efficiently with a priority queue (min-heap).

Operation costs:
- `extract-min`: \(O(\log n)\)  
- `insert`: \(O(\log n)\)  
- Repeated **\(n - 1\)** times  

**Total time complexity:**  
\(O(n \log n)\)

### Experimental Validation
- Measures execution time using `System.nanoTime()`.  
- Computes total merge cost for various input sizes.  
- Scales the theoretical \( n \log n \) values for comparison.  
- Experimental results follow the expected \(O(n \log n)\) growth trend.

---

## Conclusions
- Theoretical complexity: \(O(n \log n)\).  
- Experimental runtimes validate the theoretical prediction.  
- Adjusted theoretical curve aligns with observed results on a log-log plot.  
- Minor variations due to JVM warm-up and CPU scheduling are expected.

---

## GitHub Code Repository
Project files are available at:  
https://github.com/ari-sax/Merging-Sorted-Lists.git

---

## Notes
- Input sizes must be positive integers.  
- Execution time may vary depending on hardware and JVM optimizations.  
- Min-heap ensures optimal merging efficiency.
