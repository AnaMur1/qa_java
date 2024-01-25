package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class LionTests {

    private final int DEFAULT_AMOUNT_OF_KITTENS =1;

    @Test
    public void lionTest1() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void lionTest2() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionTest3() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test
    public void lionTest5() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(DEFAULT_AMOUNT_OF_KITTENS);
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(DEFAULT_AMOUNT_OF_KITTENS, lion.getKittens());
    }
}
