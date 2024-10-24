package Assigmentprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> computerAccessories =new ArrayList<String>();
		computerAccessories.add("watrch");
		computerAccessories.add("speker");
		
		ArrayList<String> electronices =new ArrayList<String>();
		electronices.add("printer");
		
		ArrayList<String> furinecture=new ArrayList<String>();
		furinecture.add("bed");
		
		HashMap<String,ArrayList<String>>catagires=new HashMap<String,ArrayList<String>>();
		catagires.put("Computer",computerAccessories);
		catagires.put("Electronices",electronices);
		catagires.put("Furinecture",furinecture);
		HashMap<String,HashMap<String,ArrayList<String>>> eShop=new HashMap<String,HashMap<String,ArrayList<String>>>();
		eShop.put("eShop", catagires);
		Set<String> KeySet =eShop.keySet();
		for(String str :KeySet) {
			System.out.println(str);
			System.out.println(eShop.get(str));
		}
	}

}
