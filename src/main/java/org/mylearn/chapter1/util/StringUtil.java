package org.mylearn.chapter1.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by admin on 2017/6/27.
 */
public final class StringUtil {

    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
