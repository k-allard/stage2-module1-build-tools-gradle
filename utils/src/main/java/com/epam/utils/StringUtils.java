package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str != null && str.length() > 0 && str.charAt(0) == '0')
            return false;
        return NumberUtils.toInt(str) > 0
                || NumberUtils.toDouble(str) > 0;
    }
}
