package com.github.vinikroth.prototype;

public class McLarenP1 extends SuperCar {

    public McLarenP1() {
    }

    public McLarenP1(SuperCar target) {
        super(target);
    }

    @Override
    public SuperCar copy() {
        return new McLarenP1(this);
    }
}
