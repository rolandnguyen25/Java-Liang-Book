package Chap1;

/**
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
 2 * 2 system of linear equation:

 ax + by = e
 cx + dy = f    x = ed - bf / ad - bc  y = af - ec / ad - bc

 Write a program that solves the following equation and displays the value for x and y:
 3.4x + 50.2y = 44.5
 2.1x + .55y = 5.9
 */

public class Exercise_1_13_Solve_2_by_2_Linear_Equations {

    public static void main(String[] args) {
        System.out.print("x is: ");
        System.out.println(((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (2.1 * 50.2)));
        System.out.print("y is: ");
        System.out.println(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1)));
    }
}
