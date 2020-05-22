import java.time.LocalDate;
import java.util.Objects;

public class Patient extends Person{

    private String country;
    private String town;
    private String address;
    private String phone;
    private String email;

    private BloodType bloodType;
    private Boolean isMarried;

    private LocalDate startTreatment;
    private Boolean isInsurance;
    private String diseases;

    public Patient() { }

    public Patient(Integer id, String firstName, String lastName, String surName, short age, String sex, LocalDate birthday, String country, String town, String address, String phone, String email, BloodType bloodType, Boolean isMarried, LocalDate startTreatment, Boolean isInsurance, String diseases) {
        super(id, firstName, lastName, surName, age, sex, birthday);
        this.country = country;
        this.town = town;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.bloodType = bloodType;
        this.isMarried = isMarried;
        this.startTreatment = startTreatment;
        this.isInsurance = isInsurance;
        this.diseases = diseases;
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

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }

    public LocalDate getStartTreatment() {
        return startTreatment;
    }

    public void setStartTreatment(LocalDate startTreatment) {
        this.startTreatment = startTreatment;
    }

    public Boolean getInsurance() {
        return isInsurance;
    }

    public void setInsurance(Boolean insurance) {
        isInsurance = insurance;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return  Objects.equals(country, patient.country) &&
                Objects.equals(town, patient.town) &&
                Objects.equals(address, patient.address) &&
                Objects.equals(phone, patient.phone) &&
                Objects.equals(email, patient.email) &&
                bloodType == patient.bloodType &&
                Objects.equals(isMarried, patient.isMarried) &&
                Objects.equals(startTreatment, patient.startTreatment) &&
                Objects.equals(isInsurance, patient.isInsurance) &&
                Objects.equals(diseases, patient.diseases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, town, address, phone, email, bloodType, isMarried, startTreatment, isInsurance, diseases);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + super.getFirstName() +
                ", lastName='" + super.getLastName() + '\'' +
                ", surName='" + super.getSurName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", sex='" + super.getSex() + '\'' +
                ", birthday='" + super.getBirthday() + '\'' +
                ", country='" + country + '\'' +
                ", town='" + town + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", bloodType=" + bloodType +
                ", isMarried=" + isMarried +
                ", startTreatment=" + startTreatment +
                ", isInsurance=" + isInsurance +
                ", diseases='" + diseases + '\'' +
                '}';
    }
}
