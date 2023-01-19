package Questions;

import java.util.*;

public class Arraysoru1 {
    public static void main(String[] args) {

        /*
        6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
         */
        System.out.println("------Collection ile terse cevirme---------");
        int[] array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);
        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            sayilar.add(array[i]);

        }
        Collections.reverse(sayilar);
        System.out.println(sayilar);




       int[] array1 = {10, 1, 5, 1, 2, 1};
        Arrays.sort(array);
        int[] tersArray=new int[array.length];
        int a=0;
        for (int i = 0; i < array.length; i++) {
            if (array1[i]>1){
                tersArray[a++]=array1[i];

            }
        }
        System.out.println(Arrays.toString(tersArray));
    }
    }
