package ch_1.access_modifiers.cat;

/**
 * Created by ecogle on 6/1/2017.
 */
public class CatAdmirer {
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name); // public 
		System.out.println(cat.hasFur); // protected - same package
		System.out.println(cat.hasPaws); // default - same package
        //System.out.println(cat.id); //private - not same class
	}
}
