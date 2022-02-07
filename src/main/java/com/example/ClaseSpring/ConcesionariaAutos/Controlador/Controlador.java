package com.example.ClaseSpring.ConcesionariaAutos.Controlador;

import java.util.ArrayList;

import com.example.ClaseSpring.ConcesionariaAutos.Dominio.Vendedor;
import com.example.ClaseSpring.ConcesionariaAutos.Service.VendedorServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @Autowired
    private VendedorServiceImpl vendedorService;

    // http://localhost:8080
    @GetMapping("/")
    public String concesionariaAt(Model model) {
        ArrayList<Vendedor> vendedores = (ArrayList<Vendedor>) vendedorService.listarVendedores();

        for(Vendedor v: vendedores)
        {
            v.calcSueldo();
            vendedorService.guardar(v);
        }
        model.addAttribute("vendedores", vendedores);
        return "Concesionariaautos";
    }
    // persona.getName();
}