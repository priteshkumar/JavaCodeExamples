package com.example.helloworld.corejava.oop;

public class DataStructure {
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public int get(int index) {
        return arrayOfInts[index];
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    /*
    invoke the method print(DataStructureIterator iterator) so that it prints
    elements that have an odd index value.
    Use an anonymous class as the method's argument instead
     of an instance of the interface DataStructureIterator
     */
    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        //ds.printEven();
        DataStructureIterator iterator = ds.new EvenIterator();
        ds.print(iterator);
        ds.print(new DataStructureIterator() {
            private int nextIndex = 1;

            @Override
            public boolean hasNext() {
                return (nextIndex <= SIZE - 1);
            }

            @Override
            public Integer next() {
                int retValue = ds.get(nextIndex);
                // Get the next even element
                nextIndex += 2;
                return retValue;
            }
        });
    }
}
