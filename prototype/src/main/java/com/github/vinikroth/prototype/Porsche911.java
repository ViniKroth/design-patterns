package com.github.vinikroth.prototype;

public class Porsche911 extends SuperCar {

    public Porsche911() {
    }

    public Porsche911(SuperCar target) {
        super(target);
    }

    @Override
    public SuperCar copy() {
        return new Porsche911(this);
    }
}

