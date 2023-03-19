package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
@SuppressWarnings("all")
public class NegativeCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, "Apple", null);
        Item item2 = new Item(2L, "Banana", null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, "Banana", null);
        Item item2 = new Item(2L, "Wild Cherry", null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, "Plums", null);
        Item item2 = new Item(2L, "Pumpkin", null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, "Banana", null);
        Item item2 = new Item(2L, "apple", null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, "Banana", null);
        Item item2 = new Item(2L, "wild Cherry", null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, "Plums", null);
        Item item2 = new Item(2L, "pumpkin", null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

}
