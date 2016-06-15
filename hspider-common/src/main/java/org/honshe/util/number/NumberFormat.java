package org.honshe.util.number;

/**
 * Created by honshe on 2016/6/15.
 */
public class NumberFormat {

    public static Long String2Long(String src) {
        try {
            return Long.parseLong(src);
        } catch (Exception e) {
            return null;
        }
    }
}
