package com.leafclient.struct.maths;

import com.leafclient.struct.maths.exception.UnsupportedNumberType;

import static java.util.Objects.*;

/**
 * {@link MathOperations} is an utility class allowing you to operate on generic numbers
 * even if the type is contained in a generic type.
 * It should be used only in necessary cases because of the performance cost.
 */
@SuppressWarnings("unchecked")
public final class MathOperations {

    /**
     * Each {@link Number} implementation supported by the math library are provided here.
     */
    public static Class<? extends Number>[] SUPPORTED_NUMBERS = new Class[] {
            Byte.TYPE,
            Short.TYPE,
            Integer.TYPE,
            Long.TYPE,
            Float.TYPE,
            Double.TYPE
    };

    /**
     * Applies the addition operation to the specified numbers.
     *
     * @param n1 First number
     * @param n2 Second number
     * @param <T> Number type
     * @return The result of the addition between the first and the second number
     */
    public static <T extends Number> T add(T n1, T n2) {
        if(n1 == null || n2 == null) {
            throw new NullPointerException("A number is null!");
        }

        if(n1.getClass() == Byte.TYPE || n1.getClass() == Byte.class) {
            return (T) new Byte((byte)(n1.byteValue() + n2.byteValue()));
        } else if(n1.getClass() == Short.TYPE || n1.getClass() == Short.class) {
            return (T) new Short((short) (n1.shortValue() + n2.shortValue()));
        } else if(n1.getClass() == Integer.TYPE || n1.getClass() == Integer.class) {
            return (T) new Integer((n1.shortValue() + n2.shortValue()));
        } else if(n1.getClass() == Long.TYPE || n1.getClass() == Long.class) {
            return (T) new Long(n1.longValue() + n2.longValue());
        } else if(n1.getClass() == Float.TYPE || n1.getClass() == Float.class) {
            return (T) new Float(n1.floatValue() + n2.floatValue());
        } else if(n1.getClass() == Double.TYPE || n1.getClass() == Double.class) {
            return (T) new Double(n1.doubleValue() + n2.doubleValue());
        }

        throw UnsupportedNumberType
                .of(n1.getClass());
    }

    /**
     * Applies the subtraction operation to the specified numbers.
     *
     * @param n1 First number
     * @param n2 Second number
     * @param <T> Number type
     * @return The result of the subtraction between the first and the second number
     */
    public static <T extends Number> T subtract(T n1, T n2) {
        if(n1 == null || n2 == null) {
            throw new NullPointerException("A number is null!");
        }

        if(n1.getClass() == Byte.TYPE || n1.getClass() == Byte.class) {
            return (T) new Byte((byte)(n1.byteValue() - n2.byteValue()));
        } else if(n1.getClass() == Short.TYPE || n1.getClass() == Short.class) {
            return (T) new Short((short) (n1.shortValue() - n2.shortValue()));
        } else if(n1.getClass() == Integer.TYPE || n1.getClass() == Integer.class) {
            return (T) new Integer((n1.shortValue() - n2.shortValue()));
        } else if(n1.getClass() == Long.TYPE || n1.getClass() == Long.class) {
            return (T) new Long(n1.longValue() - n2.longValue());
        } else if(n1.getClass() == Float.TYPE || n1.getClass() == Float.class) {
            return (T) new Float(n1.floatValue() - n2.floatValue());
        } else if(n1.getClass() == Double.TYPE || n1.getClass() == Double.class) {
            return (T) new Double(n1.doubleValue() - n2.doubleValue());
        }

        throw UnsupportedNumberType
                .of(n1.getClass());
    }

    /**
     * Applies the multiplication operation to the specified numbers.
     *
     * @param n1 First number
     * @param n2 Second number
     * @param <T> Number type
     * @return The result of the multiplication between the first and the second number
     */
    public static <T extends Number> T multiplication(T n1, T n2) {
        requireNonNull(n1);
        requireNonNull(n2);

        if(n1.getClass() == Byte.TYPE || n1.getClass() == Byte.class) {
            return (T) new Byte((byte)(n1.byteValue() * n2.byteValue()));
        } else if(n1.getClass() == Short.TYPE || n1.getClass() == Short.class) {
            return (T) new Short((short) (n1.shortValue() * n2.shortValue()));
        } else if(n1.getClass() == Integer.TYPE || n1.getClass() == Integer.class) {
            return (T) new Integer((n1.shortValue() * n2.shortValue()));
        } else if(n1.getClass() == Long.TYPE || n1.getClass() == Long.class) {
            return (T) new Long(n1.longValue() * n2.longValue());
        } else if(n1.getClass() == Float.TYPE || n1.getClass() == Float.class) {
            return (T) new Float(n1.floatValue() * n2.floatValue());
        } else if(n1.getClass() == Double.TYPE || n1.getClass() == Double.class) {
            return (T) new Double(n1.doubleValue() * n2.doubleValue());
        }

        throw UnsupportedNumberType
                .of(n1.getClass());
    }


