package com.leafclient.struct.maths.vector;

import java.util.Objects;

import static com.leafclient.struct.maths.GenericMathOperation.*;

/**
 * A simple class utility that contains information about a {@link Vector3} based on 3 axises.
 *
 * @param <T> Number type
 */
public final class Vector3<T extends Number> {

    private final T x, y, z;

    /**
     * Creates a new {@link Vector3} with specified values.
     *
     * @param x X-Axis value
     * @param y Y-Axis value
     * @param z Z-Axis value
     */
    public Vector3(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * @return the X-Axis of this {@link Vector3}
     */
    public T getX() {
        return x;
    }

    /**
     * @return the Y-Axis of this {@link Vector3}
     */
    public T getY() {
        return y;
    }

    /**
     * @return the Z-Axis of this {@link Vector3}
     */
    public T getZ() {
        return z;
    }

    /**
     * Adds specified vector to this one
     *
     * @param other Other
     * @return Addition vector
     */
    public Vector3<T> plus(Vector3<T> other) {
        return new Vector3<>(
                add(x, other.x),
                add(y, other.y),
                add(z, other.z)
        );
    }

    /**
     * Subtracts specified vector to this one
     *
     * @param other Other
     * @return Addition vector
     */
    public Vector3<T> minus(Vector3<T> other) {
        return new Vector3<>(
                subtract(x, other.x),
                subtract(y, other.y),
                subtract(z, other.z)
        );
    }

    /**
     * Multiplies this vector by the specified one
     *
     * @param other Other
     * @return Addition vector
     */
    public Vector3<T> multiply(Vector3<T> other) {
        return new Vector3<>(
                multiplication(x, other.x),
                multiplication(y, other.y),
                multiplication(z, other.z)
        );
    }

    /**
     * Returns the distance between two vectors.
     * 
     * @param other Other vector
     * @return Distance
     */
    public double getDistance(Vector3<?> other) {
        double dX = other.getX().doubleValue() - x.doubleValue();
        double dY = other.getY().doubleValue() - y.doubleValue();
        double dZ = other.getZ().doubleValue() - z.doubleValue();

        return Math.sqrt(dX * dX + dY * dY + dZ * dZ);
    }

    /**
     * Returns the rotation between specified vector and this one
     *
     * @param other Specified vector
     * @return Rotation
     */
    public Vector2<Float> getRotation(Vector3<?> other) {
        double dX = x.doubleValue() - other.x.doubleValue();
        double dY = y.doubleValue() - other.y.doubleValue();
        double dZ = z.doubleValue() - other.z.doubleValue();

        double dH = Math.sqrt(Math.pow(dX, 2) + Math.pow(dZ, 2));

        float yaw = (float)(Math.toDegrees(Math.atan2(dZ, dX)) + 90F);
        float pitch = (float)(90F - Math.toDegrees(Math.atan2(dH, dY)));

        return new Vector2<>(yaw, pitch);
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3<?> vector3 = (Vector3<?>) o;
        return Objects.equals(x, vector3.x) &&
                Objects.equals(y, vector3.y) &&
                Objects.equals(z, vector3.z);
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

}
