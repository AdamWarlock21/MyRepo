/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;

import ac.za.cput.Domain.StudBudget;
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
public class StudBudgetFactoryIT {
    
    public StudBudgetFactoryIT() {
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
     * Test of getBudget method, of class StudBudgetFactory.
     */
    @Test
    public void testGetBudget() {
        System.out.println("getBudget");
        int BudgetAmount = 0;
        int Balance = 0;
        int Expenses = 0;
        StudBudget expResult = null;
        StudBudget result = StudBudgetFactory.getBudget(BudgetAmount, Balance, Expenses);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
