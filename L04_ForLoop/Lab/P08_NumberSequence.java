package W04_ForLoop.Lab;

import java.util.Scanner;

public class P08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int number = 1; number <=n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            // проверка дали числото е максимално
            if (value>max){
                max=value;
            }
            if (value<min){
                min=value;
            }
        }



        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
