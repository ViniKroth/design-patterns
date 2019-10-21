package com.github.vinikroth.prototype;

public class Main {
    public static void main(String[] args) {
        SuperCar lambo = new LamborghiniAventador();
        lambo.setColor("Yellow");
        lambo.setEngine("6.0 V12 Turbo");
        lambo.setHorsePower(750);
        lambo.setZeroTo100(2.8);

        SuperCar mcLaren = new McLarenP1();
        mcLaren.setColor("Black and orange");
        mcLaren.setEngine("5.8 V12");
        mcLaren.setHorsePower(837);
        mcLaren.setZeroTo100(2.5);

        SuperCar porsche = new Porsche911();
        porsche.setColor("Red lava");
        porsche.setEngine("3.8 V6 Turbo Bi-Inject");
        porsche.setHorsePower(548);
        porsche.setZeroTo100(2.1);

        SuperCar porscheCopy = porsche.copy();
        SuperCar lamboCopy = lambo.copy();
        SuperCar mcLarenCopy = mcLaren.copy();

        System.out.println("Are the porsches equal? " + porsche.equals(porscheCopy));
        System.out.println("Are the lambos equal? " + lambo.equals(lamboCopy));
        System.out.println("Are the p1's equal? " + mcLaren.equals(mcLarenCopy));
        System.out.println("Are the porsche and the lambo equal? " + porsche.equals(lamboCopy));
        System.out.println("Are the lambo and the p1 equal? " + lambo.equals(mcLarenCopy));


    }
}
