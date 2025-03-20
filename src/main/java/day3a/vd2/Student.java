package day3a.vd2;

public class Student {
    // Default, public, protected, private
    // Default: chỉ có thể truy cập trong cùng 1 packages
    String name; // default
    public String address;
    protected String school;
    // private không thể truy cập bên ngoài class
    private String id;

    public Student(String name, String address, String school, String id) {
        this.name = name;
        this.address = address;
        this.school = school;
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
