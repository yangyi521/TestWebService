
package org.ccnt.jax.web.client;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloDemoService", targetNamespace = "http://service.ouc.com/", wsdlLocation = "http://localhost:8080/WebServiceDemo/Service/hello?wsdl")
public class HelloDemoService
    extends Service
{

    private final static URL HELLODEMOSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLODEMOSERVICE_EXCEPTION;
    private final static QName HELLODEMOSERVICE_QNAME = new QName("http://service.ouc.com/", "HelloDemoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebServiceDemo/Service/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLODEMOSERVICE_WSDL_LOCATION = url;
        HELLODEMOSERVICE_EXCEPTION = e;
    }

    public HelloDemoService() {
        super(__getWsdlLocation(), HELLODEMOSERVICE_QNAME);
    }

    public HelloDemoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLODEMOSERVICE_QNAME, features);
    }

    public HelloDemoService(URL wsdlLocation) {
        super(wsdlLocation, HELLODEMOSERVICE_QNAME);
    }

    public HelloDemoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLODEMOSERVICE_QNAME, features);
    }

    public HelloDemoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloDemoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloDemo
     */
    @WebEndpoint(name = "HelloDemoPort")
    public HelloDemo getHelloDemoPort() {
        return super.getPort(new QName("http://service.ouc.com/", "HelloDemoPort"), HelloDemo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloDemo
     */
    @WebEndpoint(name = "HelloDemoPort")
    public HelloDemo getHelloDemoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ouc.com/", "HelloDemoPort"), HelloDemo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLODEMOSERVICE_EXCEPTION!= null) {
            throw HELLODEMOSERVICE_EXCEPTION;
        }
        return HELLODEMOSERVICE_WSDL_LOCATION;
    }

}
