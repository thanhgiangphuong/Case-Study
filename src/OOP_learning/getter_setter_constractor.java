package OOP_learning;

public class getter_setter_constractor {
    private String Name;
    private int Age;

    public getter_setter_constractor() {
    }

    public getter_setter_constractor(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Name: " + Name + "\t Age: " + Age;
    }

    public static void main(String[] args) {
        getter_setter_constractor s = new getter_setter_constractor("Giang", 28);
        System.out.println(s);

        getter_setter_constractor s1 = new getter_setter_constractor();
        s1.setName("Ki");
        s1.setAge(26);
        System.out.println(s1);


    }
}


