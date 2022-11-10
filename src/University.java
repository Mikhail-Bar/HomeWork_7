import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class University {

    private String name_uni;
    private ArrayList<Student> studentList = new ArrayList<>();

    University(String name_uni){
        this.name_uni = name_uni;
    }

    void addStudentToList(Student student){
        studentList.add(student);
    }

    void getStudentByFaculty(String faculty){
        List<Student> list = new ArrayList<>();
        System.out.println("Students studying at the " + faculty + ": ");
        for(Student s : studentList){
            if (s.getFaculty().equals(faculty))
                System.out.print(s);
        }
    }

    void getStudentByGroup(String group){
        List<Student> list = new ArrayList<>();
        System.out.println("Students studying at the group " + group + ": ");
        for(Student s : studentList){
            if (s.getGroup().equals(group))
                System.out.print(s);
        }
    }
    void getAllStudentByFacultyAndCourse(){

        TreeSet<Integer> course = new TreeSet<>();
        TreeSet<String> faculty = new TreeSet<>();

        System.out.println("All faculty and courses: ");

        for(Student s : studentList){
            course.add(s.getCourse());
            faculty.add(s.getFaculty());
        }
        for(String f:faculty){
            System.out.println(f + ": ");
            for(Integer c:course){
                System.out.println("Course "+ c +": ");
                for(Student s:studentList){
                    if (s.getFaculty().equals(f) && s.getCourse() == c)
                        System.out.print(s);
                }
            }
        }
    }

    void getAllStudentByAge(String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        Date curr_date = new Date();
        curr_date = formatter.parse(date);
        Date s_date = new Date();
        System.out.println("Student born after " + date + ": " );
        for (Student s:studentList) {
            s_date = formatter.parse(s.getDate());
            if (curr_date.before(s_date) == true)
                System.out.print(s);
        }

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