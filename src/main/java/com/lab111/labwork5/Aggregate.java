/**
 * Interface for creating an iterator object
 */
package com.lab111.labwork5;

/**
 * @author vch_m
 * @version 5
 */
public interface Aggregate {
    /**
     * Creates an iterator
     * @return Created iterator
     */
    public Iterator CreateIterator();
    /**
     * Creates an iterator with a filter by length
     * @return Created iterator with a filter by length
     */
    public Iterator CreateIterator2();
    /**
     * Creates an iterator with a filter by the first letter
     * @return Created iterator with a filter by the first letter
     */
    public Iterator CreateIterator3();

}
