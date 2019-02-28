package Geradores;

import Objetos.Pessoa;

import java.util.ArrayList;
import java.util.Random;

public class Gerador {
	
//	arrayList.size()
//	System.out.println(dados.get(i).getNome());
//	System.out.println(dados.get(i).getPeso());
	
	public ArrayList GeradorDados () {

		ArrayList<Pessoa> dados = new ArrayList<Pessoa>();
		Integer AuxPeso;
		String name = "Pessoa";
		
		Random GerarPeso = new Random();
		
		StringBuffer sb = new StringBuffer(4);
		
		for (Integer i = 0; i < 30; i++) {
			
			AuxPeso = GerarPeso.nextInt(150);
			
			if (AuxPeso >= 0 && AuxPeso <= 3) {
				i--;
				
			} else {
				Pessoa p = new Pessoa((name + i), AuxPeso);
				dados.add(p);

			}
			
		}
		
		return dados;
		
	}

}