    /**
     * Applies the division operation to the specified numbers.
     *
     * @param n1 First number
     * @param n2 Second number
     * @param <T> Number type
     * @return The result of the division between the first and the second number
     */
    public static <T extends Number> T division(T n1, T n2) {
        requireNonNull(n1);
        requireNonNull(n2);

        if(n1.getClass() == Byte.TYPE || n1.getClass() == Byte.class) {
            return (T) new Byte((byte)(n1.byteValue() / n2.byteValue()));
        } else if(n1.getClass() == Short.TYPE || n1.getClass() == Short.class) {
            return (T) new Short((short) (n1.shortValue() / n2.shortValue()));
        } else if(n1.getClass() == Integer.TYPE || n1.getClass() == Integer.class) {
            return (T) new Integer((n1.shortValue() / n2.shortValue()));
        } else if(n1.getClass() == Long.TYPE || n1.getClass() == Long.class) {
            return (T) new Long(n1.longValue() / n2.longValue());
        } else if(n1.getClass() == Float.TYPE || n1.getClass() == Float.class) {
            return (T) new Float(n1.floatValue() / n2.floatValue());
        } else if(n1.getClass() == Double.TYPE || n1.getClass() == Double.class) {
            return (T) new Double(n1.doubleValue() / n2.doubleValue());
        }

        throw UnsupportedNumberType
                .of(n1.getClass());
    }

    /**
     * Casts specified {@link Number} to the specified number's type.
     *
     * @param number Number
     * @param numberType Casted type
     * @param <T> Number type
     * @return Casted number
     */
    public static <T extends Number> T cast(Number number, T numberType) {
        return cast(number, (Class<T>)numberType.getClass());
    }

    /**
     * Casts specified {@link Number} to the specified type.
     *
     * @param number Number
     * @param returnType Casted type
     * @param <T> Number type
     * @return Casted number
     */
    public static <T extends Number> T cast(Number number, Class<T> returnType) {
        requireNonNull(returnType);

        if(returnType == Byte.TYPE || returnType == Byte.class) {
            return (T) new Byte(number.byteValue());
        } else if(returnType == Short.TYPE || returnType == Short.class) {
            return (T) new Short(number.shortValue());
        } else if(returnType == Integer.TYPE || returnType == Integer.class) {
            return (T) new Integer(number.intValue());
        } else if(returnType == Long.TYPE || returnType == Long.class) {
            return (T) new Long(number.longValue());
        } else if(returnType == Float.TYPE || returnType == Float.class) {
            return (T) new Float(number.floatValue());
        } else if(returnType == Double.TYPE || returnType == Double.class) {
            return (T) new Double(number.doubleValue());
        }

        throw UnsupportedNumberType
                .of(returnType);
    }

    /**
     * Returns the first number rounded by the second number.
     *
     * @param n1 First number
     * @param n2 Second number
     * @param <T> Number type
     * @return The result of the subtraction between the first and the second number
     */
    public static <T extends Number> T round(T n1, T n2) {
        requireNonNull(n1);
        requireNonNull(n2);

        if(n1.getClass() == Byte.TYPE || n1.getClass() == Byte.class) {
            return (T) new Byte(
                    (byte) (Math.round(n1.doubleValue() * 1.0 / n2.doubleValue()) / (1.0 / n2.doubleValue()))
            );
        } else if(n1.getClass() == Short.TYPE || n1.getClass() == Short.class) {
            return (T) new Short(
                    (short) (Math.round(n1.doubleValue() * 1.0 / n2.doubleValue()) / (1.0 / n2.doubleValue()))
            );
        } else if(n1.getClass() == Integer.TYPE || n1.getClass() == Integer.class) {
            return (T) new Integer(
                    (int) (Math.round(n1.doubleValue() * 1.0 / n2.doubleValue()) / (1.0 / n2.doubleValue()))
            );
        } else if(n1.getClass() == Long.TYPE || n1.getClass() == Long.class) {
            return (T) new Long(
                    (long) (Math.round(n1.doubleValue() * 1.0 / n2.doubleValue()) / (1.0 / n2.doubleValue()))
            );
        } else if(n1.getClass() == Float.TYPE || n1.getClass() == Float.class) {
            return (T) new Float(
                    (float) (Math.round(n1.doubleValue() * 1.0 / n2.doubleValue()) / (1.0 / n2.doubleValue()))
            );
        } else if(n1.getClass() == Double.TYPE || n1.getClass() == Double.class) {
            return (T) new Double(
                    (Math.round(n1.doubleValue() * 1.0 / n2.doubleValue()) / (1.0 / n2.doubleValue()))
            );
        }

        throw UnsupportedNumberType
                .of(n1.getClass());
    }

}
