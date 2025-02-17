import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30 ,40 ,50};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Element at index " + i + " is: " + numbers[i]);
        }

        char[] chars = new char[10];
        System.out.println(Arrays.toString(chars));
        int valueInAscii = 65;
        for (int i = 0; i < chars.length; i++){
            chars[i] = (char) valueInAscii;
            valueInAscii++;
        }
        System.out.println(Arrays.toString(chars));

        chars[4] = 'e';
        System.out.println(Arrays.toString(chars));

        double[] doubles = new double[3];
        boolean[] booleans = new boolean[2];
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(booleans));

//        int VS Integer
        int[] ints = new int[10];
        System.out.println(Arrays.toString(ints));
        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));
    }
}
