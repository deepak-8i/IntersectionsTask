package com.demo.intersection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Intersection {

    public int findMaxIntersection(int[][] lines) {

        // Sort the array based on starting position
        Arrays.sort(lines, Comparator.comparingInt((int[] line) -> line[0]));

        //System.out.println(Arrays.deepToString(lines));
        // Using a priority queue or any sorted collection based on the end position
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int maxIntersections = 0; //Find the maxIntersections intersection

        for (int[] line : lines) { //traverse through the sorted array

            if (queue.isEmpty()) {
                queue.offer(line[1]);
            } else {
                // When the starting point crosses the end position remove from Queue
                if (line[0] > queue.peek()) {
                    queue.poll();
                }
                //Add the new lines end position in the queue
                queue.offer(line[1]);
            }
            //Identify the maxIntersections intersection
            if (maxIntersections < queue.size()) {
                maxIntersections = queue.size();
            }
        }
        return maxIntersections;
    }
}


