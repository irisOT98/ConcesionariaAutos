package com.example.ClaseSpring.ConcesionariaAutos.DAO;

import com.example.ClaseSpring.ConcesionariaAutos.Dominio.Vendedor;
import org.springframework.data.repository.CrudRepository;

public interface VendedorDao extends CrudRepository<Vendedor,Long> {
    
}
