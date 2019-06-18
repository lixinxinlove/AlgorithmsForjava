package com.lixinxinlove.graph;


import java.util.ArrayList;
import java.util.List;

/**
 * 稀疏图----邻接表
 */
public class SparseGraph {

    private int n;
    private int m;
    private boolean directed;

    private List<List<Integer>> g;


    public SparseGraph(int n, boolean directed) {
        this.n = n;
        this.m = 0;
        this.directed = directed;

        g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
    }

    public int V() {
        return n;
    }

    public int E() {
        return m;
    }

    public void addEdge(int v, int w) {

        g.get(v).add(w);
        if (!directed && v != w) {
            g.get(w).add(v);
        }
        m++;

    }

    public boolean hasEdge(int v, int w) {


        for (int i = 0; i < g.get(v).size(); i++) {
            if (g.get(v).get(i) == w) {

                return true;
            }
        }

        return false;
    }
}
