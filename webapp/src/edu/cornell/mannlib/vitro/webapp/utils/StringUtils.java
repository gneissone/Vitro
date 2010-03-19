/* $This file is distributed under the terms of the license in /doc/license.txt$ */

package edu.cornell.mannlib.vitro.webapp.utils;

import java.util.List;

public class StringUtils {
    
    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
    
    public static String quote(String s) {
        return s.isEmpty() ? "" : '"' + s + '"';
    }
    
    public static String join(List<?> list, boolean quote, String glue) {
        
        if (glue == null) {
            glue = ",";
        }
        String joinedList = "";
        
        int count = 0;
        for (Object o : list) {
            String s = o.toString();
            if (count > 0) {
                joinedList += glue;
            }
            count++;
            joinedList += quote ? quote(s) : s;
        }
        
        return joinedList;
    }
    
    public static String join(List<?> list) {
        return join(list, false, ",");
    }
    
    public static String quotedList(List<?> list, String glue) {
    
        return join(list, true, glue);
    }        
}
