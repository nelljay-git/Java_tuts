class conditions {
    public static void main(String[] args) {
        int number = 10;
        double dec_number = 1.2;
        char letter = 'H';
        String name = "Karl";
        boolean is_switch = true;

        // conditions
        // if - statement

         if (number == 10) {
            System.err.println("The number is 10");
        } 

        // if-else statement

         if (name == "Nell") {
            System.err.println("The name is Nell");
        } else {
            System.err.println("The name is not Nell");
        }



        // if-else if-else statement 

         if (letter == 'R') {
            System.err.println("The letter is R");
        } else if (letter == 'A') {
            System.err.println("The letter is A");
        } else if (letter == 'H') {
            System.err.println("The letter is H");
        }



     // Ternary Operator 

     String result = (dec_number == 1.0) ? "The number is 1.0" : "The number is not 1.0";

     System.out.println(result);
    }
}
