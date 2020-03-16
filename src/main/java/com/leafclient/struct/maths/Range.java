package com.leafclient.struct.maths;

/**
 * Range is a powerful utility class used to represent a mathematical set.
 *
 * @param <T> Number type used by this range
 */
public final class Range<T extends Number> {

    /**
     * Creates a {@link Range} between the two specified numbers.
     *
     * @param n1 First number
     * @param n2 Second number
     * @param <T> Number type
     */
    public static <T extends Number> Range<T> of(T n1, T n2) {
        // The minimum is before
        if(n1.doubleValue() < n2.doubleValue())  {
            return new Range<>(
                    n1,
                    n2
            );
        }
        return new Range<>(
                n2,
                n1
        );
    }

    private final T minimum, maximum;

    /**
     * Creates a range between the two specified numbers.
     *
     * @param minimum Minimum number
     * @param maximum Maximum number
     */
    Range(T minimum, T maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    /**
     * Returns the minimum value of this {@link Range}.
     *
     * @return Minimum's value
     */
    public T getMinimum() {
        return minimum;
    }

    /**
     * Returns the maximum value of this {@link Range}.
     *
     * @return Maximum value
     */
    public T getMaximum() {
        return maximum;
    }

    /**
     * Bounds specified number between the {@link this#getMinimum()} and {@link this#getMaximum()}.
     *
     * @param value Current value
     * @return Bounded value
     */
    public T coerce(T value) {
        if(value.doubleValue() >= maximum.doubleValue())
            return maximum;
        else if(value.doubleValue() <= minimum.doubleValue())
            return minimum;

        return value;
    }

}
