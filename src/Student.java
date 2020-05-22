import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String surName;
    private LocalDate birthday;
    private String sex;
    private String nationality;

    private String country;
    private String town;
    private String address;
    private String phone;
    private String email;

    private String religion;
    private String hobbies;
    private BloodType bloodType;
    private Boolean isMarried;

    private LocalDate startStudying;
    private String speciality;
    private String group;
    private Short yearStudying;
    private String formStudying;

    public Student() { }

    public Student(int id, String firstName, String lastName, String surName, LocalDate birthday,
                   String sex, String nationality, String country, String town, String address,
                   String phone, String email, String religion, String hobbies, BloodType bloodType, Boolean isMarried,
                   LocalDate startStudying, String speciality, String group, short yearStudying, String formStudying) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.birthday = birthday;
        this.sex = sex;
        this.nationality = nationality;
        this.country = country;
        this.town = town;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.religion = religion;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
        this.isMarried = isMarried;
        this.startStudying = startStudying;
        this.speciality = speciality;
        this.group = group;
        this.yearStudying = yearStudying;
        this.formStudying = formStudying;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Boolean getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }

    public LocalDate getStartStudying() {
        return startStudying;
    }

    public void setStartStudying(LocalDate startStudying) {
        this.startStudying = startStudying;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String kindOfSport) {
        this.group = group;
    }

    public short getYearStudying() {
        return yearStudying;
    }

    public void setYearStudying(short yearStudying) {
        this.yearStudying = yearStudying;
    }

    public String getFormStudying() {
        return formStudying;
    }

    public void setFormStudying(String formStudying) {
        this.formStudying = formStudying;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", nationality='" + nationality + '\'' +
                ", country='" + country + '\'' +
                ", town='" + town + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", religion='" + religion + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", bloodType=" + bloodType +
                ", isMarried=" + isMarried +
                ", startStudying=" + startStudying +
                ", speciality='" + speciality + '\'' +
                ", group='" + group + '\'' +
                ", yearStudying=" + yearStudying +
                ", formStudying='" + formStudying + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                surName.equals(student.surName) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(nationality, student.nationality) &&
                Objects.equals(country, student.country) &&
                Objects.equals(town, student.town) &&
                Objects.equals(address, student.address) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(email, student.email) &&
                Objects.equals(religion, student.religion) &&
                Objects.equals(hobbies, student.hobbies) &&
                bloodType == student.bloodType &&
                Objects.equals(isMarried, student.isMarried) &&
                Objects.equals(startStudying, student.startStudying) &&
                Objects.equals(speciality, student.speciality) &&
                Objects.equals(group, student.group) &&
                Objects.equals(yearStudying, student.yearStudying) &&
                Objects.equals(formStudying, student.formStudying);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, surName, birthday, sex, nationality, country, town, address, phone, email, religion, hobbies, bloodType, isMarried, startStudying, speciality, group, yearStudying, formStudying);
    }
}
