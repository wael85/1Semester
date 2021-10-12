public class Student {
    private String name;
    private int semester;

    public Student(String name , int semester){
       this.name = name;
       this.semester =semester;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }
    @Override
    public boolean equals(Object o ){
        if ( !( o instanceof Student)){
            return false;
        }
        if(((Student)o).name.equals(name) && ((Student) o).semester == semester){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                '}';
    }
}
