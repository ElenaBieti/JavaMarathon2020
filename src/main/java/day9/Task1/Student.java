package day9.Task1;

public class Student extends Human {
    private int groupName;

    public int getGroupName() {
        return groupName;
    }

    public void setGroupName(int groupName) {
        this.groupName = groupName;
    }

    public Student(String name, int groupName) {
        super(name);
        this.groupName = groupName;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);

    }
}
