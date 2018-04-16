/**
 * HelloServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.HelloService;

public interface HelloServicePortType extends java.rmi.Remote {
    public localhost.HelloService_xsd.SayHelloResponse sayHello(localhost.HelloService_xsd.SayHelloRequest parameters) throws java.rmi.RemoteException, localhost.HelloService_xsd.FaultResponse;
}
