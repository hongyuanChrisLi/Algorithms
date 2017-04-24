package testcases.leetcode;

import base.TestCases;
import structures.IntArrayIntArray;
import structures.TestCase;

public class MedianTwoSortedArraysTestCases extends TestCases<IntArrayIntArray, Double> {

    private static final long serialVersionUID = -306089960865164311L;
    
    public MedianTwoSortedArraysTestCases(){
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Example 1",
                        new IntArrayIntArray(
                                new int[] { 1, 3 },
                                new int[] { 2 }), 
                        new Double(2.0)));
        
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Example 2",
                        new IntArrayIntArray(
                                new int[] { 1, 2 },
                                new int[] { 3, 4 }), 
                        new Double(2.5)));
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Empty B",
                        new IntArrayIntArray(
                                new int[] { 1 },
                                new int[] { }), 
                        new Double(1.0)));
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Empty A",
                        new IntArrayIntArray(
                                new int[] { },
                                new int[] { 2, 3 }), 
                        new Double(2.5)));
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Longer inputs",
                        new IntArrayIntArray(
                                new int[] { 1, 4, 6, 8, 12, 17},
                                new int[] { 2, 3, 5, 9, 15, 23, 25, 30, 40}), 
                        new Double(9.0)));
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Same Values",
                        new IntArrayIntArray(
                                new int[] { 7, 7, 7, 7},
                                new int[] { 7, 7}), 
                        new Double(7.0)));
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Boundary Median (Even)",
                        new IntArrayIntArray(
                                new int[] { 1, 2, 3, 4 },
                                new int[] { 5, 6, 7, 8 }), 
                        new Double(4.5)));
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Boundary Median (Odd)",
                        new IntArrayIntArray(
                                new int[] { 1, 2, 3, 4 },
                                new int[] { 5, 6, 7, 8, 9 }), 
                        new Double(5.0)));
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test Median in Longer",
                        new IntArrayIntArray(
                                new int[] { 1, 2, 3, 4 },
                                new int[] { 5, 6, 7, 8, 9, 10 }), 
                        new Double(5.5)));
        this.add(
                new TestCase<IntArrayIntArray, Double>(
                        "Test 1 on 1",
                        new IntArrayIntArray(
                                new int[] { 1001 },
                                new int[] { 1000 }), 
                        new Double(1000.5)));
    }

}
