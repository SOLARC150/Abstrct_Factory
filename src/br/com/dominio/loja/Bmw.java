package br.com.dominio.loja;

import br.com.dominio.carros.BmwI8;
import br.com.dominio.carros.Carro;
import br.com.dominio.factory.FactoryVeiculo;
import br.com.dominio.moto.BmwG300;
import br.com.dominio.moto.Moto;

public class Bmw implements FactoryVeiculo{

	@Override
	public Carro createCar() {
		return new BmwI8();
	}

	@Override
	public Moto createMoto() {
		return new BmwG300();
	}

}
