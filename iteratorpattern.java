package Iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoorRepository namesRepository = new DoorRepository();

	      for(DoorIterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Door is : " + name);
	      } 

	}

}
