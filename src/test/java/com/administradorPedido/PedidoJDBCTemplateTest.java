/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorPedido;

import Modelo.Pedido;
import com.administradorBD.UsuarioJDBCTemplate;
import java.util.List;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Luis
 */
public class PedidoJDBCTemplateTest {
    
    public PedidoJDBCTemplateTest() {
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
     * Test of setDataSource method, of class PedidoJDBCTemplate.
     */
    @Test
    public void testSetDataSource() {
        System.out.println("setDataSource");
        DataSource dataSource = null;
        PedidoJDBCTemplate instance = new PedidoJDBCTemplate();
        instance.setDataSource(dataSource);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PedidoJDBCTemplate.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String direccion = "22 febrero";
        Integer numeroUnidades = 1;
        String fecha = "2015-04-15";
        String referencia = "sin referencia";
        Integer idUsuario = 8;
        ApplicationContext context =  new ClassPathXmlApplicationContext("springjdbc.xml");
        PedidoJDBCTemplate usuarioJDBCTemplate =(PedidoJDBCTemplate)context.getBean("usuarioJDBCTemplate");

        //PedidoJDBCTemplate instance = new PedidoJDBCTemplate();
        usuarioJDBCTemplate.create(direccion, numeroUnidades, fecha, referencia, idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedido method, of class PedidoJDBCTemplate.
     */
    @Test
    public void testGetPedido() {
        System.out.println("getPedido");
        String telefono = "948198948";
        String password = "holaluis";
        PedidoJDBCTemplate instance = new PedidoJDBCTemplate();
        Pedido expResult = null;
        Pedido result = instance.getPedido(telefono, password);
        assertNotNull("Aqui get pedido", result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPedidos method, of class PedidoJDBCTemplate.
     */
    @Test
    public void testListarPedidos_Integer() {
        System.out.println("listarPedidos");
        Integer id = 8;
        PedidoJDBCTemplate instance = new PedidoJDBCTemplate();
        List<Pedido> expResult = null;
        List<Pedido> result = instance.listarPedidos(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PedidoJDBCTemplate.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = 8;
        PedidoJDBCTemplate instance = new PedidoJDBCTemplate();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PedidoJDBCTemplate.
     */
    
    /**
     * Test of listarPedidos method, of class PedidoJDBCTemplate.
     */
    @Test
    public void testListarPedidos_0args() {
        System.out.println("listarPedidos");
        PedidoJDBCTemplate instance = new PedidoJDBCTemplate();
        List<Pedido> expResult = null;
        List<Pedido> result = instance.listarPedidos();
        assertNotNull("valor", result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
