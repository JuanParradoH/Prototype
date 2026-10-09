package model;

import java.util.ArrayList;
import java.util.List;

public class Inventario implements Cloneable {
    private List<String> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        this.items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public Inventario clone() {
        try {
            Inventario copia = (Inventario) super.clone();
            copia.items = new ArrayList<>(this.items);
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return items.toString();
    }
}