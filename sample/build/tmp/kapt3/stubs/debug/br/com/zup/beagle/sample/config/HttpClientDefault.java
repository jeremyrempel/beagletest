package br.com.zup.beagle.sample.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J%\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u001f"}, d2 = {"Lbr/com/zup/beagle/sample/config/HttpClientDefault;", "Lbr/com/zup/beagle/android/networking/HttpClient;", "()V", "coroutineContext", "error/NonExistentClass", "getCoroutineContext", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "job", "addRequestMethod", "", "urlConnection", "Ljava/net/HttpURLConnection;", "method", "Lbr/com/zup/beagle/android/networking/HttpMethod;", "createRequestCall", "Lbr/com/zup/beagle/android/networking/RequestCall;", "createResponseData", "Lbr/com/zup/beagle/android/networking/ResponseData;", "doHttpRequest", "request", "Lbr/com/zup/beagle/android/networking/RequestData;", "execute", "onSuccess", "onError", "(Lbr/com/zup/beagle/android/networking/RequestData;Lerror/NonExistentClass;Lerror/NonExistentClass;)Lbr/com/zup/beagle/android/networking/RequestCall;", "getOrDeleteOrHeadHasData", "", "setRequestBody", "tryFormatException", "Lbr/com/zup/beagle/android/exception/BeagleApiException;", "sample_debug"})
public final class HttpClientDefault implements br.com.zup.beagle.android.networking.HttpClient {
    private final error.NonExistentClass job = null;
    @org.jetbrains.annotations.NotNull()
    private final error.NonExistentClass coroutineContext = null;
    
    public HttpClientDefault() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public error.NonExistentClass getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.beagle.android.networking.RequestCall execute(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.networking.RequestData request, @org.jetbrains.annotations.NotNull()
    error.NonExistentClass onSuccess, @org.jetbrains.annotations.NotNull()
    error.NonExistentClass onError) {
        return null;
    }
    
    private final boolean getOrDeleteOrHeadHasData(br.com.zup.beagle.android.networking.RequestData request) {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {br.com.zup.beagle.android.exception.BeagleApiException.class})
    private final br.com.zup.beagle.android.networking.ResponseData doHttpRequest(br.com.zup.beagle.android.networking.RequestData request) throws br.com.zup.beagle.android.exception.BeagleApiException {
        return null;
    }
    
    private final br.com.zup.beagle.android.exception.BeagleApiException tryFormatException(java.net.HttpURLConnection urlConnection, br.com.zup.beagle.android.networking.RequestData request) {
        return null;
    }
    
    private final void addRequestMethod(java.net.HttpURLConnection urlConnection, br.com.zup.beagle.android.networking.HttpMethod method) {
    }
    
    private final void setRequestBody(java.net.HttpURLConnection urlConnection, br.com.zup.beagle.android.networking.RequestData request) {
    }
    
    private final br.com.zup.beagle.android.networking.ResponseData createResponseData(java.net.HttpURLConnection urlConnection) {
        return null;
    }
    
    private final br.com.zup.beagle.android.networking.RequestCall createRequestCall() {
        return null;
    }
}