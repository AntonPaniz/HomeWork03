package src.com.vivamostoles.homework03;

public class Student {
    private String firstName;
    private String lastName;
    private String studyDepartment;
    private String nativeCity;

    public Student(String firstName, String lastName, String studyDepartment, String nativeCity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studyDepartment = studyDepartment;
        this.nativeCity = nativeCity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudyDepartment() {
        return studyDepartment;
    }

    public void setStudyDepartment(String studyDepartment) {
        this.studyDepartment = studyDepartment;
    }

    public String getNativeCity() {
        return nativeCity;
    }

    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studyDepartment='" + studyDepartment + '\'' +
                ", nativeCity='" + nativeCity + '\'' +
                '}';
    }
}
