package Prototype;

public class Coche implements Cloneable {

    public String marca;
    public String modelo;

    public Coche() {}

    public Coche clonar() throws CloneNotSupportedException{
        return (Coche)clone();
    }
}
