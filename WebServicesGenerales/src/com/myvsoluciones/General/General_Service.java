/**
 * General_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.myvsoluciones.General;

public interface General_Service extends javax.xml.rpc.Service {
    public java.lang.String getGeneralSOAPAddress();

    public com.myvsoluciones.General.General_PortType getGeneralSOAP() throws javax.xml.rpc.ServiceException;

    public com.myvsoluciones.General.General_PortType getGeneralSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
