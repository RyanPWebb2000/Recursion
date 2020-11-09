
public class Cake {
	
	private int bites = 10;
	
	public Cake() {
		//Nothing to implement
	}
	
	public void takeABite() {
		--bites;
		
		System.out.println("Hmm.. Tastey");
		
		if(isEmpty()) {
			System.out.println("Aww.. All gone");
			return;
		}
		
	}
	
	public boolean isEmpty() {
		return bites == 0;
	}
	
}
