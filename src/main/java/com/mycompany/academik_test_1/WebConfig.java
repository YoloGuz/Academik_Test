/*
 * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.academik_test_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author reyg6
 */
@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        
        return bean;
    }
}
