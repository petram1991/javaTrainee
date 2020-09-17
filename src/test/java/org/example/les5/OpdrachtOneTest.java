package org.example.les5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OpdrachtOneTest {

    @Test
    public void greatestnumber(){
        OpdrachtOne target = new OpdrachtOne();
        int max = target.greatest(9, 13);
        System.out.println(max);
        assertEquals(13, max);
    }
    @Test
    public void retunbiggestlenght(){
        OpdrachtOne target = new OpdrachtOne();
        String langste = target.greatest("Tom", "Petra");
        System.out.println(langste);
        assertEquals("Petra", langste);
    }
    @Test
    public void bedenknaam(){
        OpdrachtOne target = new OpdrachtOne();

    }


}
