/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.interfaces.note_0203;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author root
 */
public class TaskSorter {

    public static void main(String[] args) {

        // rember comperable & comberator For Sorting elements"objects" of collection
        
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(1, "Run away from killer rabit", 4));
        tasks.add(new Task(2, "answer the bridgekeeper", 2));
        tasks.add(new Task(3, "Defeat the black knight", 1));
        tasks.add(new Task(4, "give a... to the knights that say ni", 4));
        tasks.add(new Task(5, "lobbeth thou  they holy hand  grenada", 3));

        tasks.forEach(System.out::println);

        Collections.sort(tasks);

        System.out.println("After Sorting by 'Comerable' ");
        
        tasks.forEach(System.out::println);

    }
}
