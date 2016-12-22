/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import una.impresora.ImpresoraFacade;

/**
 *
 * @author Aaron
 */
public class Practica2 {
    
    public Practica2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testFachadaImpresora(){
        ImpresoraFacade impresora = new ImpresoraFacade();
        String impresion1 = impresora.ImprimeNormal("Texto1");
        String impresion2 = impresora.ImprimeAdicional("Texto2");
        
        System.out.println(impresion2);
        
        assertEquals(impresion1, "Impresora{tipoDocumento=PDF, hojas=A4, color=true, texto=Texto1}" );
        assertEquals(impresion2, "Impresora{tipoDocumento=Excel, hojas=A3, color=false, texto=Texto2}");
                
    }
}
