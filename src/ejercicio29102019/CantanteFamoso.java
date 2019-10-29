
package ejercicio29102019;

public class CantanteFamoso {

    private String nombre;
    private String discoMasVendido;

    public CantanteFamoso() {
        nombre = "";
        discoMasVendido = "";
    }

    public CantanteFamoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getDiscoConMasVentas() {
        return discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }
}