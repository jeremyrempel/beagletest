package br.com.zup.beagle.sample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/beagle/sample/AppBeagleConfig;", "Lbr/com/zup/beagle/android/setup/BeagleConfig;", "cache", "Lbr/com/zup/beagle/android/setup/Cache;", "isLoggingEnabled", "", "(Lbr/com/zup/beagle/android/setup/Cache;Z)V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "getCache", "()Lbr/com/zup/beagle/android/setup/Cache;", "environment", "Lbr/com/zup/beagle/android/setup/Environment;", "getEnvironment", "()Lbr/com/zup/beagle/android/setup/Environment;", "()Z", "sample_debug"})
@br.com.zup.beagle.android.annotation.BeagleComponent()
public final class AppBeagleConfig implements br.com.zup.beagle.android.setup.BeagleConfig {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.beagle.android.setup.Cache cache = null;
    private final boolean isLoggingEnabled = false;
    
    public AppBeagleConfig(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.setup.Cache cache, boolean isLoggingEnabled) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.beagle.android.setup.Cache getCache() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isLoggingEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.beagle.android.setup.Environment getEnvironment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBaseUrl() {
        return null;
    }
}