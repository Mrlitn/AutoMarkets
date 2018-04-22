package com.main.utils;

/**
 * 描    述：返回值的适配器
 * @param <T>
 * @param <R>
 */
public interface CallAdapter<T, R> {

    /** call执行的代理方法 */
    R adapt(Call<T> call, AdapterParam param);
}
