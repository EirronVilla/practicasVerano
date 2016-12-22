/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.impresora;

/**
 *
 * @author Aaron
 */
public class Impresora {
    private String tipoDocumento;
    private String hojas;
    private boolean color;
    private String texto;

    public Impresora() {
    }

    public Impresora(String tipoDocumento, String hojas, boolean color, String texto) {
        this.tipoDocumento = tipoDocumento;
        this.hojas = hojas;
        this.color = color;
        this.texto = texto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getHojas() {
        return hojas;
    }

    public void setHojas(String hojas) {
        this.hojas = hojas;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Impresora{" + "tipoDocumento=" + tipoDocumento + ", hojas=" + hojas + ", color=" + color + ", texto=" + texto + '}';
    }
    
    
}
