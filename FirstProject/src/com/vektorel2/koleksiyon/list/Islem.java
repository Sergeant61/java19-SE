package com.vektorel2.koleksiyon.list;

import java.util.List;

public class Islem {
	public static void main(String[] args) {
		String[] myArray =
			{"Sal�a","Tavuk","Dometes","Sal�a","Tuz"};
		
		MyList list = new MyList();
		
		List<String> dolmusListe = list.veriDoldur(myArray);
		
		dolmusListe.contains("Sal�a");
		
		dolmusListe.remove("Tuz");
		
		dolmusListe.lastIndexOf("Sal�a");
		System.out.println(
				dolmusListe.get(dolmusListe.indexOf("Sal�a")));
		
		//		list.veriOku(dolmusListe);
	}
}
