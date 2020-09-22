/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.academik_test_1.Model;

import java.util.Objects;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
/**
 *
 * @author reyg6
 */
public class Cliente {
    
    @NotEmpty (message = "Codigo esta vacio")
    @NotNull (message = "Codigo es nulo")
    private String codigoCliente;
    
    @NotEmpty (message = "Nit esta vacio")
    @NotNull (message = "Nit es nulo")
    private String nit;
    
    
    @NotEmpty(message = "Nombre esta vacio")
    @NotNull(message = "Nombre es nulo")
    private String nombreCliente;
    
    @NotEmpty(message = "Direccion vacia")
    @NotNull(message = "Direccion es nula")
    private String direccion;
    
    private boolean status;

    public Cliente(String codigoCliente, String nit, String nombreCliente, String direccion) {
        this.codigoCliente = codigoCliente;
        this.nit = nit;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.status = true;
    }

    public Cliente() {
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
        @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.codigoCliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.codigoCliente, other.codigoCliente);
    }

    

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", nit=" + nit + ", nombreCliente=" + nombreCliente + ", direccion=" + direccion + ", status=" + status + '}';
    }
    
}
