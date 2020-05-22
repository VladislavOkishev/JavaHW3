//Домашня робота. Окішев Владислав. Робота з класами

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Student student = new Student (1, "Морозенко", "Олексій", "Русланович",
                LocalDate.of(1989, Month.MAY,5),
                "Чол", "Українець", "Україна", "Львів",
                "Провулок Невідомого 33", "380967854367", "test@gmail.com",
                "Протестантизм", "Футбол", BloodType.AB, true,
                LocalDate.of(2000, Month.FEBRUARY,3), "Програміст",
                "ПІК-16", (short) 2, "бюджет");
        System.out.println(student.toString());

        Patient patient = new Patient (1, "Морозенко","Олексій", "Русланович", (short) 31, "Чол",
                LocalDate.of(2000, Month.FEBRUARY, 11), "Україна","Житомир",
                "Провулок Невідомого 33","380967854367","test@gmail.com",BloodType.AB,true,
                LocalDate.of(2019, Month.JANUARY, 24), true, "Рак мозку");
        System.out.println(patient.toString());

    }
}
