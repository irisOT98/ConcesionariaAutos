package com.example.ClaseSpring.ConcesionariaAutos.Service;

import java.util.List;

import com.example.ClaseSpring.ConcesionariaAutos.DAO.VendedorDao;
import com.example.ClaseSpring.ConcesionariaAutos.Dominio.Vendedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VendedorServiceImpl implements VendedorService {

    @Autowired
    private VendedorDao vendedorDao;

    @Override
    @Transactional(readOnly=true)
    public List<Vendedor> listarVendedores() {
        return (List<Vendedor>) vendedorDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Vendedor vendedor) {
        vendedorDao.save(vendedor);
    }

    @Override
    @Transactional
    public void eliminar(Vendedor vendedor) {
        vendedorDao.delete(vendedor);
    }

    @Override
    @Transactional(readOnly=true)
    public Vendedor encontrarVendedor(Vendedor vendedor) {
        return vendedorDao.findById(vendedor.getIdvendedor()).orElse(null);
    }
}