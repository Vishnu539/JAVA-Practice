import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> mpp = new HashMap<>();
        mpp.put(1, "Monday");
        mpp.put(2, "Tuesday");
        mpp.put(3, "Wednesday");
        mpp.put(4, "Thursday");
        mpp.put(5, "Friday");

        System.out.println(mpp);

        System.out.println(mpp.get(3));
        System.out.println(mpp.isEmpty());
        System.out.println(mpp.containsKey(4));
        System.out.println(mpp.containsValue("Sunday"));
        System.out.println(mpp.size());
    }
}
