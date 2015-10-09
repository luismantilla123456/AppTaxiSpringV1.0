/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.administradorBD.UsuarioJDBCTemplate;
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
public class NewEmptyJUnitTest {
    ApplicationContext context;
    UsuarioJDBCTemplate usuarioJDBCTemplate ;
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        context =  new ClassPathXmlApplicationContext("springjdbc.xml");
        usuarioJDBCTemplate =(UsuarioJDBCTemplate)context.getBean("usuarioJDBCTemplate");
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
    public void conexion(){
        assertNotNull("no es nula", context);
    }
}
