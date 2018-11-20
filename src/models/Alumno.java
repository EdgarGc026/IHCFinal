/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author sam
 */
public class Alumno {

    private String idAlumno;
    private String nombreAlumno;
    private String apellidoAlumno;
    private int nivel;
    private int idProfesor;

    // Constructor para inicializar los valores

    public Alumno(String idAlumno, String nombreAlumno, String apellidoAlumno, int nivel, int idProfesor) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.nivel = nivel;
        this.idProfesor = idProfesor;
    }

    public Alumno() {

    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public int getNivel() {
        return nivel;
    }

    // Metodos setter y getters para tu BD
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    // toString para visualizar en pantalla

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombreAlumno=" + nombreAlumno + ", apellidoAlumno="
                + apellidoAlumno + ", nivel=" + nivel + ", idProfesor=" + idProfesor + '}';
    }

}
