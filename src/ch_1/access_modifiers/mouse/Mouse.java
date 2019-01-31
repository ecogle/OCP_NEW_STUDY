package ch_1.access_modifiers.mouse;

import ch_1.access_modifiers.cat.BigCat;

/**
 * Created by ecogle on 6/1/2017.
 */
public class Mouse  extends BigCat{
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
        //System.out.println(cat.hasFur); //protected - not sub-class not in same package
        //System.out.println(cat.hasPaws); // default - not in same package
        //System.out.println(cat.id); // private - not in same class
        
        Mouse mouse = new Mouse();
        System.out.println(mouse.name);
        System.out.println(mouse.hasFur); // protected - extends BigCat
        //System.out.println(mouse.hasPaws); // default - not in same package
        //System.out.println(mouse.id); // private - not in same class
	}
}
