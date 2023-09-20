package model;


import java.util.Comparator;
import model.Products;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ta Minh Duc
 */
public class sortQuantity extends Products implements Comparator<Products> {
    //-- sort product Quantity descending
    @Override
    public int compare(Products q1, Products q2) {
        if (q1.getQuantity() == q2.getQuantity()) {
            return 0;
        } else if (q1.getQuantity() > q2.getQuantity()) {
            return -1;
        } else {
            return 1;
        }
    }
}
