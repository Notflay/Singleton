package Prototype;

public class Main {
    public static void main(String[] args){
        Coche coche1 = new Coche();
        coche1.modelo = "Addidas";
        coche1.marca = "MX2";

        System.out.println(coche1.marca);

        try {
            Coche clon = coche1.clonar();
            clon.marca = "fsafas";
            System.out.println(clon.marca);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}

