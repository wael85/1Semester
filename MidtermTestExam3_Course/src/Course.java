import java.util.ArrayList;

public class Course {
    private String title;
    private Instructor[] instructors;
    private ArrayList<Student> students;

    public Course(String title , Instructor primaryInstructor ){
        this.title = title;
        this.instructors = new Instructor[2];
        instructors[0] = primaryInstructor;
        this.students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    public Instructor getPrimaryInstructor(){
        return instructors[0];
    }
    public void setSecondaryInstructor( Instructor secondaryInstructor){
        instructors[1] = secondaryInstructor;
    }
    public Instructor getSecondaryInstructor(){
        return  instructors[1] != null ? instructors[1]: null;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public int getNumberOfInstructor(){
        int x = instructors[1] == null ? 1 : 2;
        return x;
    }
    public int getNumberOfStudent(int semester){
        int count = 0;
        for (Student x: students) {
            count = x.getSemester() == semester ? count++ : count;
        }
        return count;
    }
    public Student[] getStudentBySemester( int semester){
        ArrayList<Student> studentsInSemester = new ArrayList<>();
        for ( Student x: students) {
            if(x.getSemester() == semester){
                studentsInSemester.add(x);
            }
        }
        return studentsInSemester.toArray(new Student[getNumberOfStudent(semester)]);
    }
    public boolean hasStudent(String name){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
