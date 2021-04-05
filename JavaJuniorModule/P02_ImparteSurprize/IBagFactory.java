package src.P2_ImparteSurprize;

public interface IBagFactory {

    // Create a new container, according to the specified type
    IBag makeBag(String type);
}
