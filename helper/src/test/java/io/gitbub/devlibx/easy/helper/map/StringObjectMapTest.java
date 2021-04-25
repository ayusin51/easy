package io.gitbub.devlibx.easy.helper.map;

import junit.framework.TestCase;

import java.util.UUID;

public class StringObjectMapTest extends TestCase {

    public void testStringObjectMap() {
        UUID u = UUID.randomUUID();
        StringObjectMap map = new StringObjectMap();
        map.put("int_key", 11);
        map.put("string_key", "str");
        map.put("bool_key", true);
        map.put("long_key", 100L);
        map.put("uuid_key", u);

        assertEquals(11, map.getInt("int_key").intValue());
        assertEquals("str", map.getString("string_key"));
        assertEquals(Boolean.TRUE, map.getBoolean("bool_key"));
        assertEquals(100L, map.getLong("long_key").longValue());
        assertEquals(u, map.getUUID("uuid_key"));
    }

    public void testStringObjectMapExt() {
        StringObjectMap map = StringObjectMap.of(
                "int", 10,
                "string", "str_1",
                "boolean", true,
                "str_boolean", "false",
                "str_int", "11");

        // Get typed values
        assertEquals(10, map.getInt("int").intValue());
        assertEquals("str_1", map.getString("string"));
        assertTrue(map.getBoolean("boolean"));

        // Auto conversion from string to boolean
        assertFalse(map.getBoolean("str_boolean"));

        // Auto conversion from string to int
        assertEquals(11, map.getInt("str_int").intValue());
    }
}