package com.github.lampada;

public class LampadaFluorescente implements Lampada {


	@Override
	public void on() {
		System.out.println("A lâmpada está ligada");
	}

	@Override
	public void off() {
		System.out.println("A lâmpada está desligada");
	}

}
