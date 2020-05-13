package com.github.dlx4.leetcode.s0002;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return val + "->" + Objects.toString(next);
    }
}
