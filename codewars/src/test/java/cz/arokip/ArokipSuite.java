/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.arokip;

import cz.arokip.codewars.CodewarsSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Usuario
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({CodewarsSuite.class})
public class ArokipSuite {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
