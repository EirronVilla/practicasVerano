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
public class Main {
    public static void main(String[] args){
        ImpresoraFacade iF = new ImpresoraFacade();
        System.out.println(iF.ImprimeAdicional("Adicional"));
        System.out.println(iF.ImprimeNormal("Normal"));
    }
}
