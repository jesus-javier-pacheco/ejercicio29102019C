
package ejercicio29102019;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCantantesFamosos {

    ArrayList<CantanteFamoso> cantantes;

    public ListaCantantesFamosos() {
        cantantes = new <CantanteFamoso> ArrayList();
    }

    public void AgregarCantanteFamoso(CantanteFamoso Cantante) {
        cantantes.add(Cantante);
    }

    public void listarCantanteFamoso() {
        CantanteFamoso cantante;
        Iterator<CantanteFamoso> continuar = cantantes.iterator();
        while (continuar.hasNext()) {
            cantante = continuar.next();
            System.out.print("Cantante: " + cantante.getNombre());
            System.out.println("Disco con mas pirateria: " + cantante.getDiscoConMasVentas());
        }
    }

}