public class Guest {
    private String name;
    private long phone;

    public Guest( String name, long phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Guest)){
            return false;
        }else {
            return ((Guest) o).name.equals(name) && ((Guest) o).phone == phone;
        }
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
