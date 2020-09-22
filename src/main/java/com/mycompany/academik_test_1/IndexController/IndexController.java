/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.academik_test_1.IndexController;
import com.mycompany.academik_test_1.Model.Cliente;
import com.mycompany.academik_test_1.Service.ClienteService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author reyg6
 */

@Controller
public class IndexController {
    @Resource
    private ClienteService clienteService;
    
    @GetMapping("/index")
    public String Get(Model model){
        
        model.addAttribute("List", clienteService.regresarList());
            
        return "index";
    }
}
