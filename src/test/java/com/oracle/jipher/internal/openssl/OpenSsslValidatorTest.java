package com.oracle.jipher.internal.openssl;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class OpenSsslValidatorTest {

    @Test
    public void isAvailable() {
        assertTrue(OpenSslValidator.isAvailable());
    }

    @Test
    public void loadingException() {
        assertNull(OpenSslValidator.loadingException());
    }
}
