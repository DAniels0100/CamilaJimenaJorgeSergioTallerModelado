package com.example.miprimeraplicacion;

import com.google.firebase.database.PropertyName;
import org.json.JSONException;
import org.json.JSONObject;

public class Propiedad {
    private String nombrePropiedad;
    private String ubicacion;
    private String amenidadesCasa;
    private int cantidadHabitaciones;
    private int cantidadPersonas;
    private String precio;
    private String imagenUrl;

    // Constructor vacío requerido por Firebase
    public Propiedad() {}

    // Constructor con todos los campos
    public Propiedad(String nombrePropiedad,
                     String precio, String ubicacion, String amenidadesCasa, int cantidadPersonas, int cantidadHabitaciones, String imagenUrl) {
        this.nombrePropiedad = nombrePropiedad;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.amenidadesCasa = amenidadesCasa;
        this.imagenUrl = imagenUrl;
    }

    public JSONObject saveDataJSON() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("nombrePropiedad", nombrePropiedad);
            jsonObject.put("ubicacion", ubicacion);
            jsonObject.put("amenidadesCasa", amenidadesCasa);
            jsonObject.put("cantidadHabitaciones", cantidadHabitaciones);
            jsonObject.put("cantidadPersonas", cantidadPersonas);
            jsonObject.put("precio", precio);
            jsonObject.put("imagenUrl", imagenUrl);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    // Método para limpiar los campos string
    public void refreshData() {
        this.nombrePropiedad = "";
        this.ubicacion = "";
        this.amenidadesCasa = "";
        this.precio = "";
        this.imagenUrl = "";
    }

    @PropertyName("nombrePropiedad")
    public String getNombre() {
        return nombrePropiedad;
    }

    @PropertyName("nombrePropiedad")
    public void setNombre(String nombre) {
        this.nombrePropiedad = nombre;
    }

    @PropertyName("ubicacion")
    public String getUbicacion() {
        return ubicacion;
    }

    @PropertyName("ubicacion")
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @PropertyName("amenidadesCasa")
    public String getAmenidades() {
        return amenidadesCasa;
    }

    @PropertyName("amenidadesCasa")
    public void setAmenidades(String amenidades) {
        this.amenidadesCasa = amenidades;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @PropertyName("imagenUrl")
    public String getImagenUrl() {
        return imagenUrl;
    }

    @PropertyName("imagenUrl")
    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}