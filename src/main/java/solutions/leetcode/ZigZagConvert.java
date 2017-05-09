package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.leetcode.ZigZagConvertTestCases;


/*
 * 
https://leetcode.com/problems/zigzag-conversion/#/description

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR". 

=============================================

About ZigZag Patter: 
    https://discuss.leetcode.com/topic/22925/if-you-are-confused-with-zigzag-pattern-come-and-see

[n=numRows]

Δ=2n-2    1                           2n-1                         4n-3
Δ=        2                     2n-2  2n                    4n-4   4n-2
Δ=        3               2n-3        2n+1              4n-5       .
Δ=        .           .               .               .            .
Δ=        .       n+2                 .           3n               .
Δ=        n-1 n+1                     3n-3    3n-1                 5n-5
Δ=2n-2    n                           3n-2                         5n-4

 * 
 * */


public class ZigZagConvert extends Solution<TwoComposite<String, Integer>, String> {

    @Override
    protected String runTest(TwoComposite<String, Integer> input) {
        return this.convert(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(String output) {
        System.out.print(output);
    }

    @Override
    protected void testOutput(String outputTest, String output) {
        assertEquals(outputTest, output);
    }

    public String convert(String s, int numRows) {

        int strLen = s.length();

        if (numRows < 2 || strLen <= numRows) {
            return s;
        }

        char[] charArray = new char[strLen];
        int charIdx = 0;

        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                // First and Last Row
                for (int j = i; j < strLen; j += 2 * (numRows - 1)) {
                    // System.out.printf("%d - %d - %d - %c\n", charIdx, i, j, s.charAt(j));
                    charArray[charIdx] = s.charAt(j);
                    charIdx += 1;
                }
            } else {
                // Rows in Between
                charArray[charIdx] = s.charAt(i);
                charIdx += 1;

                int j = i + 2 * (numRows - 1);

                while (true) {

                    int j2 = j - 2 * i;
                    
                    if (j2 >= strLen)
                        break;
                    
                    // System.out.printf("%d - %d - %d - %c\n", charIdx, i, j2, s.charAt(j2));
                    // diagonal elements 2n-2, 2n-3 ... n+2, n+1
                    charArray[charIdx] = s.charAt(j2);
                    charIdx += 1;
                    
                    if (j < strLen){
                        // System.out.printf("%d - %d - %d - %c\n", charIdx, i, j, s.charAt(j));
                        // edge elements 2n-1, 2n, ..., 3n-2
                        charArray[charIdx] = s.charAt(j);
                        charIdx += 1;
                    }
                    
                    // loop through every edge element
                    j += 2 * (numRows - 1);
                }
            }
        }
        return String.copyValueOf(charArray);
    }

    @Override
    protected TestCases<TwoComposite<String, Integer>, String> genTestCases() {
        return new ZigZagConvertTestCases();
    }

}
