import java.util.TreeMap;

public class MyCalendarII731 {
    public MyCalendarII731() {

    }

    private TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    public boolean book(int start, int end) {
        treeMap.put(start, treeMap.getOrDefault(start, 0) + 1);
        treeMap.put(end, treeMap.getOrDefault(end, 0) - 1);

        int count = 0;
        for (Integer integer : treeMap.values()) {
            count += integer;
            if (count >= 3) {
                treeMap.put(start, treeMap.get(start) - 1);
                treeMap.put(end, treeMap.get(end) + 1);

                return false;
            }
        }

        return true;

    }
}
