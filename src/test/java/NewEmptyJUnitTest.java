/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jee.sample.rest.ejb3unittest.ISample;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.apache.openejb.client.LocalInitialContextFactory;

/**
 *
 * @author Jeeva
 */
public class NewEmptyJUnitTest {

    private static ISample sample;

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");
        Context context = new InitialContext(props);
        sample = (ISample) context.lookup("SampleBeanLocal");
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
    @Test
    public void hello() {
        sample.set("test");
        System.out.println(sample.get());
    }
}
