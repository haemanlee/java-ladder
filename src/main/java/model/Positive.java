package model;

import java.util.Objects;

public class Positive {
    private int num;

    private Positive(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("양수를 입력하십시오.");
        }

        this.num = num;
    }

    public Positive increase() {
        ++num;
        return this;
    }

    public Positive decrease() {
        if (num == 0) {
            throw new IllegalStateException("0 이상이여야합니다.");
        }

        --num;
        return this;
    }

    public static Positive of(String num) {
        return of(Integer.valueOf(num));
    }

    public static Positive of(int num) {
        return new Positive(num);
    }

    public int getNum() {
        return num;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Positive positive = (Positive) o;
        return num == positive.num;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}