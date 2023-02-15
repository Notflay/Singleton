package Builders;

public class CocheBuilder {
    Vehiculo vehiculo;
    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.marca = marca;
    }
    public CocheBuilder setModelo(String modelo) {
        vehiculo.modelo = modelo;
        return this;
    }
    public Vehiculo build() {
        return vehiculo;
    }
}
