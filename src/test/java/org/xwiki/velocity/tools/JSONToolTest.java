package org.xwiki.velocity.tools;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JSONToolTest
{
    private JSONTool jsonTool;

    @Before
    public void initialize()
    {
        jsonTool = new JSONTool();
    }

    @Test
    public void testToJSON()
    {
        Map<String, Object> test = new HashMap<String, Object>();
        test.put("foo", "bar");
        test.put("bool", Boolean.FALSE);

        String jsonString = jsonTool.toJSON(test).toString();
        Assert.assertEquals("{\"foo\":\"bar\",\"bool\":false}", jsonString);
    }

    @Test
    public void testToValueString()
    {
        Assert.assertEquals("\"\\\"test\\\"\"", jsonTool.toValueString("\"test\""));
    }
}