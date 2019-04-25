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

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        this.setGpa(grade, courseCredits);
    }

    @Override
    public String toString() {
        return name + ": " + studentId + ", " + this.getGradeLevel();
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits < 30) {
            return "Freshman Status";
        } else if (this.numberOfCredits < 60) {
            return "Sophomore Status";
        } else if (this.numberOfCredits < 90) {
            return "Junior Status";
        } else {
            return "Senior Status";
        }
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }
}