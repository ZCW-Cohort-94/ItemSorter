package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NeutralCompareToTest {
    @Test
    public void test1() {
        // given
        String itemName = "apple";
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, itemName, null);
        Item item2 = new Item(2L, itemName, null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }

    @Test
    public void test2() {
        // given
        String itemName = "banana";
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, itemName, null);
        Item item2 = new Item(2L, itemName, null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }

    @Test
    public void test3() {
        // given
        String itemName = "cherry";
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(1L, itemName, null);
        Item item2 = new Item(2L, itemName, null);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }
}
