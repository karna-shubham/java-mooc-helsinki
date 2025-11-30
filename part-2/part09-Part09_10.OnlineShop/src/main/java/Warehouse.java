/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class Warehouse {
    private Map <String, Integer> priceProduct;
    private Map <String, Integer> stockProduct;
//    private String product;
//    private int price;
//    private int stock;
    
    public Warehouse(){
        this.priceProduct = new HashMap<>();
        this.stockProduct = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        priceProduct.put(product, price);
        stockProduct.put(product, stock);
    }
    
    public int price(String product){
        if (priceProduct.get(product) == null) return -99;
        return priceProduct.get(product);
    }
    
    public int stock(String product){
        if (stockProduct.get(product) == null) return 0;
        return stockProduct.get(product);
    }
    
    public boolean take(String product){
        if (stockProduct.get(product) == null || stockProduct.get(product) < 1) return false;
        int stock = stockProduct.get(product);
        stockProduct.put(product, stock - 1);
        return true;
    }
    
    public Set<String> products(){
        Set<String> prod = new HashSet<>();
        for (String temp : priceProduct.keySet()) prod.add(temp);
        return prod;
        
    }
}
