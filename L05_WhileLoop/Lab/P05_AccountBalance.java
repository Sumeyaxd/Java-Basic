package W05_WhileLoop.Lab;

import java.util.Scanner;

public class P05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyInBank = 0;
        String input = scanner.nextLine();

         while (!input.equals("NoMoreMoney")){

             double money = Double.parseDouble(input);

             if (money<0){
                 System.out.println("Invalid operation!");
                 break;
             }

             moneyInBank+=money;
             System.out.printf("Increase: %.2f%n", money);
             input = scanner.nextLine();


        }


        System.out.printf("Total: %.2f", moneyInBank);





    }
}
