/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;

import ac.za.cput.Domain.TravelPlan;
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
public class TravelPlannerFactoryIT {
    
    public TravelPlannerFactoryIT() {
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
     * Test of getTravelPlanner method, of class TravelPlannerFactory.
     */
    @Test
    public void testGetTravelPlanner() {
        System.out.println("getTravelPlanner");
        int TravelAmount = 0;
        int TravelExp = 0;
        int TravelBal = 0;
        TravelPlan expResult = null;
        TravelPlan result = TravelPlannerFactory.getTravelPlanner(TravelAmount, TravelExp, TravelBal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
