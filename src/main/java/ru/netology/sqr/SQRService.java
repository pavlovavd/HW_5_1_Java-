package ru.netology.sqr;

public class SQRService {
    int count = 0;

    public int calcNumber(int lowValue, int upValue) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowValue && i * i <= upValue) {
                count = count + 1;
            }
        }
        return count;

    }
}
