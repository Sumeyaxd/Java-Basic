package W02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P04_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String unit1 = scanner.nextLine();
        String unit2 = scanner.nextLine();

        //double result =0;

        if(unit1.equals("mm")){
            number=number/1000;
        }else if(unit1.equals("cm")){
            number = number/100;
        }

        if (unit2.equals("mm")){
            number = number*1000;
        }else if(unit2.equals("cm")){
            number=number*100;
        }

        System.out.printf("%.3f",number);
    }
}
