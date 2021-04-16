package src.C29_Lucrul_cu_exceptii.Ex2;

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

    public void addCar(String plateNo) {
        carsList.add(plateNo);
        carsNo++;
    }

    public void removeCar(String plateNo) {
        for (int i = 0 ; i < carsList.size(); i++) {
            if (carsList.get(i).equals(plateNo)) {
                carsList.remove(i);
                carsNo--;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return carsList.toString();
    }
}
