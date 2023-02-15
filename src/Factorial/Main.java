package Factorial;

public class Main {

    public static void main(String[] args){
        PrecioFactory precio = new PrecioFactory("Peru");
        System.out.println(precio.getPrecio());
    }
}
