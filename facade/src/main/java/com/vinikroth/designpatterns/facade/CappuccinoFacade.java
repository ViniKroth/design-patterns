package com.vinikroth.designpatterns.facade;

public class CappuccinoFacade {
    private Mixer mixer;
    private FoamMaker foamMaker;
    private CoffeeGrinder coffeeGrinder;
    private CoffeeBrewer coffeeBrewer;

    public CappuccinoFacade() {
        mixer = new Mixer();
        foamMaker = new FoamMaker();
        coffeeGrinder = new CoffeeGrinder();
        coffeeBrewer = new CoffeeBrewer();
    }

    public void makeCappuccino(){
        coffeeGrinder.grindCoffeeBeans();
        coffeeBrewer.makeCoffee();
        foamMaker.makeFoam();
        mixer.mixIngredients();
        System.out.println("Now serve yourself a delicious hot cappuccino.");
    }
}
