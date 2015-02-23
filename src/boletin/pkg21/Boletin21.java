package boletin.pkg21;

public class Boletin21 {

    public static void main(String[] args) {
        // TODO code application logic here
        Aparato impresora = new Aparato();
        Documento aux = new Documento();
        
        aux.setContenido();
        aux.setnDoc();
        impresora.push(aux);
        impresora.imprimir(aux);
    }

}
