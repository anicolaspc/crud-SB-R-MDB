package com.crud.crudSBAMDB.CRUD.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductDto {
    @NotBlank(message = "el nombre del producto es obligatorio")
    private String nombre;
    @Min(value = 1, message = "el precio del producto es obligatorio")
    private int precio;

    public ProductDto() {
    }

    public ProductDto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
