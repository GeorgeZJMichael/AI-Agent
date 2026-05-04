package com.focusagent;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        AgentService agent = new AgentService();

        String task = "完成今日工作计划";
        System.out.println("原始任务: " + task);

        String plan = agent.generatePlan(task);
        System.out.println("AI拆解任务:\n" + plan);

        PomodoroTimer timer = new PomodoroTimer();
        timer.start();
    }
}