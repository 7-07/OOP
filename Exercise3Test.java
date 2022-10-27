package ex1;

import java.util.Scanner;

public class Exercise3Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of columns + rows of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] m = new double[row][column];

        System.out.println("Enter data of the array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        Exercise3 location = Exercise3.findLargest(m);

        System.out.println("Location of the largest element is: " + location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }

}
