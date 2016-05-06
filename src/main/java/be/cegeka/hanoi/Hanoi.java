package be.cegeka.hanoi;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Hanoi {

    /**
     * You have 3 towers, A, B and C.
     * N disks of different sizes are stacked on each other in tower A. The Largest is on the bottom,
     * the second largest is directly on top of the largest, ..., and the smallest lays on top.
     * Your goal is to move all disks to tower C, where they also have to be stacked from largest on the bottom to smallest on top.
     *      You are only allowed to move 1 disk at any time
     *      A larger disk can never be placed on top of a smaller disk.
     * Print out the moves you have to make to solve this problem.
     *
     * Example for 2 disks (the numbers represent the size of a disk):
     * 
     *  1                                                          1
     *  2                2   1                1   2                2
     * -----------  =>  -----------  =>  -----------  =>  -----------
     *  A   B   C        A   B   C        A   B   C        A   B   C       
     * 
     * Expected output:
     *    A -> C
     *    A -> B
     *    C -> B
     *    A -> C
     *    B -> A
     *    B -> C
     *    A -> C
     */

    public void solve(int numberOfDisks) {
        throw new NotImplementedException();
    }
}


