package src.C7_EnhancedFor_Enum.ClassEx2;

public class Students {

    String nume;
    String prenume;
    int age;
    ApplicationStatus applicationStatus;

    public Students(String nume, String prenume, int age) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @Override
    public String toString() {
        return "Students{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", age=" + age +
                ", applicationStatus=" + applicationStatus +
                '}';
    }
}
