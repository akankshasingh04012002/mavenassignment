package org.example;

public class stringapi {
    public  int stringLength(String str)
    {

        int stringLen = 0;
        for (char ch : str.toCharArray())
        {
            stringLen++;
        }
        return stringLen;
    }

    public String reverseString(String str)
    {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--)
        {
            rev += ch[i];
        }
        return rev;
    }
}