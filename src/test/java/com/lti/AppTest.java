package com.lti;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.AssertionFailedError;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	try{
        assertTrue(true);
    	}catch (Exception e) {
			System.out.println(e);
		}

    	}
}
