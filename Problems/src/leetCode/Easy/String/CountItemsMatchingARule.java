package leetCode.Easy.String;

import java.util.HashMap;
import java.util.List;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String,Integer> rules = new HashMap<>();
        rules.put("type", 0);
        rules.put("color", 1);
        rules.put("name", 2);

        int idx = rules.get(ruleKey);
        int count = 0;

        for(List<String> item : items) {
            if(item.get(idx).equals(ruleValue)) count++;
        }
        return count;
    }
}
