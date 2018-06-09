package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTest {

    @Test
    public void getBasicPizzaCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //when
        BigDecimal result = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(10),result);
    }

    @Test
    public void getBasicPizzaDescription() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //when
        String result = pizzaOrder.getDescription();
        //then
        assertEquals("Pizza with",result);
    }

    @Test
    public void getBasicWithSalamiAndMushroomPizzaCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        //when
        BigDecimal result = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(18),result);
    }

    @Test
    public void getBasicPizzaWithSalamiAndMushroomDescription() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        //when
        String result = pizzaOrder.getDescription();
        //then
        assertEquals("Pizza with salami mushrooms",result);
    }

    @Test
    public void getBasicPizzaWithDoubleCheeseAndBbqSauceCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new BbqSauceDecorator(pizzaOrder);
        //when
        BigDecimal result = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(18),result);
    }

    @Test
    public void getBasicPizzaWithDoubleCheeseAndBbqSauceDescription() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new BbqSauceDecorator(pizzaOrder);
        //when
        String result = pizzaOrder.getDescription();
        //then
        assertEquals("Pizza with double cheese BBQ sauce",result);
    }

    @Test
    public void getBasicPizzaWithDoubleCheeseAndChickenAndSalamiCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //when
        BigDecimal result = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(25),result);
    }

    @Test
    public void getBasicPizzaWithDoubleCheeseAndChickenAndSalamiDescription() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //when
        String result = pizzaOrder.getDescription();
        //then
        assertEquals("Pizza with double cheese chicken salami", result);
    }
}