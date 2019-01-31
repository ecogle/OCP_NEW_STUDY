package ch_1.access_modifiers.cat.species;

import ch_1.access_modifiers.cat.BigCat;

/**
 * Created by ecogle on 6/1/2017.
 */
public class Lynx extends BigCat {
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name); //public - available to all classes
        //System.out.println(cat.hasFur); //protected - not in same package nor extended
        //System.out.println(cat.hasPaws); // default - not in same package
        //System.out.println(cat.id); //private - not in same class
        
        Lynx cat2 = new Lynx();
        System.out.println(cat2.name);
        System.out.println(cat2.hasFur); // Lynx extends BigCat, therefore this works for the protected.
        //System.out.println(cat2.hasPaws);
        //System.out.println(cat2.id);
	}
}
