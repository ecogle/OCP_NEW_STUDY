package ch_1.access_modifiers.mouse;

import ch_1.access_modifiers.cat.BigCat;

/**
 * Created by ecogle on 6/1/2017.
 */
public class Mouse {
    public static void main(String[] args){
        BigCat cat = new BigCat();
        System.out.println(cat.name);
//        System.out.println(cat.hasFur);
//        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
    }
}
