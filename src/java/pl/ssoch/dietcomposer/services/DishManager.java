/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ssoch.dietcomposer.services;

import java.util.ArrayList;
import java.util.List;
import pl.ssoch.dietcomposer.data.Dish;
import pl.ssoch.dietcomposer.dao.DishesDAO;
import pl.ssoch.dietcomposer.data.DishType;

/**
 *
 * @author Seba
 */
public class DishManager {

    private DishesDAO dishesDAO;

    public DishManager(DishesDAO dishesDAO) {
        this.dishesDAO = dishesDAO;
    }

    public List<String> getAllDishes() {
        ArrayList<String> dishesList = new ArrayList<>();
//        for (Dish d : dishesDAO.getAllDishes()) {
//            dishesList.add(d.getDishName());
//        }
        return dishesList;
    }

    public String findDish(int id) {
        //Zwraca konkretne danie
        return null;
    }

    public List<String> findDishes(String phrase) {
        //Zwraca dania zawierajace dana fraze
        return null;
    }
    
    public Dish getDishById(int dishId) {
        return dishesDAO.getDishById(dishId);
    }

    public List<Dish> getAllDishesForMeal(String meal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
