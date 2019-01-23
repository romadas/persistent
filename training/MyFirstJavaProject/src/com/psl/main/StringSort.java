package com.psl.main;
public class StringSort {

public static void main(String args[]) {

String str[] = {"roma","das","house"};

String temp = "";

for(int i = 0 ; i < str.length;i++) {

for(int j = i+1; j < str.length; j++) {

if(str[j].compareToIgnoreCase(str[i])  <  0) {

temp = str[i];

str[i] = str[j];

str[j] = temp;

}

}

}

for(int i = 0; i < str.length;i++) {

System.out.println(str[i]);

}

}



}