package com.chaseclinecoding;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {

        if (lng == wdth) return null;

        List<Integer> result = new ArrayList<>();
        while (lng != wdth) {
            int shortSide = Math.min(lng, wdth);
            int longSide = Math.max(lng, wdth);
            result.add(shortSide);
            lng = shortSide;
            wdth = longSide - shortSide;
        }

        result.add(wdth);
        return result;
    }
}
