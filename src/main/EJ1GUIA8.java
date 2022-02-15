package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class EJ1GUIA8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList();

        for (int i = 0; i < 10; i++) {
            System.out.println(" Ingrese las razas de perro que desee ");
            String raza = leer.next();
            lista.add(raza);

            System.out.println(" ¿Desea salir de la aplicacion? y/n");
            String sn = leer.next();
            if (sn.equals("y")) {
                break;
            } else if (sn.equals("n")) {
                continue;

            }
        }

        for (String perros : lista) {

            System.out.println(perros);
        }

        System.out.println(" Seleccione una raza ");
        String perri = leer.next();

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equals(perri)) {
                it.remove();
            }

        }

        Collections.sort(lista);
        System.out.println(lista);
    }

}
