package W06_NestedLoops.Exercises;

import java.util.Scanner;

public class P05_PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                for (int k = 97; k < 97 + l; k++) {
                    for (int m = 'a'; m < 'a' + l; m++) {
                        for (int o = 1; o <= n ; o++) {

                            if (o > i && o > j){
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                            }

                        }

                    }
                }
            }
            
        }
    }
}
