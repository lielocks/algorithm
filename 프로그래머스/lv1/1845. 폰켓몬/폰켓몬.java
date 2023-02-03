import java.util.*;

public class Solution {
  public int solution(int[] nums) {
    int max = nums.length / 2;

    HashSet<Integer> numsSet = new HashSet<>();

    for (int num : nums) {
      numsSet.add(num);
    }
      
    return numsSet.size() > max ? max : numsSet.size();
  }
}
