package tutorials_java;

public class arrays {
    public static void main(String[] args) {
        String[] myArrays = {"Nell", "Mariel", "Angelo", "Reah" };
        int[] myArrays_int = {1, 2, 3, 4 };
        char[] myArrays_char = {'R', 'E', 'A', 'H' };

        // to replace one value on an array to another
        myArrays[1] = "Barbie"; 

        // Prints the first value of "myArrays"
        System.out.println(myArrays[0]);

        // Counts and prints the overall existing values of "myArrays"
        System.out.println(myArrays.length);
    }
}
