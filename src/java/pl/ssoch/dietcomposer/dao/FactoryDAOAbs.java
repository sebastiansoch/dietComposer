/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ssoch.dietcomposer.dao;

/**
 *
 * @author ssoch
 */
public class FactoryDAOAbs {
    public static FactoryDAO getFactoryDAO() {
        return FactoryDAOSql.getInstance();
    }
}
