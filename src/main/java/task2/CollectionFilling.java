package task2;

import java.util.Arrays;
import java.util.Collection;

public class CollectionFilling<T> {

    /**
     * Task: Write a generic method that takes an array of objects and a collection, and puts
     *          all objects in the array into the collection.
     *
     * @param array      input array of Object`s
     * @param collection collection where we put array objects
     * @return objects in collection from array.
     * @throws NullPointerException when one of the objects was null
     *
     */
    private Collection<T> fillling(T[] array, Collection<T> collection) {
        if (array != null && collection != null) {
            collection.addAll(Arrays.asList(array));
            return collection;
        } else throw new NullPointerException();
    }
}
