package com.init.test;

import io.github.initio.thirdBrac.thirdBrac;

import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // ✅ Create list
        thirdBrac<Integer> my_list = thirdBrac.list(1, 2, 3, 4, 5);

        // ✅ Append
        my_list.append(6);
        System.out.println(my_list); // [1, 2, 3, 4, 5, 6]

        // ✅ Insert
        my_list.insert(2, 99);
        System.out.println(my_list); // [1, 2, 99, 3, 4, 5, 6]

        // ✅ Extend
        my_list.extend(Arrays.asList(7, 8));
        System.out.println(my_list); // [1, 2, 99, 3, 4, 5, 6, 7, 8]

        // ✅ Remove
        my_list.remove(3);
        System.out.println(my_list); // [1, 2, 99, 4, 5, 6, 7, 8]

        // ✅ Pop
        System.out.println("Popped: " + my_list.pop()); // 8
        System.out.println(my_list); // [1, 2, 99, 4, 5, 6, 7]

        // ✅ Reverse
        my_list.reverse();
        System.out.println(my_list); // [7, 6, 5, 4, 99, 2, 1]

        // ✅ Pythonic List Comprehension (Square numbers)
        thirdBrac<Integer> squared = thirdBrac.comprehension(0, 5, x -> x * x);
        System.out.println(squared); // [0, 1, 4, 9, 16]

        // ✅ Reduce (Sum all numbers)
        Optional<Integer> sumAll = my_list.reduce(Integer::sum);
        System.out.println("Sum: " + sumAll.orElse(0)); // Sum: 124
    }
}

