package com.test.mock;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class AuthenticatorApplicationTest {

  @Test
  public void testAuthenticate() {
    AuthenticatorInterface authenticatorMock;
    AuthenticatorApplication authenticator;
    String username = "JavaCodeGeeks";
    String password = "unsafePassword";

    authenticatorMock = Mockito.mock(AuthenticatorInterface.class);

    authenticator = new AuthenticatorApplication(authenticatorMock);
    when(authenticatorMock.authenticateUser(username, password))
        .thenReturn(false);

    boolean actual = authenticator.authenticate(username, password);

    assertFalse(actual);
  }
}
