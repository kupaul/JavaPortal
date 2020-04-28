
/*
 * 
 */

package com.example.search.policysearchportalapi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.0
 * Mon Apr 27 13:46:59 IST 2020
 * Generated source version: 2.3.0
 * 
 */


@WebServiceClient(name = "policySearchPortalAPI", 
                  wsdlLocation = "http://localhost:8180/pc/ws/search/policySearchPortalAPI?WSDL",
                  targetNamespace = "http://example.com/search/policySearchPortalAPI") 
public class PolicySearchPortalAPI extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://example.com/search/policySearchPortalAPI", "policySearchPortalAPI");
    public final static QName PolicySearchPortalAPISoap11Port = new QName("http://example.com/search/policySearchPortalAPI", "policySearchPortalAPISoap11Port");
    public final static QName PolicySearchPortalAPISoap12Port = new QName("http://example.com/search/policySearchPortalAPI", "policySearchPortalAPISoap12Port");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8180/pc/ws/search/policySearchPortalAPI?WSDL");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8180/pc/ws/search/policySearchPortalAPI?WSDL");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public PolicySearchPortalAPI(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PolicySearchPortalAPI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PolicySearchPortalAPI() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public PolicySearchPortalAPI(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public PolicySearchPortalAPI(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PolicySearchPortalAPI(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PolicySearchPortalAPIPortType
     */
    @WebEndpoint(name = "policySearchPortalAPISoap11Port")
    public PolicySearchPortalAPIPortType getPolicySearchPortalAPISoap11Port() {
        return super.getPort(PolicySearchPortalAPISoap11Port, PolicySearchPortalAPIPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PolicySearchPortalAPIPortType
     */
    @WebEndpoint(name = "policySearchPortalAPISoap11Port")
    public PolicySearchPortalAPIPortType getPolicySearchPortalAPISoap11Port(WebServiceFeature... features) {
        return super.getPort(PolicySearchPortalAPISoap11Port, PolicySearchPortalAPIPortType.class, features);
    }
    /**
     * 
     * @return
     *     returns PolicySearchPortalAPIPortType
     */
    @WebEndpoint(name = "policySearchPortalAPISoap12Port")
    public PolicySearchPortalAPIPortType getPolicySearchPortalAPISoap12Port() {
        return super.getPort(PolicySearchPortalAPISoap12Port, PolicySearchPortalAPIPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PolicySearchPortalAPIPortType
     */
    @WebEndpoint(name = "policySearchPortalAPISoap12Port")
    public PolicySearchPortalAPIPortType getPolicySearchPortalAPISoap12Port(WebServiceFeature... features) {
        return super.getPort(PolicySearchPortalAPISoap12Port, PolicySearchPortalAPIPortType.class, features);
    }

}
