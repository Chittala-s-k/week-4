package Iterator;

public class DoorRepository implements DoorContainer {
	public String names[] = {"OPEN" , "CLOSED"};

	@Override
	public DoorIterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements DoorIterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }

}
