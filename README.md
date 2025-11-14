Project 2: Merging Sorted Lists

Author: Aryan Saxena
Purpose: Implement and analyze the greedy merging algorithm for sorted lists. Measure experimental execution time, compare it with the theoretical time complexity, and visualize the results.

Files Included
MergeSortedLists_Aryan.java

Java program implementing the greedy merge algorithm using a min-heap.

Accepts list sizes as input and computes:

Total merge cost

Experimental runtime using System.nanoTime()

Runs in O(n log n) time, where n is the number of lists.

graphs.py

Python script for plotting experimental runtime vs adjusted theoretical values.

Theoretical curve computed using:

𝑓(𝑛)= 𝑛log𝑛
f(n)=nlogn

Produces a log-log plot for comparison.

README.md

Instructions for compiling, running, and visualizing results.

How to Run

Java Program
Compile
javac MergeSortedLists_Aryan.java

Run
java MergeSortedLists_Aryan

Example Output
=== Project 2: Merging Sorted Lists ===
Enter number of lists: 5
Enter the sizes of each list: 4 3 7 9 2
--------------------------------------
Total merge cost: 76
Execution time: 1.182 ms
--------------------------------------

Python Plot Script
Requirements

Python 3.x

matplotlib

Install matplotlib if needed:

pip install matplotlib

Run the script
python graphs.py

Output

Displays a graph comparing Experimental Merge Time vs Adjusted Theoretical Merge Time on a log-log scale.

Purpose of This Project
Theoretical Analysis

The greedy merge algorithm uses a min-heap:

Extract two smallest lists → O(log n)

Insert merged list back → O(log n)

Repeated n-1 times

Total time complexity:

𝑂(𝑛log𝑛)
O(nlogn)
Experimental Validation

Measures actual runtime for merging lists of different sizes.

Runs the algorithm once per input and records nanosecond-level timing.

The Python script scales theoretical values for fair visual comparison.

Conclusions

Experimental results closely follow the O(n log n) theoretical curve.

Minor runtime differences come from JVM warm-up, memory allocation, and CPU load.

Graph shows a near-linear relationship between both curves on a log-log plot.

GitHub Code Repository

The Java and Python files for this project can be accessed at:
https://github.com/ari-sax/MergingSortedLists)

Notes

Execution time may vary due to system state and JVM optimizations.

Input must consist of positive integers representing sorted list sizes.

Uses System.nanoTime() for precise measurement.
