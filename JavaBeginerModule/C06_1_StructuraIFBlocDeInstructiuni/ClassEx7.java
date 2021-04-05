package C6_1_StructuraIFBlocDeInstructiuni;

public class ClassEx7 {
	 
	  public static void displayAllMessages() {
	    System.out.println("This method only prints some messages.");
	    System.out.println("It does not return anything.");
	    System.out.println("Thus, it has the type 'void' right before the name!");
	  }
	 
	  public static void main(String[] args) {
	 
	    boolean callFunction = true;
	    //callFunction = false; 
	 
	    if (callFunction) {
	      // apelarea metodei 'displayAllMessages' se realizeaza astfel:
	      displayAllMessages();
	      System.out.println("Method \"displayAllMessages()\" was executed.");
	    } else {
	      System.out.println("Method \"displayAllMessages()\" was not executed.");
	    }
	  }
	}


