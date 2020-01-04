
package com.demo.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EducationService", targetNamespace = "http://education.ws.demo.com/", wsdlLocation = "http://localhost:8084/MySOAPService/EducationService?wsdl")
public class EducationService_Service
    extends Service
{

    private final static URL EDUCATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException EDUCATIONSERVICE_EXCEPTION;
    private final static QName EDUCATIONSERVICE_QNAME = new QName("http://education.ws.demo.com/", "EducationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/MySOAPService/EducationService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EDUCATIONSERVICE_WSDL_LOCATION = url;
        EDUCATIONSERVICE_EXCEPTION = e;
    }

    public EducationService_Service() {
        super(__getWsdlLocation(), EDUCATIONSERVICE_QNAME);
    }

    public EducationService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EDUCATIONSERVICE_QNAME, features);
    }

    public EducationService_Service(URL wsdlLocation) {
        super(wsdlLocation, EDUCATIONSERVICE_QNAME);
    }

    public EducationService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EDUCATIONSERVICE_QNAME, features);
    }

    public EducationService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EducationService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EducationService
     */
    @WebEndpoint(name = "EducationServicePort")
    public EducationService getEducationServicePort() {
        return super.getPort(new QName("http://education.ws.demo.com/", "EducationServicePort"), EducationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EducationService
     */
    @WebEndpoint(name = "EducationServicePort")
    public EducationService getEducationServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://education.ws.demo.com/", "EducationServicePort"), EducationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EDUCATIONSERVICE_EXCEPTION!= null) {
            throw EDUCATIONSERVICE_EXCEPTION;
        }
        return EDUCATIONSERVICE_WSDL_LOCATION;
    }

}
