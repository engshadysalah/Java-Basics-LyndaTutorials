/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.generictypes.not0301;

/**
 *
 * @author root
 */
public class Pair<T> {

    private T first;
    private T secound;

    public Pair(T first, T secound) {
        this.first = first;
        this.secound = secound;
    }

    public T getFirst() {
        return first;
    }

    public T getSecound() {
        return secound;
    }

    public Pair<T> swap() {

        return new Pair<T>(secound , first);
    }

    public static <T> void swap(Pair<T> pair) {

        T temp = pair.first;
        pair.first = pair.secound;
        pair.secound = temp;

    }

    @Override
    public String toString() {
        return String.format("Tuple{first %s , secound %s}", first, secound);
    }
}
