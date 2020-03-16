package com.leafclient.struct.structure;

import java.util.Collections;
import java.util.List;

/**
 * Marks an object that can be signed to provide the name of its authors.
 */
public interface Signable {

    /**
     * Returns the authors of this object.
     *
     * @return Object's authors
     */
    List<String> getAuthors();

    /**
     * Tries to get the {@link Signable#getAuthors()} if specified object implements the {@link Signable} interface,
     * otherwise returns an empty List.
     *
     * @param object Potentially labeled object
     * @return {@link Signable#getAuthors()} if the object is labeled, otherwise an empty List.
     */
    static List<String> getAuthorsOrEmpty(Object object) {
        if(object instanceof Signable) {
            return ((Signable)object).getAuthors();
        }
        return Collections.emptyList();
    }

}
