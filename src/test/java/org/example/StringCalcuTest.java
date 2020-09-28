package org.example;

import org.example.StringAdder.StringAdder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalcuTest {
    @Test
    public void whenAddIsCalledWithEmptyStringItShouldReturnZero(){
        StringAdder adder = new StringAdder();
        int result = adder.add("");
        assertEquals(0, result);
    }
   @Test
    public void whenAddisCalledOneItShouldReturnOne(){
        StringAdder adder = new StringAdder();
        int result = adder.add("1");
        assertEquals(1, result);
   }
   @Test
    public void whenAddIsCalledTwoItShouldReturnTwo(){
        StringAdder adder = new StringAdder();
        int result = adder.add("2");
        assertEquals(2, result);
   }
   @Test
    public void test(){
        int expected = 3;
        StringAdder adder = new StringAdder();
        int sum = adder.add("3");
        assertEquals(expected, sum);
   }

}
