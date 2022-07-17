package com.vukai.projectevuekai.wsb;

import com.vukai.projectevuekai.Entity.Vehicules;
import com.vukai.projectevuekai.dao.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/vehicules")
public class vehiculController {
    @Autowired
    private VehiculeRepository vehiculeRepository;
    @RequestMapping(value = "/index")
    public String index(Model model){
        List<Vehicules> vehl=vehiculeRepository.findAll();
        model.addAttribute("vehicules",vehl);
        return "vehicule";
    }


}
