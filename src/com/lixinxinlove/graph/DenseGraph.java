package com.lixinxinlove.graph;


import java.util.ArrayList;
import java.util.List;

/**
 * 稠密图   --- 邻接矩阵
 */
public class DenseGraph {


    private int n; //点
    private int m; //边
    private boolean directed;

    private ArrayList<ArrayList<Boolean>> g;


    public DenseGraph(int n, boolean directed) {
        this.n = n;
        this.m = 0;
        this.directed = directed;

        g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>(n));
        }
    }

    public int V() {
        return n;
    }

    public int E() {
        return m;
    }

    //添加边
    public void addEdge(int v, int w) {
        g.get(v).set(w, true);
        if (!directed) {
            g.get(w).set(v, true);
        }
        m++;
    }

    //
    public boolean hasEdge(int v, int w) {
        return g.get(v).get(w);
    }


}
