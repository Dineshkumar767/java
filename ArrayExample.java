class Student {
    int id;
    String name;
    String course;
}

public class ArrayExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Jarvis";
        s1.course = "AI";

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Friday";
        s2.course = "AI";

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Edith";
        s3.course = "AI";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].id + " " + students[i].name + " " +
        // students[i].course);
        // }

        for (Student n : students) {
            System.out.println(n.id + "    " + n.name + " " + n.course);
        }
    }
}
