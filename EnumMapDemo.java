import java.util.*;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> mpp = new EnumMap<>(Day.class);

        mpp.put(Day.MONDAY, "Walk");
        mpp.put(Day.FRIDAY, "Gym");
        mpp.put(Day.SUNDAY, null);

        System.out.println(mpp);
        System.out.println(mpp.size());
    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
