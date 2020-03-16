package com.leafclient.struct.maths.exception;

import com.leafclient.struct.maths.MathOperationsHelper;

/**
 * {@link MathOperationsHelper} operations are really unsafe and do not support any type of {@link Number} implementations.
 * This exception is thrown if an operation is unsupported.
 */
public final class UnsupportedNumberType extends RuntimeException {

    /**
     * A formatted String to display the supported types in case of an error.
     */
    public static String SUPPORTED_NUMBERS_STRING;

    /**
     * Returns a new instance of {@link UnsupportedNumberType} ready to be thrown, oh yeah.
     *
     * @param numberType Number type's class.
     */
    public static UnsupportedNumberType of(Class<? extends Number> numberType) {
        return new UnsupportedNumberType(numberType);
    }

    static {
        final StringBuilder builder = new StringBuilder();
        for(Class<? extends Number> numberType: MathOperationsHelper.SUPPORTED_NUMBERS) {
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
