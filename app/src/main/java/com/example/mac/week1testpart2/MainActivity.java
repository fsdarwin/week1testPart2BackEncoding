package com.example.mac.week1testpart2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public static void main(String[] args) {

        char[] caps = new char[26];
        char[] backCaps = new char[26];
        char[] lowr = new char[26];
        char[] backLowr = new char[26];
        char curChar = 0;
        for (int i = 0; i < 26; i++) {
            caps[i] = (char) (i + 65);
            backCaps[i] = (char) (90 - i);
            lowr[i] = (char) (i + 97);
            backLowr[i] = (char) (122 - i);
        }
        String testString = "Errors in strategy cannot be correct through tactical maneuvers";
        int strLength = testString.length();
        String rsltString = "";
        char[] charArr = new char[strLength];
        for (int i = 0; i < strLength; i++) {
            if (testString.charAt(i) == 32) {
                rsltString += (char) (32);
            } else if (testString.charAt(i) < 95) {
                curChar = testString.charAt(i);
                for (int j = 0; j < 26; j++) {
                    if (curChar == caps[j]) {
                        rsltString += backCaps[j];
                    }
                }
            } else {
                curChar = testString.charAt(i);
                for (int j = 0; j < 26; j++) {
                    if (curChar == lowr[j]) {
                        rsltString += backLowr[j];
                    }
                }
            }
        }
        System.out.println(rsltString);
    }
}