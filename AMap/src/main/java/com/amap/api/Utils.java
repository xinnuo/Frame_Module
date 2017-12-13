/**
 *
 */
package com.amap.api;

import java.text.SimpleDateFormat;
import java.util.Locale;

import com.amap.api.location.AMapLocation;

import android.text.TextUtils;

/**
 * 辅助工具类
 */
public class Utils {

    private static SimpleDateFormat sdf = null;

    public static String formatUTC(long l, String strPattern) {
        if (TextUtils.isEmpty(strPattern)) {
            strPattern = "yyyy-MM-dd HH:mm:ss";
        }
        if (sdf == null) {
            try {
                sdf = new SimpleDateFormat(strPattern, Locale.CHINA);
            } catch (Throwable ignored) {
            }
        } else {
            sdf.applyPattern(strPattern);
        }
        return sdf == null ? "NULL" : sdf.format(l);
    }
}
