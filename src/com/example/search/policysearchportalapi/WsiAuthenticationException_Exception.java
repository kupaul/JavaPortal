
package com.example.search.policysearchportalapi;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-04-14T11:48:31.415+05:30
 * Generated source version: 3.3.5
 */

@WebFault(name = "WsiAuthenticationException", targetNamespace = "http://example.com/search/policySearchPortalAPI")
public class WsiAuthenticationException_Exception extends Exception {

    private com.example.search.policysearchportalapi.WsiAuthenticationException wsiAuthenticationException;

    public WsiAuthenticationException_Exception() {
        super();
    }

    public WsiAuthenticationException_Exception(String message) {
        super(message);
    }

    public WsiAuthenticationException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public WsiAuthenticationException_Exception(String message, com.example.search.policysearchportalapi.WsiAuthenticationException wsiAuthenticationException) {
        super(message);
        this.wsiAuthenticationException = wsiAuthenticationException;
    }

    public WsiAuthenticationException_Exception(String message, com.example.search.policysearchportalapi.WsiAuthenticationException wsiAuthenticationException, java.lang.Throwable cause) {
        super(message, cause);
        this.wsiAuthenticationException = wsiAuthenticationException;
    }

    public com.example.search.policysearchportalapi.WsiAuthenticationException getFaultInfo() {
        return this.wsiAuthenticationException;
    }
}