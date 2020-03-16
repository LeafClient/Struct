package com.leafclient.struct.structure;

/**
 * Marks an object that contains a description retrieved using the {@link Describable#getDescription()}
 * getter.
 */
public interface Describable {

    /**
     * Returns the current description of this {@link Labelable} object.
     *
     * @return Object's label
     */
    String getDescription();

    /**
     * Tries to get the {@link Describable#getDescription()} if specified object implements the {@link Describable} interface,
     * otherwise returns an empty String.
     *
     * @param object Potentially labeled object
     * @return {@link Describable#getDescription()} if the object is labeled, otherwise an empty String.
     */
    static String getDescriptionOrEmpty(Object object) {
        if(object instanceof Labelable) {
            return ((Labelable)object).getLabel();
        }
        return "";
    }

}
