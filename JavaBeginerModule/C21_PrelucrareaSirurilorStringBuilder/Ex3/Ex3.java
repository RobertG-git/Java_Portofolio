package C21_PrelucrareaSirurilorStringBuilder.Ex3;

public class Ex3 {
     /*
        3. Folosind clasa StringBuilder implementeaza o metoda care transforma toate literele dintr-un String, astfel:
            litere mici → litere mari
            litere mari → litere mici
     */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("The number 1 deadliest animal on the PLANET Earth is the ©Mosquito!®");

        for (int i = 0; i < sb.length(); i++) {
            if(Character.isUpperCase(sb.charAt(i))) {
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
            } else if (Character.isLowerCase(sb.charAt(i))) {
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
        }

        String sbString = sb.toString();
        System.out.println(sbString);
    }
}
