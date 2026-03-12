package org.example;

public class ReverseString {
    public String reverseString(String s){
        char[] stringArray = s.toCharArray();
        int left = 0;
        int right = stringArray.length - 1;

        while(left < right){
            char temp = stringArray[left];
            stringArray[left] = stringArray[right];
            stringArray[right] = temp;

            left++;
            right--;
        }

        return new String(stringArray);
    }
}
