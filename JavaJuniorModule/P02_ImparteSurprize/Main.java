package src.P2_ImparteSurprize;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//         1. Surprise tests
        System.out.println("Surprise test:");
        FortuneCookie fc = FortuneCookie.generate();
        System.out.print("\t - ");
        fc.enjoy();

        Candies cd = Candies.generate();
        System.out.print("\t - ");
        cd.enjoy();

        MinionToy mt1 = MinionToy.generate();
        System.out.print("\t - ");
        mt1.enjoy();
        MinionToy mt2 = MinionToy.generate();
        MinionToy mt3 = MinionToy.generate();
        System.out.print("\t - ");
        mt2.enjoy();
        System.out.print("\t - ");
        mt3.enjoy();
        System.out.println();

//         2. Bag tests
//         /!\ for 'fc' and 'cd' is not the same because I used 'enjoy' earlier so new random toy were added for test.
        LIFOBag lifoBag = new LIFOBag();
        LIFOBag lifoBag2 = new LIFOBag();
        FIFOBag fifoBag = new FIFOBag();
        FIFOBag fifoBag2 = new FIFOBag();
        RandomBag randomBag = new RandomBag();
        RandomBag randomBag2 = new RandomBag();

        lifoBag.put(fc);
        lifoBag.put(cd);
        lifoBag.put(mt1);
        lifoBag2.put(fc);
        lifoBag.put(lifoBag2);

        fifoBag.put(fc);
        fifoBag.put(cd);
        fifoBag.put(mt1);
        fifoBag2.put(fc);
        fifoBag.put(fifoBag2);

        randomBag.put(fc);
        randomBag.put(cd);
        randomBag.put(mt1);
        randomBag2.put(fc);
        randomBag.put(randomBag2);

        System.out.println("LIFO Bag test: ");
        System.out.println("\t - lifoBag is empty? \tR: " + lifoBag.isEmpty());
        System.out.println("\t - lifoBag is size? \tR: " + lifoBag.size());
        System.out.println("\t - Surprise tokedOut? \tR: " + lifoBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + lifoBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + lifoBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + lifoBag.takeOut());
        System.out.println("\t - lifoBag is size? \tR: " + lifoBag.size() + "\n");

        System.out.println("FIFO Bag test: ");
        System.out.println("\t - fifoBag is empty? \tR: " + fifoBag.isEmpty());
        System.out.println("\t - fifoBag is size? \tR: " + fifoBag.size());
        System.out.println("\t - Surprise tokedOut? \tR: " + fifoBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + fifoBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + fifoBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + fifoBag.takeOut());
        System.out.println("\t - fifoBag is size? \tR: " + fifoBag.size() + "\n");

        System.out.println("Random Bag test: ");
        System.out.println("\t - randomBag is empty? \tR: " + randomBag.isEmpty());
        System.out.println("\t - randomBag is size? \tR: " + randomBag.size());
        System.out.println("\t - Surprise tokedOut? \tR: " + randomBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + randomBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + randomBag.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + randomBag.takeOut());
        System.out.println("\t - randomBag is size? \tR: " + randomBag.size() + "\n");

//         3. gather test
//        /!\ MinionToy surprise start with 'Stuart' because I have generated 3 other minions earlier at surprise test.
        System.out.println("Gather Bag test: ");
        ISurprise surprise = GatherSurprises.gather();
        System.out.print("\t - ");
        System.out.println(surprise);
        System.out.println();

        ArrayList<ISurprise> surprises = GatherSurprises.gather(3);
        for (ISurprise s: surprises) {
            System.out.println("\t - " + s);
        }

