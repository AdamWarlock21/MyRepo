/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Student;
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
public class DBImplIT {
    
    public DBImplIT() {
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
     * Test of getAll method, of class DBImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        DBImpl instance = new DBImpl();
        Set<Student> expResult = null;
        Set<Student> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class DBImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Student student = null;
        DBImpl instance = new DBImpl();
        Student expResult = null;
        Student result = instance.create(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DBImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Student student = null;
        DBImpl instance = new DBImpl();
        Student expResult = null;
        Student result = instance.update(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DBImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        DBImpl instance = new DBImpl();
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class DBImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        DBImpl instance = new DBImpl();
        Student expResult = null;
        Student result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
