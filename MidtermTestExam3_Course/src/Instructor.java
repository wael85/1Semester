public class Instructor {
    private String name;
    private int officeNumber;

   public Instructor( String name , int officeNumber){
       this.name = name;
       this.officeNumber = officeNumber;
   }

    public String getName() {
        return name;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }
    @Override
    public boolean equals(Object o){
       if ( !(o instanceof Instructor)){
           return false;
       }
       if(((Instructor) o).name.equals(name)&& ((Instructor)o).officeNumber == officeNumber){
       return true;
       }
       return false;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", officeNumber=" + officeNumber +
                '}';
    }
}
