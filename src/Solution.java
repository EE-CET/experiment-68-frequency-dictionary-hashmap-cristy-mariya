import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read full line
        String line = sc.nextLine();

        // Split into words
        String[] words = line.split(" ");

        // Create HashMap
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
