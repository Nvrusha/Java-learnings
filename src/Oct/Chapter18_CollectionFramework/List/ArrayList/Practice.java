package Oct.Chapter18_CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("Levi");
        arrayList.add("Tomioka");
        arrayList.add("Drogon");
        arrayList.add("Groot");
        arrayList.add("Toby");

        ArrayList arrayList1 = new ArrayList();

        arrayList1.add("Naruto");
        arrayList1.add("Jiraya");
        arrayList1.add("Goku");

        List allList = new ArrayList();

        allList.add(arrayList1);
        allList.add(arrayList);

        System.out.println(allList);

//        for (Object i : arrayList){
//            System.out.println(i);
//        }

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

       Iterator iterator = arrayList.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

    }
}
