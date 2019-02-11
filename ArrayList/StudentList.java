import java.util.*;

class StudentList {

    private ArrayList<Student> students;

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentBystCode(String stCode) {
        for (int i = 0; i < students.size(); i++)
                {
                    if (students.get(i).GetCode() == stCode)
                    students.remove(i); 
                }
                System.out.println("NOT FOUND");
    }   

    public void showAllStudent() {
        System.out.println(students);
    }

    public int searchStudentBystCode(String stCode) { // return index array list
        for(int i = 0; i < students.size(); i++)
            if(students.get(i).GetCode() == stCode)
                {
                    return i+1;
                }
            return 0;
    }
    public int getNumberOfStudent() { // return number of student
        return students.size();
    }

    public StudentList() {
        students = new ArrayList<Student>();
    }
}