package src.C10_SuperClasaObject_Mostenire2.ClassEx1;

public class Being {
    private String species;

    public Being(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Being other = (Being) obj;
        if (this.species.equals(other.species)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((species == null) ? 0 : species.hashCode());
        return result;
    }
}
