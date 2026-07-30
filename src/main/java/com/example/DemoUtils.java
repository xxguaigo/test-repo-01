package com.example;

/**
 * 通用工具类，提供字符串处理和数字计算功能
 */
public class DemoUtils {

    /**
     * 反转字符串
     * @param input 原始字符串
     * @return 反转后的结果
     */
    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * 计算两个整数的最大公约数
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * 判断是否为质数
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
