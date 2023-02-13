public class Ex05Student {
    private String firstName, lastName, student_id, address;

    public Ex05Student() {

    }

    public Ex05Student(String firstName, String lastName, String student_id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.student_id = student_id;
    }

    public Ex05Student(String firstName, String lastName, String student_id, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.student_id = student_id;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentId(String student_id) {
        this.student_id = student_id;
    }

    public void setAddresss(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentId() {
        return student_id;
    }

    public String getAddress() {
        return address;
    }

    public void printInfo() {
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("Student id: " + this.getStudentId());
        System.out.println("Adress: " + this.getAddress());
    }

}
