package leetCode.Easy.String;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuffer temp = new StringBuffer();
        s = s.trim().toLowerCase();

        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122 )
                    || (s.charAt(i) >= 48 && s.charAt(i) <= 57 ))  temp.append(s.charAt(i));
        }

        for(int i=0, j=temp.length()-1; i<j; i++, j--) {
            if(temp.charAt(i) != temp.charAt(j)) return false;
        }
        return true;
    }
}
