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
public class ImpresoraAdicional extends Impresora{
       public ImpresoraAdicional(){
        
    }

    public ImpresoraAdicional(String tipoDocumento, String hojas, boolean color, String texto) {
        super(tipoDocumento, hojas, color, texto);
    }
    
    public ImpresoraAdicional(String texto){
        super("Excel", "A3", false, texto);
    }
}
