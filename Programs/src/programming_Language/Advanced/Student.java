package programming_Language.Advanced;

public class Student {
        int roll;
        int marks;
        String name;
        Student(int r, String n, int m) {
            roll=r;
            name=n;
            marks=m;
        }

        int getRoll() { return roll; }

        String getName() { return name;}

        int getMarks() { return marks;}

}
