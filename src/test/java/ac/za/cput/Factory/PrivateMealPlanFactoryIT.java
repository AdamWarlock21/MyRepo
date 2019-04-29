/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;

import ac.za.cput.Domain.PrivateMealPlan;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BooBoo
 */
public class PrivateMealPlanFactoryIT {
    
    public PrivateMealPlanFactoryIT() {
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
     * Test of getAccStat method, of class PrivateMealPlanFactory.
     */
    @Test
    public void testGetAccStat() {
        System.out.println("getAccStat");
        String Location = "";
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = PrivateMealPlanFactory.getAccStat(Location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
