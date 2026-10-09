package prototype;

import model.Inventario;

public class Personaje implements Cloneable {
    private String nombre;
    private String clase;
    private Inventario inventario;

    public Personaje(String nombre, String clase) {
        this.nombre = nombre;
        this.clase = clase;
        this.inventario = new Inventario();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Inventario getInventario() {
        return inventario;
    }

    @Override
    public Personaje clone() {
        try {
            Personaje copia = (Personaje) super.clone();
            copia.inventario = this.inventario.clone();
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", clase=" + clase + ", inventario=" + inventario + "]";
    }
}