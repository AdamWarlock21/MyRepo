/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.TravelPlan;
import ac.za.cput.Repository.TravelPlanRepository;
import java.util.Set;
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
public class TravelPlanRepositoryImplIT {
    
    public TravelPlanRepositoryImplIT() {
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
     * Test of getRepository method, of class TravelPlanRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        TravelPlanRepository expResult = null;
        TravelPlanRepository result = TravelPlanRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class TravelPlanRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        TravelPlan Bplan = null;
        TravelPlanRepositoryImpl instance = null;
        TravelPlan expResult = null;
        TravelPlan result = instance.create(Bplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class TravelPlanRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String PlanId = "";
        TravelPlanRepositoryImpl instance = null;
        TravelPlan expResult = null;
        TravelPlan result = instance.read(PlanId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TravelPlanRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        TravelPlan Bplan = null;
        TravelPlanRepositoryImpl instance = null;
        TravelPlan expResult = null;
        TravelPlan result = instance.update(Bplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TravelPlanRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String PlanId = "";
        TravelPlanRepositoryImpl instance = null;
        instance.delete(PlanId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class TravelPlanRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TravelPlanRepositoryImpl instance = null;
        Set<TravelPlan> expResult = null;
        Set<TravelPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
