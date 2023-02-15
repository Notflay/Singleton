package Builders;

public class Main {

    public static void main(String[] args){
        Vehiculo coche = new CocheBuilder("MX1").setModelo("Nissan").build();

        System.out.println(coche.modelo);
    }
}
