import java.util.Arrays;

public class ExHome {
    public static void main(String[] args) {

        // לולאת for
        System.out.println("Using for loop:");

        int loops = 0;
        for (int i = 0; i <= 30; i += 2) {
            System.out.print(i + ", ");

        }

        // לולאת while
        System.out.println("\n");
        System.out.println("\nUsing while loop:");

        while (loops <= 30) {
            System.out.print(loops + ", ");
            loops += 2;
        }

        System.out.println("\n");
        System.out.println();

        int[][] multidimensionalArr = {
                {2, 4, 6, 8, 10},
                {12, 14, 16, 18, 20}
        };
        System.out.println(

        );
        System.out.println("\nUsing for loop:");

        for (int i = 0; i < multidimensionalArr.length; i++) {
            for (int j = 0; j < multidimensionalArr[i].length; j++) {
                System.out.print(multidimensionalArr[i][j] + ", ");
            }
        }

        System.out.println("\n");
        System.out.println("\nUsing for each loop:");


        for (int[] number1 : multidimensionalArr) {
            for (int number2 : number1) {
                System.out.print(number2 + ", ");
            }
            System.out.println();
        }
    }
}
