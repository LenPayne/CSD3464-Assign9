/*
 * Copyright 2016 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assign9;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class Assign9Test {
    
    public Assign9Test() {
    }

    /**
     * Test of reverseString method, of class Assign9.
     */
    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String str = "Pineapple";
        String expResult = "elppaeniP";
        String result = Assign9.reverseString(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of reverseString method, of class Assign9.
     */
    @Test
    public void testPalindrome() {
        System.out.println("reverseRacecar");
        String str = "racecar";
        String expResult = "racecar";
        String result = Assign9.reverseString(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of wordCount method, of class Assign9.
     */
    @Test
    public void testWordCount() {
        System.out.println("wordCount");
        String str = "This is some sort of lengthy sample string.";
        int expResult = 8;
        int result = Assign9.wordCount(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of wordCount method, of class Assign9.
     */
    @Test
    public void testWordCountRanomd() {
        System.out.println("wordCountRandom");
        int count = new Random().nextInt(100);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
            sb.append("word ");
        sb.deleteCharAt(sb.length() - 1);
        sb.append(".");
        int expResult = count;
        int result = Assign9.wordCount(sb.toString());
        assertEquals("Checking to see if '" + sb.toString() + "' has " + expResult + " words.", expResult, result);
    }

    /**
     * Test of capitalize method, of class Assign9.
     */
    @Test
    public void testCapitalize() {
        System.out.println("capitalize");
        String str = "this is. SOME SORT. of lengthy. SAMPLE string.";
        String expResult = "This is. Some sort. Of lengthy. Sample string.";
        String result = Assign9.capitalize(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of capitalize method, of class Assign9.
     */
    
    @Test
    public void testCapitalizeAllLower() {
        System.out.println("capitalizeAllLower");
        String str = "this is. SOME SORT. of lengthy. SAMPLE string.".toLowerCase();
        String expResult = "This is. Some sort. Of lengthy. Sample string.";
        String result = Assign9.capitalize(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of capitalize method, of class Assign9.
     */
    
    @Test
    public void testCapitalizeAllUpper() {
        System.out.println("capitalizeAllUpper");
        String str = "this is. SOME SORT. of lengthy. SAMPLE string.".toUpperCase();
        String expResult = "This is. Some sort. Of lengthy. Sample string.";
        String result = Assign9.capitalize(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of sumOfDigits method, of class Assign9.
     */
    @Test
    public void testSumOfDigits() {
        System.out.println("sumOfDigits");
        String str = "555-GET-FOOD";
        int expResult = 15;
        int result = Assign9.sumOfDigits(str);
        assertEquals(expResult, result);        
    }

    /**
     * Test of phoneTranslator method, of class Assign9.
     */
    @Test
    public void testPhoneTranslatorGood() {
        System.out.println("phoneTranslator");
        String str = "800-CAL-LSAM";
        String expResult = "800-225-5726";
        String result = Assign9.phoneTranslator(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of phoneTranslator method, of class Assign9.
     */
    @Test
    public void testPhoneTranslatorBad() {
        System.out.println("phoneTranslator");
        String str = "800-CALL-SAM";
        String expResult = null;
        String result = Assign9.phoneTranslator(str);
        assertEquals(expResult, result);
    }
}

