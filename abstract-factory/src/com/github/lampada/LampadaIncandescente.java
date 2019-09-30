package com.github.lampada;

public class LampadaIncandescente implements Lampada {

	private boolean estado;

	public LampadaIncandescente() {
		estado = false;
	}

	@Override
	public void on() {
		estado = true;

	}

	@Override
	public void off() {
		estado = false;

	}

}
