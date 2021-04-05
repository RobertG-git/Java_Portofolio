package C5_1_OperatoriInJava_continuare;

public class ClassEx6 {

	public static void main(String[] args) {
		
		int personAge = 23;
		int nrCars = 0;
		int nrTractors = 1;
		int nrMotocicles = 1;
		boolean hasDrivingLicente = true;
		
		boolean isActiveDriver = (personAge > 18) && (hasDrivingLicente == true) && (nrCars >= 1 || nrTractors >= 1 || nrMotocicles >= 1);
		
		System.out.println("This this is 'active driver': " + isActiveDriver);
		
		int a = personAge>nrCars ? 0 : 1 ;
		System.out.println(a);

	}

}
