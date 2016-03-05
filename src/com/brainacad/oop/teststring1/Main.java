package com.brainacad.oop.teststring1;

public class Main {
    public static void main(String[] args) {

        String myStr = "abracadabra";

        System.out.println(myStr.indexOf("ra"));

        System.out.println(myStr.lastIndexOf("ra"));

        System.out.println(myStr.substring(3,7));

        System.out.println(reverseString("abracadabra"));

    }
    public static String reverseString(String str){

        char[] arr = str.toCharArray();

        for(int i = 0;i<=str.length()/2;i++){
            char temp = arr [i];
            arr [i] = arr[arr.length - i - 1];
            arr [arr.length - i - 1] = temp;
        }
        return new String(arr);
    }
}
