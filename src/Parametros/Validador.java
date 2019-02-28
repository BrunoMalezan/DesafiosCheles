package Parametros;

import java.util.ArrayList;

import Geradores.Gerador;
import Objetos.Pessoa;

public class Validador {
	
	public static Boolean Verificacao(ArrayList<Pessoa> Infos, Integer QntddsPessoas) {
		
		Integer _somaPeso = 0;
		for (Integer i = 0; i <= QntddsPessoas; i++) {
			_somaPeso += Infos.get(i).getPeso();
			
		}
		
		if (QntddsPessoas > 15 || _somaPeso > 1050) {
			if (QntddsPessoas > 15) {
				System.out.print("O número de pessoas excedeu o limite! Elevador permitido a não se mover!");
				
			} else if (_somaPeso > 1050) {
				System.out.print("O peso das " + QntddsPessoas + " pessoas excedeu o limite! Elevador permitido a não se mover!");	
				
			}
			
		} else {
			return true;
			
		}
		return false;
		
	}
	
}
