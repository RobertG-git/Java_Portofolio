package src.C15_TipuriDeClase.ClaseInterne.ClassEx2;

public class Bookkeeper {
    public static void main(String[] args) {

        // Using encapsulation:
        Book masterOfTheGame = new Book(463);
//        System.out.println(masterOfTheGame.getPageContent(3));

        // Using an Interface to refer the internal object:
        IPage page3 = masterOfTheGame.getPage(3);
        System.out.println(page3.getText());
    }
}
