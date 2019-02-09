import java.util.ArrayList;

class StudentList {

    private  ArrayList<Student> students;


    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudentBystCode(String stCode) {

    }
    public void showAllStudent(){
       System.out.println(students);
    }
    public  int searchStudentBystCode (String stCode) { // return index array list
        return 0;
    }
    public int getNumberOfStudent() { // return number of student
        return 0;
    }
    public StudentList(){
        students = new ArrayList<Student>();
    }
}