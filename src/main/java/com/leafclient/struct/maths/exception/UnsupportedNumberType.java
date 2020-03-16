package com.leafclient.struct.maths.exception;

import com.leafclient.struct.maths.MathOperations;

/**
 * {@link MathOperations} operations are really unsafe and do not support any type of {@link Number} implementations.
 * This exception is thrown if an operation is unsupported.
 */
public final class UnsupportedNumberType extends RuntimeException {

    /**
     * Returns a new instance of {@link UnsupportedNumberType} ready to be thrown, oh yeah.
     *
     * @param numberType Number type's class.
     */
    public static UnsupportedNumberType of(Class<? extends Number> numberType) {
        return new UnsupportedNumberType(numberType);
    }

    /**
     * A formatted String to display the supported types in case of an error.
     */
    public static String SUPPORTED_NUMBERS_STRING;

    static {
        final StringBuilder builder = new StringBuilder();
        for(Class<? extends Number> numberType: MathOperations.SUPPORTED_NUMBERS) {
            builder.append(numberType.getSimpleName());
        }

        SUPPORTED_NUMBERS_STRING = builder.toString();
    }

    /**
     * Builds a simple {@link UnsupportedNumberType}.
     *
     * @param numberType Number's type
     */
    UnsupportedNumberType(Class<? extends Number> numberType) {
        super("Unsupported number type (" + numberType.getSimpleName() + ")");
    }

}
