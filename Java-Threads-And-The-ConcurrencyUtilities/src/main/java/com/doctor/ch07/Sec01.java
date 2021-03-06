package com.doctor.ch07;

/**
 * @author sdcuike
 *
 * @time 2015年12月5日下午6:55:38
 * 
 *       Java supports synchronization so that threads can safely update shared variables
 *       and ensure that a thread’s updates are visible to other threads. You leverage
 *       synchronization in your code by marking methods or code blocks with the
 *       synchronized keyword. These code sequences are known as critical sections.
 *       The Java virtual machine (JVM) supports synchronization via monitors and the
 *       monitorenter and monitorexit JVM instructions.
 * 
 * 
 *       Every Java object is associated with a monitor, which is a mutual exclusion (letting only
 *       one thread at a time execute in a critical section) construct that prevents multiple threads
 *       from concurrently executing in a critical section. Before a thread can enter a critical
 *       section, it’s required to lock the monitor. If the monitor is already locked, the thread
 *       blocks until the monitor is unlocked (by another thread leaving the critical section).
 *       When a thread locks a monitor in a multicore/multiprocessor environment, the
 *       values of shared variables that are stored in main memory are read into the copies
 *       of these variables that are stored in a thread’s working memory (also known as local
 *       memory or cache memory). This action ensures that the thread will work with the
 *       most recent values of these variables and not stale values, and is known as visibility.
 *       The thread proceeds to work with its copies of these shared variables. When the
 *       thread unlocks the monitor while leaving the critical section, the values in its copies
 *       of shared variables are written back to main memory, which lets the next thread
 *       that enters the critical section access the most recent values of these variables. (The
 *       volatile keyword addresses visibility only.)
 */
public class Sec01 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
