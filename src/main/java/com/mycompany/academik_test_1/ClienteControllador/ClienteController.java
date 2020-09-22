/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.academik_test_1.ClienteControllador;

import com.mycompany.academik_test_1.Model.Cliente;
import com.mycompany.academik_test_1.Service.ClienteService;
import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/*
 *
 * @author reyg6
 */
@Controller
public class ClienteController {
     
    @Resource
    private ClienteService clienteService;
    
    
    @GetMapping("/cliente")
    public String get(Model model){
        
        model.addAttribute("cliente", new Cliente());
        
        return "cliente/crear-cliente";
    }
    
    @GetMapping("/cliente/codigo/{codigoCliente}")
    public String getByCodigo(Model model, @PathVariable("codigoCliente") String codigoCliente) {

        Cliente cliente = clienteService.buscarCliente(codigoCliente);

        model.addAttribute("cliente", cliente);

        return "cliente/editar-cliente";
    }
    
    @GetMapping("/cliente/eliminar/{codigoCliente}")
    public String delete(Model model, @PathVariable("codigoCliente") String codigoCliente){
        
        Cliente cliente = clienteService.buscarCliente(codigoCliente);
        
        boolean eliminar = clienteService.eliminarCliente(cliente);
        
        if(eliminar == true){
            model.addAttribute("mensaje", "Eliminado Exitosamente");
        }else{
            model.addAttribute("mensaje", "NO se puede eliminar");
        }

        
        
        return "cliente/eliminar-cliente";
    }
    
    
    @PostMapping("/cliente/crear")
    public String create(
            Model model,
            @Valid @ModelAttribute("cliente") Cliente cliente,
            BindingResult bindingResult
        ){
            
            if(!bindingResult.hasErrors()){
                boolean agregado = clienteService.agregarCliente(cliente);
                
                if(agregado == true){
                
                model.addAttribute("cliente", new Cliente());
                model.addAttribute("mensaje", "Cliente agregado satisfactoriamente");
                }else{
                    model.addAttribute("mensaje", "¡¡Cliente ya existe!!");
                }
            }
            return "cliente/crear-cliente";
    }


    @PostMapping("/cliente/editar")
    public String edit(Model model, @ModelAttribute("cliente") Cliente cliente) {

        boolean editado = clienteService.editar(cliente);
        
        if(editado == true){
            model.addAttribute("mensaje", "Editado exitosamente");
        }else{
            model.addAttribute("mensaje", "No se puede editar");
        }
        
        return "cliente/editar-cliente";
    }

}
