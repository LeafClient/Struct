package com.leafclient.struct.maths.vector;

import java.util.Objects;

import static com.leafclient.struct.maths.MathOperations.*;
import static com.leafclient.struct.maths.MathOperations.multiplication;

/**
 * A simple class utility that contains information about a {@link Vector2} based on 2 axises.
 *
 * @param <T> Number type
 */
public final class Vector2<T extends Number> {

    private final T x, y;

    /**
     * Creates a new {@link Vector2} with specified values.
     *
     * @param x X-Axis value
     * @param y Y-Axis value
     */
    public Vector2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the X-Axis of this {@link Vector2}
     */
    public T getX() {
        return x;
    }

    /**
     * @return the Y-Axis of this {@link Vector2}
     */
    public T getY() {
        return y;
    }

    /**
     * Adds specified vector to this one
     *
     * @param other Other
     * @return Addition vector
     */
    public Vector2<T> plus(Vector2<T> other) {
        return new Vector2<>(
                add(x, other.x),
                add(y, other.y)
        );
    }

    /**
     * Subtracts specified vector to this one
     *
     * @param other Other
     * @return Addition vector
     */
    public Vector2<T> minus(Vector2<T> other) {
        return new Vector2<>(
                subtract(x, other.x),
                subtract(y, other.y)
        );
    }

    /**
     * Adds specified vector to this one
     *
     * @param other Other
     * @return Addition vector
     */
    public Vector2<T> multiply(Vector2<T> other) {
        return new Vector2<>(
                multiplication(x, other.x),
                multiplication(y, other.y)
        );
    }

    /**
     * Returns the distance between two vectors.
     *
     * @param other Other vector
     * @return Distance
     */
    public double getDistance(Vector3<?> other) {
        double diffX = other.getX().doubleValue() - x.doubleValue();
        double diffY = other.getY().doubleValue() - y.doubleValue();

        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vector2<?> vector2 = (Vector2<?>) o;
        return Objects.equals(x, vector2.x) &&
                Objects.equals(y, vector2.y);
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
