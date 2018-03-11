package com.chaseclinecoding;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    private static List<Integer> list = new ArrayList<>();
    private static int i = 0;

    public static List<Integer> sqInRect(int lng, int wdth) {

        if (i == 0 && lng == wdth) return null;

        if (lng == wdth) {
            list.add(wdth);
            List<Integer> result = list;
            list = new ArrayList<>();
            i = 0;
            return result;
        }
        int shortSide;
        int longSide;
        if (lng < wdth) {
            shortSide = lng;
            longSide = wdth;
        }
        else {
            shortSide = wdth;
            longSide = lng;
        }
        list.add(shortSide);
        i++;
        return sqInRect(shortSide, longSide - shortSide);
    }
}
