/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1modulo4;


public class Hospital {

  

   private String nombre_hospital;
    private Doctor director;
    private String Nombre_pais;
    private String direccion;
    
    
         public Hospital(){
      
    }
    public String getNombre_hospital() {
        return nombre_hospital;
    }
    public Doctor getDirector() {
        return director;
    }

 
    public void setDirector(Doctor director) {
        this.director = director;
    }

    public void setNombre_hospital(String nombre_hospital) {
        this.nombre_hospital = nombre_hospital;
    }

    public String getNombre_pais() {
        return Nombre_pais;
    }

 
    public void setNombre_pais(String Nombre_pais) {
        this.Nombre_pais = Nombre_pais;
    }

  
    public String getDireccion() {
        return direccion;
    }

   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
