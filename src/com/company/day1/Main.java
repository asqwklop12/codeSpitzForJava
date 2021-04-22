package com.company.day1;

public class Main {

  // accumulator 적층
  public static void main(String[] args) {
    // 1단계
    int accumulator = 0;
    for (int i = 1; i <= 10; i++) {
      accumulator += i;
    }
    // 2단계
    System.out.println(accumulator);
    System.out.println();
    // 3단계
    System.out.println(sum(10000L));
    System.out.println();
    // 4단계
    System.out.println(sum(10000L));

    // 5단계
    long v = 100000L;
    long result = 0;
    for (long i = v; i > 0; i--) {
      result += i;
    }
    System.out.println(result);
  }

  private static long sum(long v) {
    return v > 1 ? v + _sum(v - 1, 0) : 1;
  }

  private static long _sum(long v, long result) {
    return v > 1 ? _sum(v - 1, v + result) : result + 1;
  }

}
