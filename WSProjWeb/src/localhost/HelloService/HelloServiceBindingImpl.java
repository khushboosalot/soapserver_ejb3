/**
 * HelloServiceBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.HelloService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import localhost.HelloService_xsd.SayHelloResponse;
@WebService
@Stateless
@LocalBean
public class HelloServiceBindingImpl implements localhost.HelloService.HelloServicePortType{
	@WebMethod
    public localhost.HelloService_xsd.SayHelloResponse sayHello(localhost.HelloService_xsd.SayHelloRequest parameters) throws java.rmi.RemoteException, localhost.HelloService_xsd.FaultResponse {
        return new SayHelloResponse(parameters.getMessage());
    } 

}
