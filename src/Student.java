import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Student {
    {
        idGenerator++;
    }
    private static long idGenerator = 0;
    private long id = idGenerator;
    private String firstName , middleName, lastName;
    private String date;
    private String adress;
    private int phoneNum, course;
    private String group , faculty;

    public Student(String firstName, String middleName, String lastName, String date, String adress, int phoneNum, String faculty, int course, String group) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.date = date;
        this.adress = adress;
        this.phoneNum = phoneNum;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public static Date DateFormat(String studentDate){
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        try {
            Date date = formatter.parse(studentDate);
            return date;
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public  String toString(){
        return String.format("ID: %3d\t First Name: %10s\t Middle Name: %10s\t Last Name: %10s\t Age: %2s\t Adress: %15s\t Phone Number: %8d\t Course: %2d\t Group: %5s\t\n",
                id,firstName, middleName, lastName, date, adress, phoneNum, course, group);
    }

}
/*
Создать классы, спецификации которых приведены ниже. Определить кон-
структоры и методы set(), get(), toString(). Определить дополнительно
методы в классе, создающем массив объектов. Задать критерий выбора данных
и вывести эти данные на консоль. В каждом классе, обладающем информацией,
должно быть объявлено несколько конструкторов.
1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.
*/