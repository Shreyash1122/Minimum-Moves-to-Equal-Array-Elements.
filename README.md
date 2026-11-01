# 453. Minimum Moves to Equal Array Elements

**Difficulty:** Medium  
**Language:** Java

## Problem

Given an integer array, return the minimum number of moves needed to make every element equal. In one move, increment exactly `n - 1` elements by 1.

## Approach

Incrementing all but one element is equivalent, in terms of the differences between elements, to decrementing the excluded element by 1. Therefore, the minimum is reached by reducing every element to the array minimum.

For each value, the number of decrements needed is `value - min(nums)`. Summing these gives `sum(nums) - min(nums) * nums.length`.

**Time:** O(n)  
**Extra space:** O(1)

## Java

See [Solution.java](Solution.java). A `long` is used for the accumulated sum and multiplication to avoid intermediate overflow.
