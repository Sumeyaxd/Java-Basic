package W06_NestedLoops.Lab;

import java.util.Scanner;

public class P01_Clock {
    public static void main(String[] args) {
        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {

                System.out.println(hours + ":" + minutes);

            }
        }

    }
}
