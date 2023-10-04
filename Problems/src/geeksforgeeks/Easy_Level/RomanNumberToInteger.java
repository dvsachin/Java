package geeksforgeeks.Easy_Level;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberToInteger {
    public int romanToDecimal(String s) {
        // code here
        int ans = 0;
        Map<Character,Integer> romans = new HashMap<Character,Integer>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);

        // add a last character value in ans
        ans = romans.get(s.charAt(s.length()-1));

        // start from 2nd last element to comapre values
        for(int i=s.length()-2; i>=0; i--) {
            // if left (current) element is smaller then substract
            if(romans.get(s.charAt(i)) < romans.get(s.charAt(i+1)))
                ans = ans - romans.get(s.charAt(i));
            else
                // if right (i+1) element is smaller then addition
                ans = ans + romans.get(s.charAt(i));
        }

        //  IV => I < V = 1 < 5 true then substract 1 from 5
        //  VI => V < I = 5 < 1 false then add 1 to 5
        return ans;
    }
}
