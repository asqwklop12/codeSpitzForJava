package com.company.day1;

import java.util.List;

public class Solution {

  // 1차원 배열의 합 재귀 , 꼬리 재귀 => 번역한 for
  // [1,2,3,4,5,6,7]
  static List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);

  public static void main(String[] args) {
    // 1단계
    int sum = 0;
    for (int i = 0; i < arr.size(); i++) {
      sum += arr.get(i);
    }
    System.out.println(sum);
    System.out.println();

    // 2단계
    System.out.println(sum(arr.size() - 1));
    System.out.println();
    // 3단계 (꼬리 제귀)
    System.out.println(sum2(arr.size() - 1));

    System.out.println();
    int v = arr.size() - 1;
    int result = 0;
    for (int i = v; i >= 0; i--) {
      result += arr.get(i);
    }
    System.out.println(result);

  }

  private static int sum(int index) {
    return index > 0 ? arr.get(index) + sum(index - 1) : 1;
  }

  private static int sum2(int index) {
    return index > 0 ? arr.get(index) + _sum(index - 1, 0) : 1;
  }

  private static int _sum(int index, int result) {
    return index > 0 ? _sum(index - 1, arr.get(index) + result) : result + 1;
  }
}
