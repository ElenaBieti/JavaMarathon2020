package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;

    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomEvaluate = random.nextInt(4) + 2;
        String evaluate = "";
        switch (randomEvaluate) {
            case 5:
                evaluate = "Отлично";
                break;
            case 4:
                evaluate = "Хорошо";
                break;
            case 3:
                evaluate = "Удовлетворительно";
                break;
            case 2:
                evaluate = "Плохо";
                break;
        }
        System.out.println(" Преподаватель:" + this.name + "oценил" + " cтудента с именем: " + student.getName() +
                " по предмету " + this.object + " на оценку: " + evaluate);
    }
}
