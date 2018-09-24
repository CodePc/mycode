package com.singleton;

/**
 * @author prem chand shah on 24-05-2018
 * @project myJava
 */

// double lock check
public final class SStest {
    private static SStest sStest;

    private SStest() {
    }

    public SStest getInstance() {
        if (sStest == null) {
            synchronized (SStest.class) {
                if (sStest == null) {
                    return new SStest();
                }
            }
        }
        return sStest;
    }
}
