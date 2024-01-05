package br.com.dominio.factory;

import br.com.dominio.carros.Carro;
import br.com.dominio.moto.Moto;

public interface FactoryVeiculo {

	public Carro createCar();
	
	public Moto createMoto();
	
}
