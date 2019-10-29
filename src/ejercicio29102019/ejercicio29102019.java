package ejercicio29102019;

import java.util.Scanner;

public class ejercicio29102019 {

    public static void main(String[] args) {

        String cantante, disco;
        ListaCantantesFamosos listacantate = new ListaCantantesFamosos();
        Entrada entrada = new Entrada();

        CantanteFamoso cantante1 = new CantanteFamoso("Marcos Antonio", "Navidad sin ti");
        CantanteFamoso cantante2 = new CantanteFamoso("Enrique Iglesia", "Si tu te va");
        listacantate.AgregarCantanteFamoso(cantante1);
        listacantate.AgregarCantanteFamoso(cantante2);

        System.out.println("La lista contiene lo siguiente: ");
        listacantate.listarCantanteFamoso();
        String continuar = new String();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre del cantante: ");
            cantante = entrada.AgregarCantante();
            System.out.println("Ingrese su disco mas piratiado: ");
            disco = entrada.AgregarCantante();
            listacantate.AgregarCantanteFamoso(new CantanteFamoso(cantante, disco));
            System.out.println("La lista contiene lo siguiente: ");
            listacantate.listarCantanteFamoso();
            System.out.println("¿Deseas agregar otro cantante y su disco pirata (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

    }

   
}