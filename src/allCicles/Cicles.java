package allCicles;

import java.util.Scanner;

public class Cicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int q = sc.nextByte();
//        int power = 1;
//        while (power <= q / 2) {
//            power = 2 * power;
//        }
//        System.out.println(power);

        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += 1;
            System.out.println(sum);
        }

        int product = 1;
        for (int i = 1; i <= 10; i++){
            product *= i;
            System.out.println(product);
        }

    }
}
