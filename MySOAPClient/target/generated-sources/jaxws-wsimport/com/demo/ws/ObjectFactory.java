
package com.demo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.ws package. 
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

    private final static QName _GetUserByNameResponse_QNAME = new QName("http://education.ws.demo.com/", "getUserByNameResponse");
    private final static QName _GetUserByName_QNAME = new QName("http://education.ws.demo.com/", "getUserByName");
    private final static QName _GetAllUserByNameAndSurname_QNAME = new QName("http://education.ws.demo.com/", "getAllUserByNameAndSurname");
    private final static QName _GetAllUserByNameAndSurnameResponse_QNAME = new QName("http://education.ws.demo.com/", "getAllUserByNameAndSurnameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserByNameResponse }
     * 
     */
    public GetUserByNameResponse createGetUserByNameResponse() {
        return new GetUserByNameResponse();
    }

    /**
     * Create an instance of {@link GetUserByName }
     * 
     */
    public GetUserByName createGetUserByName() {
        return new GetUserByName();
    }

    /**
     * Create an instance of {@link GetAllUserByNameAndSurnameResponse }
     * 
     */
    public GetAllUserByNameAndSurnameResponse createGetAllUserByNameAndSurnameResponse() {
        return new GetAllUserByNameAndSurnameResponse();
    }

    /**
     * Create an instance of {@link GetAllUserByNameAndSurname }
     * 
     */
    public GetAllUserByNameAndSurname createGetAllUserByNameAndSurname() {
        return new GetAllUserByNameAndSurname();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://education.ws.demo.com/", name = "getUserByNameResponse")
    public JAXBElement<GetUserByNameResponse> createGetUserByNameResponse(GetUserByNameResponse value) {
        return new JAXBElement<GetUserByNameResponse>(_GetUserByNameResponse_QNAME, GetUserByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://education.ws.demo.com/", name = "getUserByName")
    public JAXBElement<GetUserByName> createGetUserByName(GetUserByName value) {
        return new JAXBElement<GetUserByName>(_GetUserByName_QNAME, GetUserByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserByNameAndSurname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://education.ws.demo.com/", name = "getAllUserByNameAndSurname")
    public JAXBElement<GetAllUserByNameAndSurname> createGetAllUserByNameAndSurname(GetAllUserByNameAndSurname value) {
        return new JAXBElement<GetAllUserByNameAndSurname>(_GetAllUserByNameAndSurname_QNAME, GetAllUserByNameAndSurname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserByNameAndSurnameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://education.ws.demo.com/", name = "getAllUserByNameAndSurnameResponse")
    public JAXBElement<GetAllUserByNameAndSurnameResponse> createGetAllUserByNameAndSurnameResponse(GetAllUserByNameAndSurnameResponse value) {
        return new JAXBElement<GetAllUserByNameAndSurnameResponse>(_GetAllUserByNameAndSurnameResponse_QNAME, GetAllUserByNameAndSurnameResponse.class, null, value);
    }

}
