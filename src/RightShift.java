import java.util.Arrays;

public class RightShift {
    public static int[] rightShift(int[] array, int step){
        // your code is here and nowhere more
        for(int i = 0; i < step; i++){
            int j, last;
            //Stores the last element of array
            last = array[array.length-1];

            for(j = array.length-1; j > 0; j--){
                //Shift element of array by one
                array[j] = array[j-1];
            }
            //Last element of array will be added to the start of array.
            array[0] = last;
        }
        return  array;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}
