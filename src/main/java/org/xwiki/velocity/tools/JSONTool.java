package org.xwiki.velocity.tools;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.util.JSONUtils;

/**
 * Velocity tool to facilitate serialization of java types and objects to the JSON format.
 * 
 * @version $Id$
 * @since 2.1M1
 */
public class JSONTool
{
    /**
     * @param object the object to transform to JSON
     * @return a {@link net.sf.json.JSON} representation of the object.
     */
    public JSON toJSON(Object object)
    {
        return JSONSerializer.toJSON(object);
    }

    /**
     * @param value the string make a JSON value String of
     * @return the JSON-verified String representation of the passed String
     */
    public String toValueString(String value)
    {
        return JSONUtils.valueToString(value);
    }
}
