/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.interfaces.note_0203;

import java.time.LocalDate;

/**
 *
 * @author root
 */
public class Task implements Comparable<Task>{

    private int id;
    private String name;
    private LocalDate startDate = LocalDate.now();
    private LocalDate endtDate = LocalDate.now();
    private int priority;
    private boolean completed;

    public Task()  {
    }

    public Task(int id, String name, int priority) {

        this(id, name, LocalDate.now(), LocalDate.now(), priority, false);
    }

    public Task(int id, String name, LocalDate startDate, LocalDate endtDate, int priority, boolean completed) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endtDate = endtDate;
        this.priority = priority;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndtDate() {
        return endtDate;
    }

    public void setEndtDate(LocalDate endtDate) {
        this.endtDate = endtDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task {"
                
                + "id = " + id
                + " , name = " + name
                + " , startDate = " + startDate
                + " , endtDate = " + endtDate
                + " , priority = " + priority
                + " , completed = " + completed
                + " , endtDate = " + endtDate
                
                + "}";

    }

    @Override
    public boolean equals(Object obj) {
        
        if(this == obj) return true;
        if(!(obj instanceof Task)) return false;
        
        Task task = (Task) obj;
        
        //check matching 
        
        if(id !=task.id) return false;
        if(priority !=task.priority) return false;
        if(completed !=task.completed) return false;
        
        if(name != null ? name.equals(task.name) : task.name != null) return false;
        if(startDate != null ? startDate.equals(task.startDate) : task.startDate != null) return false;
   
        return endtDate != null ? endtDate.equals(task.endtDate) : task.endtDate != null;
 
    }

    @Override
    public int hashCode() {
      
        int result = id;
        
        result = 31 * result + (name != null ?  name.hashCode() : 0);
        result = 31 * result + (startDate != null ?  startDate.hashCode() : 0);
        result = 31 * result + (endtDate != null ?  endtDate.hashCode() : 0);
        
        result = 31 * result + priority;
        
        result = 31 * result + (completed ? 1: 0);
        
        return result;

    }

    @Override
    public int compareTo(Task o) {
        
        return o.name.compareTo(name);
    }
    
    
        

}

