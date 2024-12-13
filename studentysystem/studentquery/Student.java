package studentquery;


public class Student {
    private String name;
    private String email;
    private String password;
    private String studentID;
    private int grade;
    private int age;
    private String gender;
    private String level;

    public Student(String name, String email, String password, String studentID, int grade, int age, String gender, String level) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.studentID = studentID;
        this.grade = grade;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    // Getter methods
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getStudentID() { return studentID; }
    public int getGrade() { return grade; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getLevel() { return level; }
}
