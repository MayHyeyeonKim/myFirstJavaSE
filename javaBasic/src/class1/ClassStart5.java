package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

//        Student[] students = new Student[]{student1, student2}; 를 최적화하면
        Student[] students = {student1, student2};

//        for (int i = 0; i < students.length; i++) {
//            Student s = students[i];
//            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);}

//        향상된 for문
        for(Student s: students){
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }

}
//자바에서 대입은 항상 변수에 들어 있는 값을 복사한다. In Java, assignment always copies the value stored in a variable.