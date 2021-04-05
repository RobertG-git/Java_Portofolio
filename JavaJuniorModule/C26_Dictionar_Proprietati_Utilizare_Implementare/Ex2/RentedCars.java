package src.C26_Dictionar_Proprietati_Utilizare_Implementare.Ex2;

import java.util.ArrayList;

public class RentedCars {

    private int carsNo = 0;
    private final ArrayList<String> carsList;


    public RentedCars(String plateNo) {
        carsNo++;
        carsList = new ArrayList<>();
        carsList.add(plateNo);
    }

    public int getCarsNo() {
        return this.carsNo;
    }

    private String getCarsList(String ownerName) {
        return carsList.toString();
    }

    public void addCar(String plateNo) {
        carsList.add(plateNo);
        carsNo++;
    }

    public boolean removeCar(String plateNo) {
        for (int i = 0 ; i < carsList.size(); i++) {
            if (carsList.get(i).equals(plateNo)) {
                carsList.remove(i);
                carsNo--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return carsList.toString();
    }
}
