package com.github.vinikroth.prototype;

public abstract class SuperCar {

    private String engine;
    private int horsePower;
    private String color;
    private double zeroTo100;

    public SuperCar() {

    }

    public SuperCar(SuperCar target) {
        if (target != null) {
            this.engine = target.getEngine();
            this.horsePower = target.getHorsePower();
            this.color = target.getColor();
            this.zeroTo100 = target.getZeroTo100();
        }
    }

    public abstract SuperCar copy();

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getZeroTo100() {
        return zeroTo100;
    }

    public void setZeroTo100(double zeroTo100) {
        this.zeroTo100 = zeroTo100;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "engine='" + engine + '\'' +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                ", zeroTo100=" + zeroTo100 +
                '}';
    }

    //Just for the testing purpose, should re-implement hashCode;
    @Override
    public boolean equals(Object object2){
        return this.toString().equals(object2.toString());
    }
}
