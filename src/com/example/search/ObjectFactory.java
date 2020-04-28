
package com.example.search;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.search package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.search
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link PolicyInfo }
     * 
     */
    public PolicyInfo createPolicyInfo() {
        return new PolicyInfo();
    }

    /**
     * Create an instance of {@link AccountInfo.AccountContact }
     * 
     */
    public AccountInfo.AccountContact createAccountInfoAccountContact() {
        return new AccountInfo.AccountContact();
    }

    /**
     * Create an instance of {@link AccountInfo.Policies }
     * 
     */
    public AccountInfo.Policies createAccountInfoPolicies() {
        return new AccountInfo.Policies();
    }

}
