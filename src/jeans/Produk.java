/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeans;

/**
 *
 * @author acer
 */
public class Produk {
    private int id;
    private String produk;
    private String harga;
    private String stock;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getProduk(){
        return produk;
    }
    
    public void setProduk(String produk){
        this.produk=produk;
    }
    
    public String getHarga(){
        return harga;
    }
    
    public void setHarga(String harga){
        this.harga=harga;
    }
    
    public String getStock(){
        return stock;
    }
    
    public void setStock(String stock){
        this.stock=stock;
    }
}
