/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorPedido;

import Modelo.Pedido;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class PedidoMapperTest {
    
    public PedidoMapperTest() {
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

    /**
     * Test of mapRow method, of class PedidoMapper.
     */
    @Test
    public void testMapRow() throws Exception {
        System.out.println("mapRow");
        ResultSet rs = null;
        int i = 0;
        PedidoMapper instance = new PedidoMapper();
        Pedido expResult = null;
        Pedido result = instance.mapRow(rs, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
