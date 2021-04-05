package src.C10_SuperClasaObject_Mostenire2.ClassEx1;

public class Person extends Being {

    private String nume;
    private String prenume;
    private int varsta;
    private int numarDeOrdine;

    public Person(String species, String nume, String prenume, int varsta, int numarDeOrdine) {
        super(species);
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.numarDeOrdine = numarDeOrdine;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // for performance reasons
            return true;
        }

        if (obj == null) {
            return false;
        }

        // both objects have the same type
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Person personObj = (Person)obj;
        if (super.equals(personObj) && // compares the 'Being'-parts of objects
                this.nume.equals(personObj.nume) &&
                this.prenume.equals(personObj.prenume) &&
                this.varsta == personObj.varsta) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result =  super.hashCode();
        result = result * prime + ((this.nume == null) ? 0 : this.nume.hashCode());
        result = result * prime + ((this.prenume == null) ? 0 : this.prenume.hashCode());
        result = result * prime + this.varsta;
        return result;
    }

}
