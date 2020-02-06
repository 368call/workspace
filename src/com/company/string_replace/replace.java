package com.company.string_replace;

public class replace {
    public static StringBuffer String_replace(String str){
       StringBuffer s=new StringBuffer();

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' ')
            {
                s.append("%20");
            }
            else
            {
                s.append(str.charAt(i));
            }
        }
        return s;


        }



}
