package ch_1.overload_override;

public class BobcatKitten extends Bobcat{

	public void findDen() {} // overridden - same method signature
	
	public void findDen(boolean b) {} //overloaded - same method name but different parameter list
	
	public int findden() throws Exception {return 0;} // neither - different name
	
}
