package C14_1_This_SpecificatoriAcess_Static.ClassEx1;

public class ClassEx1 {

    String nume;
    String prenume;
    String emailAdress;

    // 1. 'getter' pentru 'emailAgress'
    public String getEmailAdress() {
        return emailAdress;
    }

    // 2. 'setter' pentru 'emailAdress'
    public void setEmailAdress(String newEmailAdress) {
        emailAdress = newEmailAdress;
    }

    // 3. 'getter' + 'setter' nume/prenume
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

    // 4. setter & getter for 'fullName'
    public String getFullName (String nume, String prenume) {
        return this.nume + " " + this.prenume;

    }

    public void setFullName (String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
}


