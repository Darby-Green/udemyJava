public class whatIsObject {
    public static void main(String[] args) {
        Student2 max = new Student2("Max", 21);
        System.out.println(max.toString());

        primarySchoolStudent Jimmy = new primarySchoolStudent("Jimmy",
                8, "Carol");
        System.out.println(Jimmy);
    }
}
class Student2 {
    private String name;
    private int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
     }
}

class primarySchoolStudent extends Student2 {
    private String parentName;
    primarySchoolStudent(String name,int age, String parentName) {
        super(name,age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
