package com.microsoft.windowsazure.mobileservices.sdk.testapp.test;

public interface CustomFunctionTwoParameters<T, V, U> {

	U apply(T t, V v) throws Exception;
}
