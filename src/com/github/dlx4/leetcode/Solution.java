package com.github.dlx4.leetcode;

public class Solution {

    /**
     * 将输入的十进制数字转换为对应的二进制字符串和十六进制字符串
     *
     * @param number string字符串 十进制数字字符串
     * @return string字符串
     */
    public String changeFormatNumber(String number) {
        // write code here
        int value;
        try {
            value = Integer.parseInt(number);
        } catch (Exception e) {
            return "INPUTERROR";
        }

        if (value < Short.MIN_VALUE || value > Short.MAX_VALUE) {
            return "NODATA";
        }

        String bin = Integer.toBinaryString(value);
        StringBuilder sbBin = new StringBuilder();
        if (value >= 0) {
            int temp = 16 - bin.length();
            for (int i = 0; i < temp; i++) {
                sbBin.append("0");
            }
            sbBin.append(bin);
        } else {
            sbBin.append(bin.substring(16));
        }

        String hex = Integer.toHexString(value);
        StringBuilder sbHex = new StringBuilder();
        if (value >= 0) {
            int temp = 4 - hex.length();
            for (int i = 0; i < temp; i++) {
                sbHex.append("0");
            }
            sbHex.append(hex);
        } else {
            sbHex.append(hex.substring(4));
        }

        return sbBin.toString() + "," + sbHex.toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().changeFormatNumber("15"));
        System.out.println(new Solution().changeFormatNumber("-1"));
        System.out.println(new Solution().changeFormatNumber("-2"));
        System.out.println(new Solution().changeFormatNumber("A"));
    }


}
