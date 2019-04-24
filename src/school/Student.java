package school;

// Code from launchcode lesson

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getNumberofCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(Integer aCredit) {
        numberOfCredits += aCredit;
    }

    private Double getGpa() {
        return gpa;
    }

    private void setGpa(Double aGpa, Integer numCredits) {
        gpa = ((getGpa()*getNumberofCredits()) + (aGpa*numCredits))
                / getNumberofCredits()+numCredits;
    }

}