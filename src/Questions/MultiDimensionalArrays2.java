package Questions;

public class MultiDimensionalArrays2 {
    /*
    Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana
    yazdiran bir program yaziniz.
    { {1,2,3}, {4,5}, {6} }
    */
    public static void main(String[] args) {
        int carpim=1;
        int sonEleman=0;
        int[][] arr={ {1,2,3}, {4,5}, {6} };

        for (int i = 0; i < arr.length; i++) {
            carpim*=arr[i][arr[i].length-1];




        }
        System.out.println(carpim);
    }
}
