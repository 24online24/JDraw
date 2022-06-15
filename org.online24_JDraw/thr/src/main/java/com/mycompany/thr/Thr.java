package com.mycompany.thr;

public class Thr {

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            MT obj = new MT();
            obj.start();
        }
    }
}
