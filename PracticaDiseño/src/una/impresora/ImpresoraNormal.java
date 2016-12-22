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
public class ImpresoraNormal extends Impresora {
    public ImpresoraNormal(){
        
    }

    public ImpresoraNormal(String tipoDocumento, String hojas, boolean color, String texto) {
        super(tipoDocumento, hojas, color, texto);
    }
    
    public ImpresoraNormal(String texto){
        super("PDF", "A4", true, texto);
    }
}
