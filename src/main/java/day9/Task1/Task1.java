package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Лисичкин Антон", 17);
        Teacher teacher = new Teacher("Степан Васильевич", "Природаведенье");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());
         student.printInfo();
         teacher.printInfo();



    }
}
