/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chungdoan
 */
public class Task {

    private static int auto_tang = 1;
    private int id;
    private String name, date;
    private String taskType;
    private double from, to;
    private String assignee, reviewer;

    public Task() {
    }

    // phai xoa int id o trong phan tut truyen vao
    public Task(String name,  String taskType, String date, double from, double to, String assignee, String reviewer) {
        this.id = auto_tang++;
        this.name = name;
        this.date = date;
        this.taskType = taskType;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTaskType() {
        return taskType;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public double getTimeInput(double from, double to) {
        double time = to - from;
        return time;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-15s %-15s %-15s %-15s %-15s "
                                    , getId(), getName(), getTaskType(), getDate(), getTimeInput(from, to), getAssignee(), getReviewer());
    }

}
