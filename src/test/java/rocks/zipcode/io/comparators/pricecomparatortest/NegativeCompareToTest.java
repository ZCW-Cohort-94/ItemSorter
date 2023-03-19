package rocks.zipcode.io.comparators.pricecomparatortest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NegativeCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(1L, "Apple", 0.0);
        Item item2 = new Item(2L, "Steak", 1.0);

        // when
        Integer comparisonValue = priceComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(5L, "k", 1.0);
        Item item2 = new Item(6L, "l", 1.1);

        // when
        Integer comparisonValue = priceComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(1L, "a", 2.5);
        Item item2 = new Item(2L, "b", 7.0);

        // when
        Integer comparisonValue = priceComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(2L, "a", 10.0);
        Item item2 = new Item(3L, "f", 20.0);

        // when
        Integer comparisonValue = priceComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(1L, "A", 15.0);
        Item item2 = new Item(2L, "B", 17.0);

        // when
        Integer comparisonValue = priceComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item> priceComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(1L, "A", 31.0);
        Item item2 = new Item(2L, "B", 34.0);

        // when
        Integer comparisonValue = priceComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }
}
