package com.demo;

import com.demo.intersection.Intersection;
import com.demo.reader.InputReader;

public class Main {

    public static void main(String args[]) {

        InputReader reader = new InputReader();
        int[][] lines = reader.readInput();  // Read input from the console
        Intersection intersection = new Intersection();
        System.out.println("Max intersections : " + intersection.findMaxIntersection(lines));

    }
}
