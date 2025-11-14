# Project 2: Merging Sorted Lists

Author: Aryan Saxena

Purpose: Implement the greedy merge algorithm for sorted lists, analyze
its theoretical time complexity, experimentally measure merge cost and
execution time, and compare the experimental results against the
theoretical growth curve.

Files Included

MergeSortedLists_Aryan.java - Java program that implements the greedy
merge algorithm using a min-heap. - Accepts list sizes as input. -
Computes total merge cost and experimental runtime using
System.nanoTime(). - Prints the results for each execution.

graphs.py - Python script to visualize experimental results against
adjusted theoretical values. - Computes theoretical values based on T(n)
= n log n and scales them for comparison. - Plots experimental vs
adjusted theoretical merge times on a log--log scale.

How to Run

Java Program

Compile the Java file: javac MergeSortedLists_Aryan.java

Run the program: java MergeSortedLists_Aryan

Output: Displays total merge cost and runtime in milliseconds for the
input lists.

Python Plot

1.  Ensure Python 3 is installed along with matplotlib.
2.  Run the script: python graphs.py
3.  Output: Log--log plot showing experimental merge times vs adjusted
    theoretical curve.

Purpose of This Project

Theoretical Analysis: The greedy merge algorithm always merges the two
smallest lists first using a priority queue (min-heap).

Time complexity: - Extract-min: O(log n) - Insert merged list: O(log
n) - Performed (n -- 1) times

Total time complexity: O(n log n)

Experimental Validation: - Measures execution time using
System.nanoTime(). - Compares merge cost and runtime for different
inputs. - Scales theoretical values for visualization. - Experimental
results follow the expected O(n log n) growth trend.

Conclusions: - Theoretical complexity: O(n log n) - Experimental
runtimes validate the predicted trend. - Adjusted theoretical curve
aligns closely with observed results on a log--log graph. - Minor
runtime variations occur due to JVM warm-up and CPU scheduling.

GitHub Code Repository:
https://github.com/ari-sax/MergingSortedLists.git

Notes: - Input should be positive integers. - Execution time may vary
due to system performance and JVM optimization. - Min-heap ensures
optimal merging efficiency.
