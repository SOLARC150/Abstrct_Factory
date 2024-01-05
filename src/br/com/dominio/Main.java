package br.com.dominio;

import br.com.dominio.carros.Carro;
import br.com.dominio.factory.FactoryVeiculo;
import br.com.dominio.loja.Bmw;
import br.com.dominio.loja.Honda;
import br.com.dominio.moto.Moto;

public class Main {

	public static void main(String[] args) {
		FactoryVeiculo loja = new Honda();
		
		Carro carro = loja.createCar();
		Moto moto = loja.createMoto();
		
		System.out.println(carro + "\n" + moto);
		
		loja = new Bmw();
		
		carro = loja.createCar();
		moto = loja.createMoto();
		System.out.println(carro + "\n" + moto);
	}
}
