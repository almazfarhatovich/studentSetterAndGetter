package com.company;

public class Math {

    static SolutionResult solution(int num) {
        int counter = 0;
        int sum = 0;
        while (num > 0) {
            int lastNum = num % 10;
            sum += lastNum;
            counter++;
            num /= 10;
        }

        SolutionResult solutionResult = new SolutionResult();
        solutionResult.setCount(counter);
        solutionResult.setSum(sum);
        return solutionResult;
    }
}