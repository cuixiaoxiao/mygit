package com.xiao.com.xiao.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/3/9.
 * 判断是否输入的手机号
 */
public class MobilePhone {
    public static boolean isMobileNo(String str){
        Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m = pattern.matcher(str);
        return m.matches();
    }
}
