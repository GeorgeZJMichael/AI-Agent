package com.focusagent;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void showTasks() {
        tasks.forEach(System.out::println);
    }
}