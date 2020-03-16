package com.leafclient.struct.structure;

/**
 * Marks an object that can be toggled using the {@link Toggleable#setRunning(boolean)}.
 */
public interface Toggleable {

    /**
     * Returns the current running state of this {@link Toggleable} object.
     *
     * @return `True` if this {@link Toggleable} object is running otherwise false
     */
    boolean isRunning();

    /**
     * Modifies the current running state to specified value.
     *
     * @param value New running state
     */
    void setRunning(boolean value);

    /**
     * Modifies the current running state to its opposite
     */
    default void toggle() {
        setRunning(!isRunning());
    }

}
