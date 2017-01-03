package com.zing.security.random_string;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by zing on 2016/11/15.
 */
public class RandomUtil {
    public static final char[] UPPER_CASE = {'A', 'B', 'C', 'D', 'I', 'J', 'K', 'L', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static final char[] LOWER_CASE = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static final char[] SI = {'!', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@',
            '[', ']', '^', '_', '{', '}'};

    public static final char[] NUMBERS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


    /**
     * 随机获取一个手机号
     *
     * @return
     */
    public static String get1Phone() {
        return "1" + getRandomStringFrom("3578", 1) + getRandomNumberString(9, 0);
    }

    /**
     * 从一个数组中生成一个length长度的随机的序列列表
     *
     * @param from
     * @param length
     * @param <T>
     * @return
     */
    public <T> List<T> getRandomList(T[] from, int length) {
        if (length <= 0 || length > from.length) {
            return null;
        } else {
            int fromLength = from.length;
            List<T> mo = new ArrayList();
            for (int i = 0; i < length; i++) {
                int footStep = (int) Math.floor(Math.random() * fromLength);
                mo.add(from[footStep]);
            }
            return mo;
        }
    }


    /**
     * 随机获取一个域名为domain的邮箱
     *
     * @param domain
     * @return
     */
    public static String get1Email(String domain) {
        if (domain == null || domain.equals("")) {
            domain = getRandomString(3);
        }
        if (!domain.startsWith("@")) {
            domain = "@" + domain;
        }
        if (!domain.contains(".")) {
            domain += ".com";
        }
        return RandomStringFactory.Builder.prepare(getRandomPositiveInteger(4, 16))
                .setAfterString(domain).setRange(LOWER_CASE).build().makeItToString();

    }

    /**
     * 获取一个随机的定长字符串
     *
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        return getRandomStringFrom(length, LOWER_CASE, UPPER_CASE, SI, NUMBERS);
    }

    /**
     * 从一个字符数组中，获取长度为length的随机字符串
     *
     * @param range
     * @param length
     * @return
     */
    public static String getRandomStringFrom(int length, char[]... range) {
        return RandomStringFactory.Builder.prepare(length).setRange(range).build().makeItToString();
    }


    /**
     * 在一个字符串中，随机生成长度为length的字符串
     *
     * @param range
     * @param length
     * @return
     */
    public static String getRandomStringFrom(String range, int length) {
        return RandomStringFactory.Builder.prepare(length).setRange(range.toCharArray()).build().makeItToString();
    }


    /**
     * 获取一个整数，可以定义范围
     *
     * @param from
     * @param to
     * @return
     */
    public static int getRandomPositiveInteger(Integer from, Integer to) {
        if (from == null) {
            from = 0;
        }
        int space = to - from;
        return (int) (Math.floor(Math.random() * space) + from);
    }

    /**
     * 获取任意长度的任意数字字符串
     *
     * @param length
     * @return
     */
    public static String getRandomNumberString(int length, int decimal) {
        if (length <= 0) {
            return "0";
        }
        if (decimal <= 0) {
            return RandomStringFactory.Builder.prepare(length).setRange(NUMBERS).build().makeItToString();
        }
        if (decimal >= length) {
            return RandomStringFactory.Builder.prepare(decimal).setBeforeString("0.").build().makeItToString();
        } else {
            RandomStringFactory beforeFactory = RandomStringFactory.Builder.prepare(length - decimal).setRange(NUMBERS).setAfterString(".").build();
            return RandomStringFactory.Builder.prepare(decimal).setBeforeFactory(beforeFactory).setRange(NUMBERS).build().makeItToString();
        }
    }


    /**
     * 从数组随机中抽出一个
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getRandomOneFromArray(T[] t) {
        if (t != null && t.length > 1) {
            int len = t.length;
            return t[getRandomPositiveInteger(0, len)];
        } else {
            return null;
        }

    }


    @Test
    public void getLowerCase() {
        System.out.println();
        String[] Arr = {"小明", "小话", "小白", "小去", "小2", "小4", "小5", "小6"};
        System.out.println(getRandomList(Arr, 2));
        System.out.println(getRandomOneFromArray(Arr));
    }


//        System.out.println(getRandomStringFrom("站起身来知我者为",3));
//        System.out.println(get1Phone());
//        System.out.println(getRandomNumberString(10, 5));
//        System.out.println(get1Email("126"));
//        System.out.println(getRandomPositiveInteger(0,16));
}
