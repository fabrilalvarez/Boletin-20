package boletin.pkg21;

import java.util.ArrayList;

public class Aparato {

    ArrayList<Documento> cola = new ArrayList<>();
    Documento fotocopia = new Documento();

    public void push(Documento obj) {
        cola.add(obj);
    }

    public Documento imprimir(Documento obj) {
        fotocopiar(obj);
        if (cola.isEmpty()) {
            System.out.println("No hay");
            return null;
        } else {
            obj = cola.remove(0);
            return obj;
        }
    }

    public void fotocopiar(Documento co) {
        for (int i = 0; i < co.getnDoc(); i++) {
            System.out.println((i+1) + "-->" + co.getContenido());
        }
    }

}
