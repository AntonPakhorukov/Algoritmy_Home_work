package Home_work;

import java.util.Random;

public class hw_01 {
    public static void main(String[] args) {

        int[] array = createArray(10, 10, 100);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        
    }

    public static int[] createArray (int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Random.randInt(min, max);
        }
        return array;
    }    
}
