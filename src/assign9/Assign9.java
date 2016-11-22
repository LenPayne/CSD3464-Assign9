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

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */
package assign9;

/**
 * @author <ENTER YOUR NAME HERE>
 */
public class Assign9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* This is a sandbox. Use it to instantiate, classes and manually test 
         * your method. You are not required to put any code here. It's only 
         * provided to give you a launch point. If you can pass all the unit 
         * tests without changing this method, that's okay.
         */
        
    }

    /* Exercise #1 - Backward String
     * =============================
     * Complete the following method, reverseString(String str) so that it
     * returns a copy of the argument, backwards. For example 
     * reverseString("hello") would return "olleh".
     */
    public static String reverseString(String str) {
        return "";
    }

    /* Exercise #2 - Word Counter
     * ==========================
     * Complete the following method, wordCount(String str) so that it returns 
     * the number of words in the original argument. For example,
     * wordCount("This is a sample string!") would return 5.
     */
    public static int wordCount(String str) {
        return 0;
    }

    /* Exercise #3 - Sentence Capitalizer
     * ==================================
     * Complete the following method, capitalize(String str) so that it returns
     * a copy of the argument, with every sentence correctly capitalized. For
     * example, capitalize("don't try this. AT HOME.") would return "Don't try 
     * this. At home."
     */
    public static String capitalize(String str) {
        return "";
    }

    /* Exercise #9 - Sum of Digits in a String
     * =======================================
     * Complete the following method, sumOfDigits(String str) so that it returns
     * the sum of all digits present in a string. If a character is not a digit,
     * exclude it from the sum. For example, sumOfDigits("12Ab34") should return
     * 10 without errors.
     */
    public static int sumOfDigits(String str) {
        return 0;
    }

    /* Exercise 13 - Alphabetic Telephone Number Translator
     * ====================================================
     * Many companies use telephone numbers like 555-GET-FOOD so the number is 
     * easier for their customers to remember. On a standard telephone, the 
     * alphabetic letters are mapped to numbers in the following fashion:
     *   ABC = 2
     *   DEF = 3
     *   GHI = 4
     *   JKL = 5
     *   MNO = 6
     *   PQRS = 7
     *   TUV = 8
     *   WXYZ = 9
     * Complete the following method, phoneTranslator(String str) so that:
     *   1) It verifies the phone number is of the form XXX-XXX-XXXX, if not, 
     *      it returns null.
     *   2) If the phone number is valid, it returns a copy of the argument with 
     *      all letters translated into digits using the above scheme.
     * For example: phoneTranslator("555-GET-FOOD") should return "555-438-3663"
     * and phoneTranslator("01-80-555-0923") should return null.
     */
    public static String phoneTranslator(String str) {
        return "";
    }
}
