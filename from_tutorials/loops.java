package tutorials_java;

public class loops {
    public static void main(String[] args) {
        // for-loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // while-loop

        int i = 0;
        while (i < 5) {
        System.out.println("Iteration: " + i);
        i++;
}
        // do-while-loop
        int number = 0;
        do {
         System.out.println("Iteration: " + number);
          i++;
        } while (number < 5);

        // for-each Loop

       int[] numbers = {1, 2, 3, 4, 5};
       
       for (int num : numbers) {
       System.out.println(num);
}

    }
}
