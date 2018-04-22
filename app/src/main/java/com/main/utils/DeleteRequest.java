package com.main.utils;

import okhttp3.Request;
import okhttp3.RequestBody;

public class DeleteRequest<T> extends BodyRequest<T, DeleteRequest<T>> {

    public DeleteRequest(String url) {
        super(url);
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.DELETE;
    }

    @Override
    public okhttp3.Request generateRequest(RequestBody requestBody) {
        Request.Builder requestBuilder = generateRequestBuilder(requestBody);
        return requestBuilder.delete(requestBody).url(url).tag(tag).build();
    }
}