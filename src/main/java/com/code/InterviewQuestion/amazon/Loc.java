package com.code.InterviewQuestion.amazon;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/**
 * @author prem chand shah on 25-09-2018
 * @project myJava
 */
public class Loc {
    public int r;
    public int c;
    public int d;

    public Loc(int r, int c, int d) {
        this.r = r;
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loc loc = (Loc) o;
        return r == loc.r &&
                c == loc.c &&
                d == loc.d;
    }

    @Override
    public int hashCode() {

        return Objects.hash(r, c, d);
    }

    boolean isSafe(int r, int c, List<List<Integer>> lot, boolean[][] vis) {
        return !(r > lot.size() - 1 || c > lot.get(0).size() - 1 || r < 0 || c < 0 || vis[r][c] || lot.get(r).get(c) == 0);
    }

    int remove(int numRows, int numColumns, List<List<Integer>> lot) {
        boolean vis[][] = new boolean[numRows][numColumns];
        Queue<Loc> q = new ArrayDeque<>();
        q.add(new Loc(0, 0, 0));
        while (!q.isEmpty()) {
            Loc curr = q.poll();
            vis[curr.r][curr.c] = true;
            if (isSafe(curr.r - 1, curr.c, lot, vis)) {
                if (lot.get(curr.r - 1).get(curr.c) == 9)
                    return curr.d + 1;
                q.add(new Loc(curr.r - 1, curr.c, curr.d + 1));
            }
            if (isSafe(curr.r + 1, curr.c, lot, vis)) {
                if (lot.get(curr.r + 1).get(curr.c) == 9)
                    return curr.d + 1;
                q.add(new Loc(curr.r + 1, curr.c, curr.d + 1));
            }
            if (isSafe(curr.r, curr.c - 1, lot, vis)) {
                if (lot.get(curr.r).get(curr.c - 1) == 9)
                    return curr.d + 1;
                q.add(new Loc(curr.r, curr.c - 1, curr.d + 1));
            }
            if (isSafe(curr.r, curr.c + 1, lot, vis)) {
                if (lot.get(curr.r).get(curr.c + 1) == 9)
                    return curr.d + 1;
                q.add(new Loc(curr.r, curr.c + 1, curr.d + 1));
            }
        }
        return -1;
    }
}