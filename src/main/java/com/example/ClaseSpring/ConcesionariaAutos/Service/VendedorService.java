package com.example.ClaseSpring.ConcesionariaAutos.Service;

import java.util.List;

import com.example.ClaseSpring.ConcesionariaAutos.Dominio.Vendedor;

public interface VendedorService {

    public List<Vendedor> listarVendedores();

    public void guardar(Vendedor persona);

    public void eliminar(Vendedor persona);

    public Vendedor encontrarVendedor(Vendedor vendedor);
}
