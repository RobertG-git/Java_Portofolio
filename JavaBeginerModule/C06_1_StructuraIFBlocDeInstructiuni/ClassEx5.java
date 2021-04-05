package C6_1_StructuraIFBlocDeInstructiuni;

public class ClassEx5 {

	public static void main(String[] args) {
		
		double walkingDistance = 1.85d; // km
		//walkingDistance = 0.55d;
		//walkingDistance = 2.3d;
		//walkingDistance = 4.25d;
		//walkingDistance = 15.0d;
		
		if (walkingDistance < 1) {
			System.out.println("Less than 15 minutes walk.");			
		} else if (walkingDistance < 2.5) {
			System.out.println("Les than 30 minutes walk.");
		} else if (walkingDistance < 5) {
			System.out.println("Les than 60 minutes walk.");
		} else {
			System.out.println("You should take the buss.");
		}
	
	}

}
