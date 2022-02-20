package com.rehan.Game.App.Polymorphism;

public class Box {
    double hight,weight,depth;
    Box(double hight,double weight,double depth){
        this.hight = hight;
        this.depth = depth;
        this.weight = weight;
    }
    void displayVol(){
        System.out.println("Volume is : "+(hight*weight*depth));
    }
}
