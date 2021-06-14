package com.jacobroe.GettingFamiliarWithRouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DojoController {
    @RequestMapping("/{name}")
    public String dojo(@PathVariable("name") String name) {
        if(name.equals("dojo")){
                return "The " +name+ " is awesome!";}
        
        else if(name.equals("burbank-dojo")) {
            return "Burbank Dojo is located in Southern California!";}
        
        else if(name.equals("san-jose")) {
            return "SJ Dojo is the headquarters";}
        
        else { 
        	return "No dojo was found!";
        }
    }
}