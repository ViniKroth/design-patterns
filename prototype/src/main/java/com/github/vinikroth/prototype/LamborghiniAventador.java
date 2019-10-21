package com.github.vinikroth.prototype;

public class LamborghiniAventador extends SuperCar {

    public LamborghiniAventador() {
    }

    public LamborghiniAventador(SuperCar target) {
        super(target);
    }

    @Override
    public SuperCar copy() {
        return new LamborghiniAventador(this);
    }
}
