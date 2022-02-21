import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        HashSet list = new HashSet();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        // iteratorSMS 1회용이라 다쓰고나면 다시 얻어와야한다
//        it = list.iterator();
//
//        while(it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);
//        }
        System.out.println();

        // hashset 일경우 get이 없기 때문에 동작하지 않음
//        for(int i=0; i < list.size(); i++){
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }
    }
}
