package com.example.EjemploRest.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name="ofertas")
public class Oferta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String titulo;
    private String descripcion;
    private int salario;
    private String ciudad;
    private String empresa;
    public Oferta() {
        super();
    }
    public Oferta(int id, String titulo, String descripcion, int salario, String ciudad, String empresa) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.salario = salario;
        this.ciudad = ciudad;
        this.empresa = empresa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    @Override
    public String toString() {
        return "Oferta [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", salario=" + salario + ", ciudad=" + ciudad + ", empresa=" + empresa + "]";
    }
}