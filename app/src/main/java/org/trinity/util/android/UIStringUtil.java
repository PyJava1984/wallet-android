package org.trinity.util.android;

import java.math.BigDecimal;

public final class UIStringUtil {
    public static String bigDecimalToString(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return "-";
        }
        return bigDecimal.toPlainString();
    }

    public static String castDoubleToString(Double mDouble) {
        if (mDouble == null) {
            return "-";
        }
        return bigDecimalToString(BigDecimal.valueOf(mDouble));
    }
}