import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        University university = new University("VSU");
        university.addStudentToList(new Student("Ivan","Ivanovich", "Ivanov","10.01.2001","Lenuna 15A",123456,"Mathematical Faculty",2,"14z"));
        university.addStudentToList(new Student("Petr","Petrovich", "Petrov","20.01.2000","Suvorova 17S",654321,"Mathematical Faculty",2,"13z"));
        university.addStudentToList(new Student("Arthor","Ivanovich", "Sidorov","30.01.2001","Pushkina 19",456321,"Mathematical Faculty",1,"14z"));
        university.addStudentToList(new Student("Petr","Mikhailovich", "Pushkin","10.01.2001","Titova 12",123456,"Mathematical Faculty",3,"12z"));
        university.addStudentToList(new Student("Ivan","Ivanovich", "Ivanov","10.01.2001","Lenuna 15A",987654,"Historical Faculty",1,"10z"));
        university.addStudentToList(new Student("Petr","Petrovich", "Petrov","20.01.2000","Suvorova 17S",789456,"Historical Faculty",2,"9z"));
        university.addStudentToList(new Student("Arthor","Ivanovich", "Sidorov","30.01.2001","Pushkina 19",954786,"Historical Faculty",1,"10z"));
        university.addStudentToList(new Student("Petr","Mikhailovich", "Pushkin","10.01.2001","Titova 12",846579,"Historical Faculty",3,"11z"));
        university.addStudentToList(new Student("Ivan","Ivanovich", "Ivanov","10.01.2001","Lenuna 15A",513246,"Linguistic Faculty",1,"21z"));
        university.addStudentToList(new Student("Petr","Petrovich", "Petrov","20.01.2000","Suvorova 17S",512364,"Linguistic Faculty",2,"19z"));
        university.addStudentToList(new Student("Arthor","Ivanovich", "Sidorov","30.01.2001","Pushkina 19",653421,"Linguistic Faculty",1,"21z"));
        university.addStudentToList(new Student("Petr","Mikhailovich", "Pushkin","10.01.2001","Titova 12",214356,"Linguistic Faculty",3,"18z"));


        university.getStudentByFaculty("Mathematical Faculty");
        university.getAllStudentByFacultyAndCourse();
        university.getAllStudentByAge("20.01.2001");
        university.getStudentByGroup("14z");

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