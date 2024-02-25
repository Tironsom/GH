/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIew;

import Model.Model;
import java.io.Serializable;
public class Quartos extends Model<Quartos> {
     private double precoPorNoite;
    private int numero;

    public Quartos(int id, double precoPorNoite) {
        this.id =id;   

        this.precoPorNoite = precoPorNoite;
 
    }
    public Quartos() {
        super();   
  
        this.precoPorNoite = 0;

    }
    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }
    public double getPrecoPorNoite() {
        return precoPorNoite;
    }
}