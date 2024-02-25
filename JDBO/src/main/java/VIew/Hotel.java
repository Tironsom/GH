package VIew;

import Model.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Hotel extends Model<Hotel>  implements  Serializable{
    private String nome;
    private int numero;
    private String endereco;


    public Hotel(int id, String nome, int numero, String endereco) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;

    }

    public Hotel() {
        super();
        this.nome = "";
        this.numero = 0;
        this.endereco = "";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero == this.numero)
        {
            
        }
        else{
            this.numero = numero;
        }

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }




}