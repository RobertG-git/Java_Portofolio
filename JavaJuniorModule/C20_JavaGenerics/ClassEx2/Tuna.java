package src.C20_JavaGenerics.ClassEx2;

public class Tuna extends AquaticAnimal{

    public Tuna(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        // both object have the same type
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        return super.equals(obj);
    }
}
