package ru.netology.sqr.service;

public class SQRService {

    public int calcSqrt(int lowerBound, int upperBound) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int result = i * i;

            if (lowerBound <= result && result <= upperBound) {
                count++;
            }
        }

        return count;
    }
}