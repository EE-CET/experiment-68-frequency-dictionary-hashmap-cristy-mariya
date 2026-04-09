import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] words = line.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Print result
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
