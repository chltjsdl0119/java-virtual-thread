package com.javavirtualthread.purejava;

import java.util.List;
import java.util.Optional;

public class ForkJoinPoolTest {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> o = list.parallelStream()
                .filter(integer -> {
                    System.out.println("i: " + integer + " , thread: " + Thread.currentThread() + " , daemon: " + Thread.currentThread().isDaemon());
                    boolean b = integer % 2 == 0;
                    return b;
                })
                .findAny();

        System.out.println(o.get());
    }
}
