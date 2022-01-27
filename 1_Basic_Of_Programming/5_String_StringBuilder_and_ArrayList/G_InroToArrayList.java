import java.util.ArrayList;

public class G_InroToArrayList {
    public static void main(String[] args) {
        // Array List can be increase or decrease it size according to data.
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+"  --->   "+list.size());
        
        //add function in ArrayList 
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list+"  --->   "+list.size());
        // add number in between
        list.add(1,1000);

        // to get value from ArrayList
        int val = list.get(1);
        System.out.println(list+"  --->   "+list.size());
        
        //to change the contant of a arrayList
        list.set(1, 2000);
        System.out.println(list+"  --->   "+list.size());

        // to remove or delete the value
        list.remove(1);
        System.out.println(list+"  --->   "+list.size());

        // ArrayList can be a Integer ,String or any other
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Dilber");
        l2.add("Husain");
        l2.add("Khan");
        System.out.println(l2+"   -->   "+l2.size());
        
        //loop in ArrayList
        System.out.println("Loop1");
        for(int i=0;i<list.size();i++){
            int val2 = list.get(i);
            System.out.println(val2);
        }
        System.out.println("Loop 2");  
        for(String val3:l2){
            System.out.println(val3);
        }

        System.out.println("Simply print list --> "+list);
    }
    
}