package Questions;

public class arrays {
    /*
    Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
     */
    public static void main(String[] args) {

       int [] arr1= {1,2,3,4,5};
       int [] arr2= {4,5,6,7,8,9,5};
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    System.out.print(k + ",");
                }
            }
        }




    }
}
