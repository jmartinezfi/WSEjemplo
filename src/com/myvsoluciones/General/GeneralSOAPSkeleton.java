/**
 * GeneralSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.myvsoluciones.General;

public class GeneralSOAPSkeleton implements com.myvsoluciones.General.General_PortType, org.apache.axis.wsdl.Skeleton {
    private com.myvsoluciones.General.General_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nombre"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("saludo", _params, new javax.xml.namespace.QName("", "respuesta"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://myvsoluciones.com/General/", "saludo"));
        _oper.setSoapAction("http://myvsoluciones.com/General/saludo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("saludo") == null) {
            _myOperations.put("saludo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("saludo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sumar", _params, new javax.xml.namespace.QName("", "resultado"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://myvsoluciones.com/General/", "sumar"));
        _oper.setSoapAction("http://myvsoluciones.com/General/sumar");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sumar") == null) {
            _myOperations.put("sumar", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sumar")).add(_oper);
    }

    public GeneralSOAPSkeleton() {
        this.impl = new com.myvsoluciones.General.GeneralSOAPImpl();
    }

    public GeneralSOAPSkeleton(com.myvsoluciones.General.General_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String saludo(java.lang.String nombre) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.saludo(nombre);
        return ret;
    }

    public int sumar(int numero1, int numero2) throws java.rmi.RemoteException
    {
        int ret = impl.sumar(numero1, numero2);
        return ret;
    }

}
