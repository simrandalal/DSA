import java.util.*;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : arr){
            freq
        }
    }
}
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count how many times each number appears
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            // freqMap.getOrDefault(num, 0) means: if num is not in map, assume 0
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Add all the frequencies to a set
        Set<Integer> freqSet = new HashSet<>();
        for (int count : freqMap.values()) {
            // If set already has the frequency, return false
            if (!freqSet.add(count)) {
                return false;
            }
        }

        // All frequencies were unique
        return true;
    }
}
