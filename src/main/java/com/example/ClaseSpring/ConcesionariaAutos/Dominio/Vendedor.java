package com.example.ClaseSpring.ConcesionariaAutos.Dominio;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="vendedor")
public class Vendedor implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvendedor;

    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String salariobase;
    @Column
    private String antiguedad;
    @Column
    private String autosvendidos;
    @Column
    private String comisionporauto;
    @Column
    private String sueldo;

    public Vendedor() {
    }

    public Long getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(Long idvendedor) {
        this.idvendedor = idvendedor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(String salariobase) {
        this.salariobase = salariobase;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getAutosvendidos() {
        return autosvendidos;
    }

    public void setAutosvendidos(String autosvendidos) {
        this.autosvendidos = autosvendidos;
    }

    public String getComisionporauto() {
        return comisionporauto;
    }

    public void setComisionporauto(String comisionporauto) {
        this.comisionporauto = comisionporauto;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public void calcSueldo() {
        long porAntiguedad = (long) (Integer.parseInt(salariobase) * (100 + (15 * Integer.parseInt(antiguedad)))/100f);
        //System.out.println(Integer.parseInt(salariobase) + "*" + (100 + (15 * Integer.parseInt(antiguedad)))/100f + "=" + porAntiguedad);
        long comTot = Integer.parseInt(comisionporauto) * Integer.parseInt(autosvendidos);
        //System.out.println(Integer.parseInt(comisionporauto) + "*" + Integer.parseInt(autosvendidos));
        sueldo = Long.toString(porAntiguedad + comTot);
    }
}