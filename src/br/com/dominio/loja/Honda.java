package br.com.dominio.loja;

import br.com.dominio.carros.Carro;
import br.com.dominio.carros.HondaCivic;
import br.com.dominio.factory.FactoryVeiculo;
import br.com.dominio.moto.HondaBiz;
import br.com.dominio.moto.Moto;

public class Honda implements FactoryVeiculo{

	@Override
	public Carro createCar() {
		return new HondaCivic();
	}

	@Override
	public Moto createMoto() {
		return new HondaBiz();
	}

}
