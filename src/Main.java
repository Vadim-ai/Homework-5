import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        //Lesson 5 Task 1 and Task 2
        int[] animals = new int[3];
        animals[0] = 1;
        animals[1] = 2;
        animals[2] = 3;
        int animal = animals.length;
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]);
            if (i != animals.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        double[] stars = {1.57, 7.654, 9.986};
        for (int w = 0; w < stars.length; w++) {
            System.out.print(stars[w]);
            if (w != stars.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        short[] elements = {4, 5, 6};
        for (int v = 0; v < elements.length; v++) {
            System.out.print(elements[v]);
            if (v != elements.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        //Lesson 5 Task 3
        for (int v = elements.length - 1; v >= 0; v--) {
            System.out.print(elements[v]);
            if (v != 0)
                System.out.print(", ");
        }

        System.out.println();

        for (int w = elements.length - 1; w >= 0; w--) {
            System.out.print(stars[w]);
            if (w != 0)
                System.out.print(", ");
        }

        System.out.println();

        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(animals[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();

        //Lesson 5 Task 4


        for (int i = 0; i < animal; i++) {
            if (animals[i] % 2 == 1) {
                System.out.println(++animals[i]);
            } else {
                System.out.println(animals[i]);
            }

        }

        // Lesson 5 Task 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++)
            for (int k = 0; k < matrix[0].length; k++) {
                if (i == k || i + k == 2) {
                    matrix[i][k] = 1;
                }
            }
        for (int[] row : matrix) {

            for (int column : row) {

                System.out.print(column + " ");

            }
            System.out.println();
        }

        // Lesson 5 Task 6


        int[] arrayWithMistake = {5, 4, 3, 2, 1};
        int[] arrayCorrect = arrayWithMistake.clone();        // нагуглил
        Arrays.sort(arrayCorrect);
        System.out.println(Arrays.toString(arrayCorrect));

        // Lesson 5 Task 7
        for (int i = 0; i < (arrayCorrect.length - 1)/2; i++) {
            int corrector = arrayCorrect[i];
            arrayCorrect[i] = arrayCorrect[arrayCorrect.length - i - 1];
            arrayCorrect[arrayCorrect.length -i - 1] = corrector;
            }
        System.out.println(Arrays.toString(arrayCorrect));
        
        System.out.println();


         // Lesson 5 Task 8
         int[] kapit = {-6, 2, 5, -8, 8,10,4,-7,12,1};
         int x;
         Arrays.sort(kapit);
            System.out.println(Arrays.toString(kapit));
        for (int i = 0; i < kapit.length; i++) {
             x = -2 - kapit[i];
            int y = Arrays.binarySearch(kapit, x);
            if (y >= 0 ) {
             System.out.println(kapit[i] + " , " + kapit[y]);
             break;
            }

        }

        

        // Lesson 5 Task 9
        int[] arrays1 = {-6, 2, 5, -8, 8,10,4,-7,12,1};
        for (int i = 0; i < arrays1.length; i++) {
            for (int j = i + 1; j < arrays1.length; j++) {
                if (arrays1[i] + arrays1[j] == -2) {
                    System.out.println(arrays1[i] + " , " + arrays1[j]);
                }
            }
        }
               // Lesson 5 Task 9.1
               int[] kapit1 = {-6, 2, 5, -8, 8,10,4,-7,12,1};
               Arrays.sort(kapit1);
                  System.out.println(Arrays.toString(kapit1));
              for (int i = 0; i < kapit1.length; i++) {
                   int x1 = -2 - kapit1[i];
                  int y = Arrays.binarySearch(kapit1, x1);
                  if (y >= 0 ) {
                   System.out.println(kapit1[i] + " , " + kapit1[y]);

                  }

              }




    }
}
