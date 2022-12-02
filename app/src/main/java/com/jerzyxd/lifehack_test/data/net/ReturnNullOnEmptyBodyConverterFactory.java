package com.jerzyxd.lifehack_test.data.net;

import androidx.annotation.NonNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

class ReturnNullOnEmptyBodyConverterFactory extends Converter.Factory {

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(
            @NonNull Type type,
            @NonNull Annotation[] annotations,
            Retrofit retrofit
    ) {
        final Converter<ResponseBody, ?> delegate = retrofit.nextResponseBodyConverter(this, type, annotations);
        return (Converter<ResponseBody, Object>) value -> {
            if (value.contentLength() == 0) return null;
            return delegate.convert(value);
        };
    }
}
