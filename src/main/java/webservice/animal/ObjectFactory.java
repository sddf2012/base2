
package webservice.animal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.webservice.service package. 
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

    private final static QName _GetCat_QNAME = new QName("http://service.webservice.my/", "getCat");
    private final static QName _GetCatResponse_QNAME = new QName("http://service.webservice.my/", "getCatResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCat }
     * 
     */
    public GetCat createGetCat() {
        return new GetCat();
    }

    /**
     * Create an instance of {@link GetCatResponse }
     * 
     */
    public GetCatResponse createGetCatResponse() {
        return new GetCatResponse();
    }

    /**
     * Create an instance of {@link Cat }
     * 
     */
    public Cat createCat() {
        return new Cat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.my/", name = "getCat")
    public JAXBElement<GetCat> createGetCat(GetCat value) {
        return new JAXBElement<GetCat>(_GetCat_QNAME, GetCat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.my/", name = "getCatResponse")
    public JAXBElement<GetCatResponse> createGetCatResponse(GetCatResponse value) {
        return new JAXBElement<GetCatResponse>(_GetCatResponse_QNAME, GetCatResponse.class, null, value);
    }

}
