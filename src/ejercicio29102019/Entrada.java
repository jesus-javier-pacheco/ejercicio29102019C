
package ejercicio29102019;

import java.util.Scanner;

public class Entrada {

    private String entrada;
    Scanner sc = new Scanner(System.in);

    public Entrada() {
        entrada = "";
    }

    public String AgregarCantante() {
        entrada = sc.nextLine();
        return entrada;
    }
    public String getEntrada() {
        return entrada;
    }

}

