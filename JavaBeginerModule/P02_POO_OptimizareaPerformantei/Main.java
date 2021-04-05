package P2_POO_OptimizareaPerformantei;

public class Main {
    public static void main(String[] args) {

        double startTime;
        double stopTime;

        LazyNumberDetails lzn = new LazyNumberDetails(5);
        System.out.println("Starting the program!\n");

        System.out.println("Current number is? R: " + lzn.getNumber());
        lzn.updateNumber(4);
        System.out.println("Updated number is? R: " +lzn.getNumber() + "\n");

        // isPrim check
        startTime = System.nanoTime();
        System.out.println("\n - Number is prime? R: " + lzn.isPrime());
        stopTime = System.nanoTime();
        System.out.println(" - Time elapsed : " + (stopTime - startTime) + " nanoSec");

        startTime = System.nanoTime();
        System.out.println(" - Number is prime? R: " + lzn.isPrime());
        stopTime = System.nanoTime();
        System.out.println(" - Time elapsed : " + (stopTime - startTime) + " nanoSec\n");

        // isPerfect check
        startTime = System.nanoTime();
        System.out.println("\n - Number is perfect? R: " + lzn.isPerfect());
        stopTime = System.nanoTime();
        System.out.println(" - Time elapsed : " + (stopTime - startTime) + " nanoSec");

        startTime = System.nanoTime();
        System.out.println(" - Number is perfect? R: " + lzn.isPerfect());
        stopTime = System.nanoTime();
        System.out.println(" - Time elapsed : " + (stopTime - startTime) + " nanoSec\n");

        // isMagic check
        startTime = System.nanoTime();
        System.out.println("\n - Number is magic? R: " +  lzn.isMagic());
        stopTime = System.nanoTime();
        System.out.println(" - Time elapsed : " + (stopTime - startTime) + " nanoSec");

        startTime = System.nanoTime();
        System.out.println(" - Number is magic? R: " +  lzn.isMagic());
        stopTime = System.nanoTime();
        System.out.println(" - Time elapsed : " + (stopTime - startTime) + " nanoSec");

    }
}

