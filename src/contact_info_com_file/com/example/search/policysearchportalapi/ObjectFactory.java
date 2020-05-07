
package com.example.search.policysearchportalapi;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.search.policysearchportalapi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.search.policysearchportalapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountInfo }
     * 
     */
    public GetAccountInfo createGetAccountInfo() {
        return new GetAccountInfo();
    }

    /**
     * Create an instance of {@link GetAccountInfoResponse }
     * 
     */
    public GetAccountInfoResponse createGetAccountInfoResponse() {
        return new GetAccountInfoResponse();
    }

    /**
     * Create an instance of {@link WsiAuthenticationException }
     * 
     */
    public WsiAuthenticationException createWsiAuthenticationException() {
        return new WsiAuthenticationException();
    }

    /**
     * Create an instance of {@link GetPolicyInfo }
     * 
     */
    public GetPolicyInfo createGetPolicyInfo() {
        return new GetPolicyInfo();
    }

    /**
     * Create an instance of {@link GetPolicyInfoResponse }
     * 
     */
    public GetPolicyInfoResponse createGetPolicyInfoResponse() {
        return new GetPolicyInfoResponse();
    }

    /**
     * Create an instance of {@link GetContactInfo }
     * 
     */
    public GetContactInfo createGetContactInfo() {
        return new GetContactInfo();
    }

    /**
     * Create an instance of {@link GetContactInfoResponse }
     * 
     */
    public GetContactInfoResponse createGetContactInfoResponse() {
        return new GetContactInfoResponse();
    }

}
