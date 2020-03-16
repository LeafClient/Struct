package com.leafclient.struct.structure;

/**
 * Marks an object that contains a label retrieved using the {@link Labelable#getLabel()}
 * getter.
 */
public interface Labelable {

    /**
     * Returns the current label of this {@link Labelable} object.
     *
     * @return Object's label
     */
    String getLabel();

    /**
     * Tries to get the {@link Labelable#getLabel()} if specified object implements the {@link Labelable} interface,
     * otherwise returns an empty String.
     *
     * @param object Potentially labeled object
     * @return {@link Labelable#getLabel()} if the object is labeled, otherwise an empty String.
     */
    static String getLabelOrEmpty(Object object) {
        if(object instanceof Labelable) {
            return ((Labelable)object).getLabel();
        }
        return "";
    }

}
