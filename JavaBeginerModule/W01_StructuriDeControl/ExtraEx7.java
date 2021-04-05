package W01_StructuriDeControl;

import java.util.Scanner;

        public class ExtraEx7 {

            public static void main(String[] args) {

                // 4.5. Follow-up - Este numar prim? Optimizeaza algoritmul care determina daca un numar este sau nu prim, folosind operatorul break.
                // Odata ce am gasit un divizor, nu mai este necesar ca continuam cautarea iterativa cu alti divizori, deoarece stim deja ca numarul nu este prim.
                // Prin urmare, putem iesi (fortat) din bucla.

                int n;
                int nrOfDivisors = 0;

                Scanner sc = new Scanner(System.in);
                System.out.println("Please insert your 'n' number: ");
                n = sc.nextInt();

                for (int i = 2 ; i < n ; i++) {
                    if (n % i == 0) {
                        nrOfDivisors++;
                        if (nrOfDivisors > 0) {
                            break;
                        }
                    }
                }

                if (nrOfDivisors == 0) {
                    System.out.println( n +  " is prime number.");
                } else {
                    System.out.println( n +  " is not prime number.");
                }

                sc.close();

            }

        }
