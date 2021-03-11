/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1modulo4;


public class Doctor {

      private String nombre_director;
    private double edad;
    private double años_de_experiencia;
    private String nombre_doctor;
    
       public Doctor(){
      
    }
    
    public Doctor(String nombre_director, double edad, double años_de_experiencia, String doctor){
        this.nombre_director = nombre_director;
        this.edad = edad;
        this.años_de_experiencia = años_de_experiencia;
        this.nombre_doctor = nombre_doctor;
    }
    
    public void imprimirDoctor(){
        System.out.println(nombre_doctor);
    }
    public String getNombre_director() {
        return nombre_director;
    }

 
    public void setNombre_director(String nombre_director) {
        this.nombre_director = nombre_director;
    }

   
    public double getEdad() {
        return edad;
    }

   
    public void setEdad(double edad) {
        this.edad = edad;
    }

    
    public double getAños_de_experiencia() {
        return años_de_experiencia;
    }

    
    public void setAños_de_experiencia(double años_de_experiencia) {
        this.años_de_experiencia = años_de_experiencia;
    }

   
    public String getNombre_doctor() {
        return nombre_doctor;
    }

    
    public void setNombre_doctor(String nombre_doctor) {
        this.nombre_doctor = nombre_doctor;
    }
   
 
    
}
