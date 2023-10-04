package leetCode.Easy.String;

public class FindMaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        boolean[] visited = new boolean[words.length];

        String word;

        for(int i=0; i<words.length; i++) {
            word = reverse(words[i]);

            for(int j=i+1; j<words.length; j++) {
                if(word.equals((words[j])) && !visited[j]) {
                    count++;
                    visited[j]=true;
                    break;
                }
            }
        }
        return count;
    }
    private String reverse(String s) {
        StringBuilder temp = new StringBuilder(s);
        return temp.reverse().toString();
    }
}
