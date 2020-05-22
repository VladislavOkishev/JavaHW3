import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String surName;
    public short age;
    private String sex;
    private LocalDate birthday;

    public Person() {}

    public Person(Integer id, String firstName, String lastName, String surName, short age, String sex, LocalDate birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    public boolean isAdult(){
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(getBirthday()));
        LocalDate localDate = LocalDate.now();
        int d2 = Integer.parseInt(formatter.format(localDate));
        int age = (d2 - d1)/10000;
        if(age>=18)return true;
        else return false;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
