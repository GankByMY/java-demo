package org.xielei.designpatterns.creational.abstractfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FarmAbstractFactoryTest {

    private FarmOneFactory farmOneFactory;
    private FarmTwoFactory farmTwoFactory;

    @Before
    public void setUp() throws Exception {
        farmOneFactory = new FarmOneFactory();
        farmTwoFactory = new FarmTwoFactory();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newAnimal() {
        Animal animalOne = farmOneFactory.newAnimal();
        animalOne.show();

        System.out.println("--------------------");

        Animal animalTwo = farmTwoFactory.newAnimal();
        animalTwo.show();

        System.out.println("--------------------");
    }

    @Test
    public void newPlant() {
        Plant plantOne = farmOneFactory.newPlant();
        plantOne.show();

        System.out.println("--------------------");

        Plant plantTwo = farmTwoFactory.newPlant();
        plantTwo.show();

        System.out.println("--------------------");
    }
}