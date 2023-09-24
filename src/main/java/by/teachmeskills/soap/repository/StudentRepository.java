package by.teachmeskills.soap.repository;

import by.teachmeskills.soap.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {
    private static final List<Student> students = new ArrayList<>();

    @PostConstruct
    public void initData() {

        Student student = new Student();
        student.setName("Вадим");
        student.setCourse(1);
        student.setFaculty("Машиностроение");
        students.add(student);

        Student student2 = new Student();
        student.setName("Оксана");
        student.setCourse(3);
        student.setFaculty("Юридический");
        students.add(student2);

        Student student3 = new Student();
        student.setName("Сергей");
        student.setCourse(5);
        student.setFaculty("IT");
        students.add(student3);
    }

    public Student findStudent(String name) {
        Student student = null;
        for (Student s: students
        ) {
            if (name.equals(s.getName())) {
                student = s;
            }
        }

        return student;
//        return students.stream().filter(student -> student.getName().equals(name)).findAny().orElse(null);
    }
}