//         4. BagFactory test
        IBag lifoBagFactory = new BagFactory().makeBag("LIFO");
        IBag fifoBagFactory = new BagFactory().makeBag("FIFO");
        IBag randomBagFactory = new BagFactory().makeBag("RANDOM");
        System.out.println();

        assert lifoBagFactory != null;
        lifoBagFactory.put(fc);
        lifoBagFactory.put(cd);
        lifoBagFactory.put(mt1);
        lifoBag2.put(fc);
        lifoBagFactory.put(lifoBag2);

        assert fifoBagFactory != null;
        fifoBagFactory.put(fc);
        fifoBagFactory.put(cd);
        fifoBagFactory.put(mt1);
        fifoBag2.put(fc);
        fifoBagFactory.put(fifoBag2);

        assert randomBagFactory != null;
        randomBagFactory.put(fc);
        randomBagFactory.put(cd);
        randomBagFactory.put(mt1);
        randomBag2.put(fc);
        randomBagFactory.put(randomBag2);

        System.out.println("lifoBagFactory test: ");
        System.out.println("\t - lifoBag is empty? \tR: " + lifoBagFactory.isEmpty());
        System.out.println("\t - lifoBag is size? \tR: " + lifoBagFactory.size());
        System.out.println("\t - Surprise tokedOut? \tR: " + lifoBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + lifoBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + lifoBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + lifoBagFactory.takeOut());
        System.out.println("\t - lifoBag is size? \tR: " + lifoBagFactory.size() + "\n");

        System.out.println("fifoBagFactory test: ");
        System.out.println("\t - fifoBag is empty? \tR: " + fifoBagFactory.isEmpty());
        System.out.println("\t - fifoBag is size? \tR: " + fifoBagFactory.size());
        System.out.println("\t - Surprise tokedOut? \tR: " + fifoBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + fifoBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + fifoBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + fifoBagFactory.takeOut());
        System.out.println("\t - fifoBag is size? \tR: " + fifoBagFactory.size() + "\n");

        System.out.println("randomBagFactory test: ");
        System.out.println("\t - randomBag is empty? \tR: " + randomBagFactory.isEmpty());
        System.out.println("\t - randomBag is size? \tR: " + randomBagFactory.size());
        System.out.println("\t - Surprise tokedOut? \tR: " + randomBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + randomBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + randomBagFactory.takeOut());
        System.out.println("\t - Surprise tokedOut? \tR: " + randomBagFactory.takeOut());
        System.out.println("\t - randomBag is size? \tR: " + randomBagFactory.size() + "\n");

//        4. GiveSurprises test
        GiveSurpriseAndApplause lifoSurpriseAndApplause = new GiveSurpriseAndApplause("LIFO",1);
        GiveSurpriseAndHug fifoSurpriseAndHug = new GiveSurpriseAndHug("FIFO",1);
        GiveSurpriseAndSing randomSurpriseAndSing = new GiveSurpriseAndSing("RANDOM",1);

        lifoSurpriseAndApplause.put(fc);
        lifoSurpriseAndApplause.put(cd);
        lifoSurpriseAndApplause.put(mt1);
        lifoBag2.put(fc);
        lifoSurpriseAndApplause.put(lifoBag2);

        fifoSurpriseAndHug.put(fc);
        fifoSurpriseAndHug.put(cd);
        fifoSurpriseAndHug.put(mt1);
        fifoBag2.put(fc);
        fifoSurpriseAndHug.put(fifoBag2);

        randomSurpriseAndSing.put(fc);
        randomSurpriseAndSing.put(cd);
        randomSurpriseAndSing.put(mt1);
        randomBag2.put(fc);
        randomSurpriseAndSing.put(randomBag2);

        System.out.println("lifoSurpriseAndApplause test: ");
        System.out.println("\t - Give 1 surprise. \tR: ");
        lifoSurpriseAndApplause.give();
        System.out.println(lifoSurpriseAndApplause.isEmpty());
        System.out.println("\t - Give all surprises \tR: ");
        lifoSurpriseAndApplause.giveAll();
        System.out.println();

        System.out.println("fifoSurpriseAndHug test: ");
        System.out.println("\t - Give 1 surprise. \tR: ");
        fifoSurpriseAndHug.give();
        fifoSurpriseAndHug.give();
        fifoSurpriseAndHug.give();
        fifoSurpriseAndHug.give();
        System.out.println(fifoSurpriseAndHug.isEmpty());
        System.out.println("\t - Give all surprises \tR: ");
        fifoSurpriseAndHug.giveAll();
        System.out.println();

        System.out.println("randomSurpriseAndSing test: ");
        System.out.println("\t - Give 1 surprise. \tR: ");
        randomSurpriseAndSing.give();
        System.out.println("\t - Give all surprises \tR: ");
        randomSurpriseAndSing.giveAll();
    }
}
