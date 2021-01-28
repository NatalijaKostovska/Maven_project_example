import java.util.LinkedList;
import java.util.List;

public class Student_CRUD {
    List<Student>students = new LinkedList<Student>();
    public void insertStudent(Student student){
        students.add(student);
    }
    public void deleteStudent(Student student){
        students.remove(student);
    }
    public void showAllStudents(List<Student>students){
        for(int i=0;i<students.size();i++){
            System.out.print(students.get(i));
        }
    }
    public void updateStudent(Student student, int newId, String newFirstName, String newLastName){
        student.setId(newId);
        student.setFirstName(newFirstName);
        student.setLastName(newLastName);
    }
}
