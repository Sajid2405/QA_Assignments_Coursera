import java.util.Date;

public class MyTestModel {
    String name;
    int age;
    Date dob;



    @Override
    public String toString() {
        return "name: " + name + " | age = " + age + " | dob: " + dob.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
