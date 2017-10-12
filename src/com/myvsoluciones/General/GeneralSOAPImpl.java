/**
 * GeneralSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.myvsoluciones.General;

public class GeneralSOAPImpl implements com.myvsoluciones.General.General_PortType{
    public java.lang.String saludo(java.lang.String nombre) throws java.rmi.RemoteException {
        return "Hola "+nombre;
    }

    public int sumar(int numero1, int numero2) throws java.rmi.RemoteException {
        return numero1 + numero2;
    }

}
