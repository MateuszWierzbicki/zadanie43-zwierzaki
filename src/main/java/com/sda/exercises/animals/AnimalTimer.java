package com.sda.exercises.animals;

import java.util.List;
import java.util.Random;

public class AnimalTimer implements Runnable{

    private List<Animal> animals;
    private Random rand = new Random();
    public AnimalTimer(List<Animal> animals){
        this.animals = animals;
    }

    @Override
    public void run() {
        for (int i=0; i<25; i++) {
            System.out.println("ThreadAnimal: " + i);
            int milis = rand.nextInt(3000);
            try {
            Thread.sleep(milis);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
            animals.forEach(Animal::increaseHungry);
        }
    }
}
