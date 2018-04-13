package com.code.javaCollection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by prem on 4/30/2017.
 */
public class QueueCollection {
    private void queueMethod() {
        Queue<Integer> integerQueue = new LinkedList<>();
        Queue<String> stringQueue = new PriorityQueue<>();
        Deque<Character> characters = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        characters.offerFirst('a');
        stringQueue.peek();
    }
}
