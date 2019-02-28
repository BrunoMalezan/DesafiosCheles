//Data: 27/02/2019
//Autor: Bruno Malezan
//Solicitante: Lucas Cheles
//Duração: 4 horas

package Default;

import Objetos.Pessoa;
import Parametros.Validador;

import java.util.ArrayList;
import java.util.Random;

import Geradores.Gerador;

public class Start {

	public static void main(String[] args) {
		
		Gerador g = new Gerador();
		
		ArrayList<Pessoa> PassaDados = new ArrayList<Pessoa>();
		
		PassaDados = g.GeradorDados();
		
		Integer AuxQtdd;
		Random QntsPessoas = new Random();
		AuxQtdd = QntsPessoas.nextInt(30);
		
		Validador v = new Validador();
		if (v.Verificacao(PassaDados, AuxQtdd) == true) {
			System.out.println("Elevador se movendo!");
			
		}

	}

}
