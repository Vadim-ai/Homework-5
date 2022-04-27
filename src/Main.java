public class Main {
    public static void main(String[] args) {
        //Lesson 5 Task 1 and Task 2
            int[] animals = new int[3];
            animals[0] = 1;
            animals[1] = 2;
            animals[2] = 3;
            System.out.print(animals[0] + ", ");
            System.out.print(animals[1] + ", ");
            System.out.print(animals[2]);

            System.out.println();

            double[] stars = {1.57, 7.654, 9.986};
            System.out.print(stars[0] + ", ");
            System.out.print(stars[1] + ", ");
            System.out.print(stars[2]);


            System.out.println();

            short[] elements = {4, 5, 6};
            System.out.print(elements[0] + ", ");
            System.out.print(elements[1] + ", ");
            System.out.print(elements[2]);

            System.out.println();

            //Lesson 5 Task 3
            System.out.print(elements[2] + ", ");
            System.out.print(elements[1] + ", ");
            System.out.print(elements[0]);

            System.out.println();

            System.out.print(stars[2] + ", ");
            System.out.print(stars[1] + ", ");
            System.out.print(stars[0]);


            System.out.println();

            System.out.print(animals[2] + ", ");
            System.out.print(animals[1] + ", ");
            System.out.print(animals[0]);

            System.out.println();

            //Lesson 5 Task 4

        int animal = animals.length; // потестил))
        for (int i = 0; i < animal; i++) {
            if (animals[i] / 1 == 1 || animals[i] % 2 == 1) {
                animals[i] = animals[i] + 1;
                System.out.println(animals[i]);
            } else {
                System.out.println(animals[i]);
            }

        }

    }
}
