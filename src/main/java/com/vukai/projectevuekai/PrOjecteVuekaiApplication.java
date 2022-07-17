package com.vukai.projectevuekai;

import com.vukai.projectevuekai.Entity.Vehicules;
import com.vukai.projectevuekai.dao.VehiculeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class PrOjecteVuekaiApplication {

    public static void main(String[] args) throws ParseException {

        ApplicationContext ctx =SpringApplication.run(PrOjecteVuekaiApplication.class, args);
        VehiculeRepository vehiculeRepository=ctx.getBean(VehiculeRepository.class);
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        vehiculeRepository.save(new Vehicules("marque","model","photo",12,df.parse("1992-11-09 "),df.parse("1992-11-11"),true,true));


    }
}
