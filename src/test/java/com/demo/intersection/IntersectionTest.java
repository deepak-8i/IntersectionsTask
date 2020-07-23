package com.demo.intersection;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionTest {

    private static Intersection intersection = null;

    @BeforeClass
    public static void setup(){
         intersection  = new Intersection();
    }

    @Test
    public void test_Intersection_Normal_Scenario() {
        int max = intersection.findMaxIntersection(new int[][]{{3,6},{2,4},{2,5},{4,8},{5,9}});
        assertEquals(4, max);
    }

    @Test
    public void test_Intersection_Single_Point_Scenario() {
        int max = intersection.findMaxIntersection(new int[][]{{3,3},{2,2},{2,5},{4,8},{5,9}});
        assertEquals(3, max);
    }


    @Test
    public void test_Intersection_No_Intersection_Scenario() {
        int max = intersection.findMaxIntersection(new int[][]{{2,3},{4,5},{7,8}});
        assertEquals(1, max);
    }
}
