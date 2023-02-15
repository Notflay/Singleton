package Factorial;

public class PrecioFactory {
    Precio precio;
    private PrecioFactory() {}
    public PrecioFactory(String pais) {
        if (pais.equalsIgnoreCase("Peru")) {
            precio = new PrecioSOL();
        } else {
            precio = new PrecioUSD();
        }
    }
    public double getPrecio() {
        return precio.getPrecio();
    }
}
