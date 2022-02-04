package com.company;

public class SolutionResult {
    private int sum;
    private int count;

    public void showInfo() {
        System.out.println("result:");
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
    }

    public int getSum()
    {
        return sum;
    }

    public void setSum(int sum)
    {
        this.sum = sum;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}