/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hpe.bigdata.frontend.spring.authentication;

import org.springframework.security.core.Authentication;

import java.security.Principal;

@SuppressWarnings("WeakerAccess")
public interface AuthenticationInformationRetriever<A extends Authentication, P extends Principal> {

    A getAuthentication();

    P getPrincipal();

}
