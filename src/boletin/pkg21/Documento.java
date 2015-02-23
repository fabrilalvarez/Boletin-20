package boletin.pkg21;

import javax.swing.JOptionPane;

public class Documento {

    private String contenido;
    private int nCopia;

    public void Documento() {

    }

    public void Documento(int nDoc, String contenido) {
        this.nCopia = nDoc;
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido() {
        this.contenido = JOptionPane.showInputDialog(null, "Texto a imprimir");
    }

    public int getnDoc() {
        return nCopia;
    }

    public void setnDoc() {
        this.nCopia = Integer.parseInt(JOptionPane.showInputDialog("Nº de copias"));
    }

}
