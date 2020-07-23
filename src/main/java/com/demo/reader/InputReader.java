package com.demo.reader;

import java.util.Scanner;

public class InputReader {

    public int[][] readInput() {

        Scanner input = new Scanner(System.in);
        //Read the number of lines
        System.out.println("Enter number of lines : ");
        int numberOfLines = Integer.valueOf(input.nextLine());
        int[][] lines = new int[numberOfLines][2];

        // Read the lines start and end position from the console
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Enter start(Xs) and end(Xe) position of the Line in Xs,Xe format: ");
            String coordinate = input.nextLine();
            String[] parts = coordinate.split(",");
            lines[i][0] = Integer.parseInt(parts[0]);
            lines[i][1] = Integer.parseInt(parts[1]);

            if (lines[i][0] > lines[i][1]){
                System.out.println("Lines can't be in reverse order, try again !! ");
                System.exit(0);
            }
        }
        return lines;
    }
}
