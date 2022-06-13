package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int start, int end) {
        int q = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x <= end && x >= start) {
                q++;
            }
        }
        return q;
    }
}