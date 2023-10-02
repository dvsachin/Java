package leetCode.Easy.String;

public class RingsAndRods {
    public int countPoints(String rings) {
        RGB[] value = new RGB[10];
        char ch;
        int count = 0;

        for(int i=0; i<value.length; i++) value[i] = new RGB();

        for(int i=0; i<rings.length()-1; i+=2) {
            int idx = rings.charAt(i+1) - '0';
            ch = rings.charAt(i);

            if(ch == 'R') value[idx].red = true;
            else if(ch == 'G') value[idx].green = true;
            else if(ch == 'B') value[idx].blue = true;
        }

        for(int i=0; i<value.length; i++) {
            RGB obj = value[i];
            if(obj.red && obj.green && obj.blue) count++;
        }
        return count;

    }
}
class RGB {
    boolean red;
    boolean green;
    boolean blue;
}