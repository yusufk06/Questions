package Questions;

import java.util.Arrays;
import java.util.Collection;

public class Arraysoru1 {
    public static void main(String[] args) {

        /*
        6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
         */

        int []array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);

        int[] tersArray=new int[array.length];
        int a=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0){
                tersArray[a++]=array[i];

            }
        }
        System.out.println(Arrays.toString(tersArray));
    }
}
