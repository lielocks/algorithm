import java.util.HashMap;

class Solution {
    public boolean solution(String[] phoneBook) {
        
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i);
        }

        for (int k = 0; k < phoneBook.length; k++) {
            for (int j = 0; j < phoneBook[k].length(); j++) {
                if (map.containsKey(phoneBook[k].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}