package main;

import prototype.Personaje;
import registry.RegistroPrototipos;

public class Main {
    public static void main(String[] args) {
        RegistroPrototipos registro = new RegistroPrototipos();

        Personaje guerreroBase = new Personaje("Guerrero Desconocido", "Guerrero");
        guerreroBase.getInventario().agregarItem("Pocion de vida");
        registro.registrarPrototipo("Guerrero", guerreroBase);

        Personaje magoBase = new Personaje("Mago Desconocido", "Mago");
        magoBase.getInventario().agregarItem("Libro de hechizos");
        registro.registrarPrototipo("Mago", magoBase);

        Personaje guerreroCopia = registro.obtenerCopia("Guerrero");
        guerreroCopia.setNombre("Arthur");
        guerreroCopia.getInventario().agregarItem("Escudo");

        Personaje magoCopia = registro.obtenerCopia("Mago");
        magoCopia.setNombre("Merlin");

        System.out.println("--- Prototipos Originales ---");
        System.out.println(guerreroBase);
        System.out.println(magoBase);

        System.out.println("\n--- Copias Generadas ---");
        System.out.println(guerreroCopia);
        System.out.println(magoCopia);
    }
}