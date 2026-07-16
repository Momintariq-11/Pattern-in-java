//Task 6: Repository — Student Data Access
//Right now assume you're saving Student objects directly using file I/O or array logic scattered across your code.
//Build a StudentRepository interface with save(), findById(), findAll(), delete()
//Create an InMemoryStudentRepository implementing it (just use a List or HashMap internally)
//The point: your business logic should depend on the repository interface, not on how data is actually stored. Tomorrow you could swap in a database version without touching business logic
import java.util.*;

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

interface StudentRepository {

    void save(Student student);

    Student findById(int id);

    List<Student> findAll();

    void delete(int id);
}

class InMemoryStudentRepository implements StudentRepository {

    private HashMap<Integer, Student> students = new HashMap<>();

    public void save(Student student) {
        students.put(student.getId(), student);
    }

    public Student findById(int id) {
        return students.get(id);
    }

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    public void delete(int id) {
        students.remove(id);
    }
}

public class repo {

    public static void main(String[] args) {

        StudentRepository repository = new InMemoryStudentRepository();

        repository.save(new Student(1, "ali"));
        repository.save(new Student(2, "subhan"));
        repository.save(new Student(3, "mueed"));
        repository.save(new Student(4, "taha"));
        repository.save(new Student(5, "ahmed"));
        repository.save(new Student(6, "momin"));

        System.out.println("Student with ID 1:");
        Student s = repository.findById(1);

        if (s != null) {
            System.out.println(s.getId() + " " + s.getName());
        }

        System.out.println("\nAll Students:");
        for (Student student : repository.findAll()) {
            System.out.println(student.getId() + " " + student.getName());
        }

        repository.delete(0);

        System.out.println("\nAfter Delete:");
        for (Student student : repository.findAll()) {
            System.out.println(student.getId() + " " + student.getName());
        }
    }
}
