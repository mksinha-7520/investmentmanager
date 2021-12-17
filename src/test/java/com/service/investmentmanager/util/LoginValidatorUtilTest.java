package com.service.investmentmanager.util;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

public class LoginValidatorUtilTest {

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected = NullPointerException.class)
	public void mockApplicationUserAndReturnNull() {
		LoginValidatorUtil applicationUser = mock(LoginValidatorUtil.class);
		SecurityContext securityContext = mock(SecurityContext.class);
		when(securityContext.getAuthentication()).thenReturn(null);
		SecurityContextHolder.setContext(securityContext);
		when(SecurityContextHolder.getContext().getAuthentication().getPrincipal()).thenReturn(applicationUser);
	}

	@Test
	public void mockApplicationUser() {
		LoginValidatorUtil applicationUser = mock(LoginValidatorUtil.class);
		Authentication authentication = mock(Authentication.class);
		SecurityContext securityContext = mock(SecurityContext.class);
		when(securityContext.getAuthentication()).thenReturn(authentication);
		SecurityContextHolder.setContext(securityContext);
		when(SecurityContextHolder.getContext().getAuthentication().getPrincipal()).thenReturn(applicationUser);
	}

}
