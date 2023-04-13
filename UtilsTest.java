public class UtilsTest {

    //unit tests for utils class
    @Test
    public void testNewNonNullHashMap() {
        HashMap<String, String> map = Utils.newNonNullHashMap();
        map.put("key", "value");
        map.put(null, "value");
        map.put("key", null);
        assertEquals(1, map.size());
    }

    @Test
    public void testNewNonNullArrayList() {
        ArrayList<String> list = Utils.newNonNullArrayList();
        list.add("value");
        list.add(null);
        assertEquals(1, list.size());
    }

    @Test
    public void testNewNonNullArrayListWithCollection() {
        ArrayList<String> list = Utils.newNonNullArrayList(Arrays.asList("value", null));
        assertEquals(1, list.size());
    }

    @Test
    public void testNewNonNullHashSet() {
        HashSet<String> set = Utils.newNonNullHashSet();
        set.add("value");
        set.add(null);
        assertEquals(1, set.size());
    }

    @Test
    public void testNewNonNullHashSetWithCollection() {
        HashSet<String> set = Utils.newNonNullHashSet(Arrays.asList("value", null));
        assertEquals(1, set.size());
    }

    @Test
    public void testNewNonNullArrayListWithCollectionNull() {
        ArrayList<String> list = Utils.newNonNullArrayList(null);
        assertEquals(0, list.size());
    }

    @Test
    public void testNewNonNullHashSetWithCollectionNull() {
        HashSet<String> set = Utils.newNonNullHashSet(null);
        assertEquals(0, set.size());
    }

    @Test
    public void testForEachWithCounter() {
        ArrayList<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");
        list.add("value3");
        Utils.forEachWithCounter(list, (i, s) -> {
            assertEquals(i, list.indexOf(s));
        });
    }

    @Test
    public void testForEachWithCounterWithInitVal() {
        ArrayList<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");
        list.add("value3");
        Utils.forEachWithCounter(list, 1, (i, s) -> {
            assertEquals(i, list.indexOf(s) + 1);
        });
    }

    @Test
    public void testCapitalize() {
        assertEquals("Value", Utils.capitalize("value"));
        assertEquals("Value", Utils.capitalize("Value"));
        assertEquals("Value", Utils.capitalize("VALUE"));
        assertEquals("Value", Utils.capitalize("vALUE"));
        assertEquals("Value", Utils.capitalize("VAlue"));
        assertEquals("Value", Utils.capitalize("vAlUE"));
        assertEquals("Value", Utils.capitalize("VaLUE"));
        assertEquals("Value", Utils.capitalize("vALue"));
    }

    @Test
    public void testCapitalizeNull() {
        assertNull(Utils.capitalize(null));
    }

    @Test
    public void testCapitalizeEmpty() {
        assertEquals("", Utils.capitalize(""));
    }

    @Test
    public void testCapitalizeBlank() {
        assertEquals(" ", Utils.capitalize(" "));
    }

    @Test
    public void testCapitalizeBlankString() {
        assertEquals(" ", Utils.capitalize(" "));
    }


}
