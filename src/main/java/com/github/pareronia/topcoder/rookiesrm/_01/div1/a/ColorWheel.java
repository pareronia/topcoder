package com.github.pareronia.topcoder.rookiesrm._01.div1.a;

import java.util.HashMap;
import java.util.Map;

public class ColorWheel {
    
    private final static Map<String, Integer> COLOR_WHEEL = new HashMap<String, Integer>() {
        private static final long serialVersionUID = 1L;

    {
            put("Red",     0);
            put("Orange",  1);
            put("Yellow",  2);
            put("Green",   3);
            put("Blue",    4);
            put("Purple",  5);
    }};

    public String describePair(final String color1, final String color2) {
        final int diff = Math.abs(COLOR_WHEEL.get(color1) - COLOR_WHEEL.get(color2));
        if (diff == 0) {
            return "Same";
        } else if (diff == 1 || diff == 5) {
            return "Adjacent";
        } else if (diff == 3) {
            return "Complementary";
        } else {
            return "None";
        }
    }
}
