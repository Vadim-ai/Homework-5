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
             for (int v = elements.length - 1; v >= 0 ; v--) {
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

    }
}

