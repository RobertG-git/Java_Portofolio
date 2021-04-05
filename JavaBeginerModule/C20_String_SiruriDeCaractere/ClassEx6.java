package C20_String_SiruriDeCaractere;

public class ClassEx6 {

    //Inlocuirea subsirurilor si caracterelor

    public static void main(String[] args) {

        String init = "Ana si George invata. Ana il ajuta pe George la un exercitiu.";
        String results = init.replace("Ana", "Alina").replace("George","Mihai");

        System.out.println(results);
    }
}
