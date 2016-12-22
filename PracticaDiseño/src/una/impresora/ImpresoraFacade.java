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
public class ImpresoraFacade {
    ImpresoraNormal iN;
    ImpresoraAdicional iA;
    
    public ImpresoraFacade() {
        
    }

    public String ImprimeNormal(String texto){
         iN = new ImpresoraNormal(texto);
        return iN.toString();
    }
    
    public String ImprimeAdicional(String texto){
        iA = new ImpresoraAdicional(texto);
        return iA.toString();
    }
    
}
