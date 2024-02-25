package Model;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public  class Model<T> {
    public int id;
    private int proximoIdDisponivel = 0;
    private T obj;

    public int getProximoIdDisponivel() {
        proximoIdDisponivel++;
        return proximoIdDisponivel;
    }

    public void setProximoIdDisponivel(int proximoIdDisponivel) {
        this.proximoIdDisponivel = proximoIdDisponivel;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Model() {
        // Construtor padrão
    }

    public Model(int id, T obj) {
        this.id = id;
        this.obj = obj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deleteObj(int id) {
        if (obj instanceof Model) {
            Model<T> dominioItem = (Model<T>) obj;
            if (dominioItem.getId() == id) {
                obj = null;
            }
        }
    }

}