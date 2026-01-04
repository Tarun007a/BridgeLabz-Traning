package com.linkedlist.circularlinkedlist.roundrobin;

public class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int completionTime;
    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.completionTime = 0;
        this.next = null;
    }
}
