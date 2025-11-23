/**
 * Project 2: Merging Sorted Lists
 *
 * This program determines the optimal merge sequence for multiple
 * sorted lists by always merging the two smallest lists first.
 * It computes the total merge cost and prints the merge sequence.
 *
 * @author Aryan Saxena
 */

import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeSortedLists_Aryan {

    /**
     * Computes total merge cost using a min-heap and prints merge sequence.
     * @param sizes array containing sizes of lists
     * @return total merge cost
     */
    public static int mergeLists(int[] sizes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert all list sizes into heap
        for (int size : sizes) {
            minHeap.add(size);
        }

        int totalCost = 0;
        int step = 1;

        // Merge two smallest lists until one remains
        while (minHeap.size() > 1) {
            int first = minHeap.poll();   // smallest
            int second = minHeap.poll();  // next smallest
            int cost = first + second;

            totalCost += cost;
            minHeap.add(cost);            // insert merged list

            // Print the merge step
            System.out.println("Step " + step + ": Merge " + first + " + " + second + " = " + cost);
            step++;
        }

        return totalCost;
    }

    // Main method - takes input and prints total merge cost, sequence, and execution time.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Project 2: Merging Sorted Lists ===");
        System.out.print("Enter number of lists: ");
        int n = sc.nextInt();

        int[] sizes = new int[n];
        System.out.println("Enter the sizes of each list:");
        for (int i = 0; i < n; i++) {
            sizes[i] = sc.nextInt();
        }

        long startTime = System.nanoTime();
        int totalCost = mergeLists(sizes);
        long endTime = System.nanoTime();

        double timeMs = (endTime - startTime) / 1e6;

        System.out.println("Total merge cost: " + totalCost);
        System.out.printf("Execution time: %.3f ms%n", timeMs);

        sc.close();
    }
}
