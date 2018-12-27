package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Sergey Surtsev artman99@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculate calc = new Calculate();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));

    }
    @Test
    public void whenSubstructThreeMinusOneThenTwo()  {
        Calculate calc = new Calculate();
        calc.substruct(3D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));

    }
    @Test
    public void whenDivFourOnOneThenFour()  {
        Calculate calc = new Calculate();
        calc.div(4D, 1D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));

    }
    @Test
    public void whenMultipleThreeOnTwoThenSix()  {
        Calculate calc = new Calculate();
        calc.multiple(3D, 2D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));

    }
}