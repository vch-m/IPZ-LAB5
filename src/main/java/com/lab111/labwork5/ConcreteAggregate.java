/**
 * Class that describes a concrete aggregate and implements the Aggregate inteface
 */
package com.lab111.labwork5;

/**
 * @author vch_m
 * @version 5
 */
public class ConcreteAggregate implements Aggregate {

    /**
     * A link to the first element
     */
    public Text firstEl;
    /**
     * A link to the current element
     */
    public Text currentEl;

    /**
     * Adds a new element to a list
     * @param t value of a new element
     */
    public void add(String t){
        if(firstEl == null){
            firstEl = new Text();
            firstEl.setT(t);
        }
        else{
            currentEl = firstEl;
            while(currentEl.getNext() != null)
                currentEl = currentEl.getNext();
            Text n = new Text();
            currentEl.setNext(n);
            n.setPrev(currentEl);
            n.setT(t);
        }
    }
    /**
     * Creates an iterator
     */
    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * Creates an iterator with a filter by length
     */
    @Override
    public Iterator CreateIterator2() {
        return new ConcreteIterator2(this);
    }
    /**
     * Creates an iterator with a filter by the first letter
     */
    @Override
    public Iterator CreateIterator3() {
        return new ConcreteIterator3(this);
    }

}
