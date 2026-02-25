import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args){
        // ArrayList<Integer> ls = new ArrayList<>();
        // ls.add(1);
        // ls.add(2);
        // ls.add(3);
        // ls.add(4);
        // ls.add(5);
        // for(int i : ls){
        //     System.out.println(i);
        //     if(ls.get(i) == 3) ls.add(6); // throws ConcurrentModificationException
        //     // Cannot modify a ArrayList parallely while reading
        // }


        CopyOnWriteArrayList<Integer> cp = new CopyOnWriteArrayList<>();
        cp.add(1);
        cp.add(2);
        cp.add(3);
        cp.add(4);
        cp.add(5);
        for(int i : cp){
            System.out.println(i);
            if(cp.get(i) == 3) cp.add(6); // will not throw any exception
        }
        System.out.println(cp); // 6 will be added after the loop is completed
    }
}
