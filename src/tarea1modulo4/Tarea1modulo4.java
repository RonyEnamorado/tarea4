/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1modulo4;

/**
 *
 * @
 */
public class Tarea1modulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Hospital hospital_1 = new Hospital();
       Doctor doctor_1= new Doctor();
       
       hospital_1.setNombre_hospital("Hospital Escuela");
       hospital_1.setNombre_pais("Honduras");
       doctor_1.setNombre_doctor("Felix Carcamo");
       doctor_1.setEdad(45);
       doctor_1.setAños_de_experiencia(20);
       
       
      
       Hospital hospital_2 = new Hospital();
       Doctor doctor_2= new Doctor();
       
       hospital_2.setNombre_hospital("Mario Catarino Rivas");
       hospital_2.setNombre_pais("Honduras");
       doctor_2.setNombre_doctor("Carlos Umaña");
       doctor_2.setEdad(56);
       doctor_2.setAños_de_experiencia(38);
       
       
       Hospital hospital_3 = new Hospital();
       Doctor doctor_3 = new Doctor();
       
       hospital_3.setNombre_hospital("Hospital Regional del Sur");
       hospital_3.setNombre_pais("Honduras");
       doctor_3.setNombre_doctor("Victor Davila");
       doctor_3.setEdad(66);
       doctor_3.setAños_de_experiencia(42);
       
       System.out.println("primer hospital");
       System.out.println("nombre del hospital: "+hospital_1.getNombre_hospital());
       System.out.println("primer hospital");
       System.out.println("nombre pais: "+hospital_1.getNombre_pais() );
       System.out.println("primer hospital");
       System.out.println("nombre doctor: "+hospital_1.getDirector().getNombre_doctor() );
       System.out.println("primer hospital");
       System.out.println("edad: "+hospital_1.getDirector().getEdad() );
       System.out.println("primer hospital");
       System.out.println("años de experiencia: "+hospital_1.getDirector().getAños_de_experiencia());
       
       System.out.println("segundo hospital");
       System.out.println("nombre del hospital: "+hospital_2.getNombre_hospital());
       System.out.println("segundo hospital");
       System.out.println("nombre pais: "+hospital_2.getNombre_pais() );
       System.out.println("segundo hospital");
       System.out.println("nombre doctor: "+hospital_2.getDirector().getNombre_doctor() );
       System.out.println("segundo hospital");
       System.out.println("edad: "+hospital_2.getDirector().getEdad() );
       System.out.println("segundo hospital");
       System.out.println("años de experiencia: "+hospital_2.getDirector().getAños_de_experiencia());
       
       System.out.println("tercer hospital");
       System.out.println("nombre del hospital: "+hospital_3.getNombre_hospital());
       System.out.println("tercer hospital");
       System.out.println("nombre pais: "+hospital_3.getNombre_pais() );
       System.out.println("tercer hospital");
       System.out.println("nombre doctor: "+hospital_3.getDirector().getNombre_doctor() );
       System.out.println("tercer hospital");
       System.out.println("edad: "+hospital_3.getDirector().getEdad() );
       System.out.println("tercer hospital");
       System.out.println("años de experiencia: "+hospital_3.getDirector().getAños_de_experiencia());
       
    }
    
}
