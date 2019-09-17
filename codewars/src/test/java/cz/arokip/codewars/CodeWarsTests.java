/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.arokip.codewars;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class CodeWarsTests {
    
    public CodeWarsTests() {
    }

    @Test
    public void one_char() {
        assertEquals(CodeWars.NumericalsOfAString.numericals("a"), 1);
    }
    
}
