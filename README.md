Project 2: Merging Sorted Lists

Files Included

MergeSortedLists_Aryan.java – Main Java program implementing the greedy merge algorithm

graphs.py – Python script for plotting experimental vs theoretical results

README.md – Instructions for running the project

How to Compile and Run (Java)
Using Command Line

Open a terminal (or Git Bash / PowerShell).

Navigate to the directory containing the file:

cd path/to/your/files


Compile the program:

javac MergeSortedLists_Aryan.java


Run the program:

java MergeSortedLists_Aryan


Enter input when prompted:

=== Project 2: Merging Sorted Lists ===
Enter number of lists: 5
Enter the sizes of each list: 4 3 7 9 2
--------------------------------------
Total merge cost: 76
Execution time: 1.182 ms
--------------------------------------

How to Run the Graph Script (Python)

Make sure you have Python 3.x and matplotlib installed:

pip install matplotlib


Run the Python script:

python graphs.py


The graph Experimental vs Adjusted Theoretical Merge Times will be displayed automatically.

Notes

The program measures execution time using System.nanoTime().

Input should consist of positive integers representing list sizes.

The algorithm runs in O(n log n) time, where n is the number of lists.

Experimental times may vary slightly due to system load and JVM optimizations.

Output Example
=== Project 2: Merging Sorted Lists ===
Enter number of lists: 10
Enter the sizes of each list: 15 8 3 22 10 4 6 11 5 9
--------------------------------------
Total merge cost: 290
Execution time: 0.959 ms
--------------------------------------
