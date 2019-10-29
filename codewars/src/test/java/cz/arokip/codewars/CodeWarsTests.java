/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.arokip.codewars;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CodeWarsTests {

    public class NumericalsOfAStringTests {
        @Test
        public void one_char() {
            assertEquals(CodeWars.NumericalsOfAString.numericals("a"), "1");
        }
    }

    public CodeWarsTests() {
    }


    
}
