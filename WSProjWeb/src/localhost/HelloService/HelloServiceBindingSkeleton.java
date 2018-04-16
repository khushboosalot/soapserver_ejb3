/**
 * HelloServiceBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.HelloService;

public class HelloServiceBindingSkeleton implements localhost.HelloService.HelloServicePortType, org.apache.axis.wsdl.Skeleton {
    private localhost.HelloService.HelloServicePortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://localhost/HelloService.xsd", "SayHelloRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://localhost/HelloService.xsd", "SayHelloRequest"), localhost.HelloService_xsd.SayHelloRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sayHello", _params, new javax.xml.namespace.QName("http://localhost/HelloService.xsd", "SayHelloResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://localhost/HelloService.xsd", "SayHelloResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "SayHello"));
        _oper.setSoapAction("http://localhost/HelloService/SayHello");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sayHello") == null) {
            _myOperations.put("sayHello", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sayHello")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault");
        _fault.setQName(new javax.xml.namespace.QName("http://localhost/HelloService.xsd", "FaultResponse"));
        _fault.setClassName("localhost.HelloService_xsd.FaultResponse");
        _fault.setXmlType(new javax.xml.namespace.QName("http://localhost/HelloService.xsd", "FaultResponse"));
        _oper.addFault(_fault);
    }

    public HelloServiceBindingSkeleton() {
        this.impl = new localhost.HelloService.HelloServiceBindingImpl();
    }

    public HelloServiceBindingSkeleton(localhost.HelloService.HelloServicePortType impl) {
        this.impl = impl;
    }
    public localhost.HelloService_xsd.SayHelloResponse sayHello(localhost.HelloService_xsd.SayHelloRequest parameters) throws java.rmi.RemoteException, localhost.HelloService_xsd.FaultResponse
    {
        localhost.HelloService_xsd.SayHelloResponse ret = impl.sayHello(parameters);
        return ret;
    }

}
