package structures.hastable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Gurupad Mamadapur on 03/08/20
 */
class DirectAddressedTableTest {

    final DirectAddressedTable<Integer> table = new DirectAddressedTable<>(10);

    @Test
    public void testGetAndInsert() {
        IntValue value = new IntValue(6);
        table.insert(value);
        assertEquals(6, (int) table.get(value));
    }

    @Test
    public void testDelete() {
        IntValue value = new IntValue(6);
        table.delete(value);
        assertNull(table.get(value));
    }


    static class IntValue implements DirectAddressedTable.Value<Integer> {

        final int x;

        IntValue(int x) {
            this.x = x;
        }

        @Override
        public int key() {
            return x - 1;
        }

        @Override
        public Integer get() {
            return x;
        }
    }
}