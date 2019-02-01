package ch_1.abstract_classes.pt2;

public class Lion extends Cat{

	void clean() {
		System.out.println("From Lion");
	}
	
	public static void main(String[] args) {
		Cat c = new Lion();
		c.clean();
		
		
	}
}
