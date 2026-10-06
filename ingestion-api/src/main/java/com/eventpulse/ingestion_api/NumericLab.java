package com.eventpulse.ingestion_api;

public class NumericLab extends RuntimeException {

    public static int safeAdd(int a, int b) {
        return Math.addExact(a, b);
    }

    public static void main(String[] args) {
        System.out.println(safeAdd(-100, -2147483647));
    }
}
