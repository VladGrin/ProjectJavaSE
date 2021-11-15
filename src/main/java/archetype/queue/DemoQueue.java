package archetype.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DemoQueue {
    public static void main(String[] args) {
//        Queue<Integer> integers = new LinkedList<>();
//        integers.offer(1);
//        integers.offer(2);
//        integers.offer(3);
//        while (!integers.isEmpty()) {
//            System.out.println(integers.poll());
//        }
//        System.out.println(integers.poll());
//        System.out.println(integers.remove());
//
//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.offer(2);
//        queue.offer(1);
//        queue.offer(3);
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        Deque<Integer> queue = new ArrayDeque<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
