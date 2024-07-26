import java.util.*;

public class Clxns {
    public static void main(String[] args) {
        List<Object> arr1 = new ArrayList<>();   // can store any data as Object is generic type in java...
        int[] arr2 = {5, 6, 7};
        // for(int i=0; i<arr2.length; i++) {
        //     System.out.println(arr2[i]);
        // }
        for(int x: arr2) {
            System.out.println(x);
        }

        Map<String, Integer> marksMap = new HashMap<>();
        marksMap.put("iJKl", 500);
        marksMap.put("abcd", 100);
        marksMap.put("efgh", 200);

        for(Map.Entry<String, Integer> entry: marksMap.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        // System.out.println(marksMap.get("xyz")>10);   // throws null pointer exception, as "xyz" is not in marksMap
        Optional<Integer> marksOfXyz = Optional.ofNullable(marksMap.get("xyz"));
        if(marksOfXyz.isEmpty()) {
            System.out.println("'xyz' not present");
        }
    }    
}