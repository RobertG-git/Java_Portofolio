package src.C22_ColectiaLinkedList.Ex1;

public class TestOrderedList {

    public static void main(String[] args) {

        OrderedList<Town> orderedTownsList = new OrderedList<>();

        // populated list with towns
        Town town1 = new Town("Timisoara", 100);
        Town town2 = new Town("Arad", 150);
        Town town3 = new Town("Bucuresti", 0);
        Town town4 = new Town("Ploiesti", 30);

        orderedTownsList.addInOrderedList(town1);
        orderedTownsList.addInOrderedList(town2);
        orderedTownsList.addInOrderedList(town3);
        orderedTownsList.addInOrderedList(town4);

        System.out.println(orderedTownsList.toString());

    }
}
