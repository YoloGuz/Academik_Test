/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.academik_test_1.Service;

import com.mycompany.academik_test_1.Model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
/**
 *
 * @author reyg6
 */
@Service
public class ClienteService {
    
    public static List<Cliente> clienteList = new ArrayList<>();
    
    
        public boolean agregarCliente(Cliente cliente){
        cliente.setStatus(true);
        boolean existe = false;
        if(clienteList == null){
                existe = false;
            }else{
                for(int i = 0; i < clienteList.size(); i++){

                    if(clienteList.get(i).getCodigoCliente().equals(cliente.getCodigoCliente())){
                               existe = true;
                               break;

                        }else{
                            continue;
                        }
                    }
               }
        
            if(existe == false){
                clienteList.add(cliente);
            }
            System.out.println(clienteList);
            
            return !existe;
        }
        
        
        public List<Cliente> regresarList(){
            return clienteList;
        }
        
        public Cliente buscarCliente(String codigoCliente) {
        
        for(Cliente c : clienteList){
            if (c.getCodigoCliente().equalsIgnoreCase(codigoCliente)){
                return c;
            }
        }
        return null;
        }
     
     
        public boolean editar(Cliente cliente){
            
            for(int i = 0; i < clienteList.size(); i++){
                if(clienteList.get(i).getCodigoCliente().equalsIgnoreCase(cliente.getCodigoCliente())){
                    clienteList.get(i).setNombreCliente(cliente.getNombreCliente());
                    clienteList.get(i).setDireccion(cliente.getDireccion());
                    clienteList.get(i).setNit(cliente.getNit());
                    
                    return true;
                }else{
                    continue;
                }
                
            }
            return false;
        }
        
        public boolean eliminarCliente(Cliente cliente){
            for (int i = 0; i < clienteList.size(); i++){
            if (clienteList.get(i).getCodigoCliente().equalsIgnoreCase(cliente.getCodigoCliente())){
                
                clienteList.get(i).setStatus(false);
                return true;
            }
            }
            return false;
        }
        
        
}
