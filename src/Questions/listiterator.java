package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class listiterator {
    public static void main(String[] args) {

        /*
        ) Bir listedeki elementleri iterator kullanarak sondan basa dogru
yazdirin. (ListIterator kullanilacak)
         */
        List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        ListIterator<Integer> itr = list.listIterator();
        while (itr.hasNext()){
            itr.next();
        }
        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
        System.out.println();
        System.out.println(list);
    }
    }

