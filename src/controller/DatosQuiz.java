/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Pregunta;
import models.Respuesta;
import view.Variables;
import view.ventanaQuiz;

/**
 *
 * @author sam
 */
public class DatosQuiz {

    public static ArrayList<Pregunta> preguntas;

    public static void DatosMostrar() {

        preguntas = new ArrayList<>();
        ArrayList<Respuesta> pregunta1 = new ArrayList<>();
        pregunta1.add(new Respuesta("2", "2", true, false));
        pregunta1.add(new Respuesta("12", "2", false, false));
        pregunta1.add(new Respuesta("4", "2", false, false));
        pregunta1.add(new Respuesta("7", "2", false, false));

        ArrayList<Respuesta> pregunta2 = new ArrayList<>();
        pregunta2.add(new Respuesta("20", "2", false, false));
        pregunta2.add(new Respuesta("120", "2", false, false));
        pregunta2.add(new Respuesta("40", "2", true, false));
        pregunta2.add(new Respuesta("70", "2", false, false));

        ArrayList<Respuesta> pregunta3 = new ArrayList<>();
        pregunta3.add(new Respuesta("200", "2", false, false));
        pregunta3.add(new Respuesta("1200", "2", false, false));
        pregunta3.add(new Respuesta("400", "2", false, false));
        pregunta3.add(new Respuesta("700", "2", true, false));

        /*preguntas.add(new Pregunta(0, "Primera pregunta", pregunta1, 1));
        preguntas.add(new Pregunta(1, "Segunda pregunta", pregunta2, 1));
        preguntas.add(new Pregunta(2, "Tercera pregunta", pregunta3, 1));
         */
    }

    public void validarPreguntasPrimerNivel() {
        //TODO: Obtener las 10 primeras preguntas
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();

        try {
            PreparedStatement preparedstatement = connection.prepareStatement(" SELECT * FROM ejercicios WHERE nivel =  1 ");
            ResultSet rs = preparedstatement.executeQuery();
            List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();

            while (rs.next()) {
                Pregunta pregunta = new Pregunta();
                pregunta.setId(rs.getInt("numEjercicio"));
                pregunta.setLevel(rs.getInt("nivel"));
                pregunta.setText(rs.getString("descripcion"));
                listaPreguntas.add(pregunta);
                //Variables.idBotonComparaPreguntas = resultset.getInt("nivel");
                //Pregunta pregunta = new Pregunta(1, null, respuestas, 1);

            }

            for (Pregunta pregunta : listaPreguntas) {
                System.out.println(pregunta.getText());
            }

        } catch (Exception e) {
            System.out.println("Algo paso y yo no se que fue" + e.getMessage());
        }

    }

    public void validarPreguntasSegundoNivel() {
        //TODO: Obtener las 10 primeras preguntas
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();

        try {
            PreparedStatement preparedstatement = connection.prepareStatement(" SELECT * FROM ejercicios WHERE nivel =  2 ");
            ResultSet rs = preparedstatement.executeQuery();
            List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();

            while (rs.next()) {
                Pregunta pregunta = new Pregunta();
                pregunta.setId(rs.getInt("numEjercicio"));
                pregunta.setLevel(rs.getInt("nivel"));
                pregunta.setText(rs.getString("descripcion"));
                listaPreguntas.add(pregunta);
                //Variables.idBotonComparaPreguntas = resultset.getInt("nivel");
                //Pregunta pregunta = new Pregunta(1, null, respuestas, 1);

            }

            for (Pregunta pregunta : listaPreguntas) {
                System.out.println(pregunta.getText());
            }

        } catch (Exception e) {
            System.out.println("Algo paso y no se que ocurrio" + e.getMessage());
        }

    }

    public void validarPreguntasTercerNivel() {
        //TODO: Obtener las 10 primeras preguntas
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();

        try {
            PreparedStatement preparedstatement = connection.prepareStatement(" SELECT * FROM ejercicios WHERE nivel =  3 ");
            ResultSet rs = preparedstatement.executeQuery();
            List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();

            while (rs.next()) {
                Pregunta pregunta = new Pregunta();
                pregunta.setId(rs.getInt("numEjercicio"));
                pregunta.setLevel(rs.getInt("nivel"));
                pregunta.setText(rs.getString("descripcion"));
                listaPreguntas.add(pregunta);
                //Variables.idBotonComparaPreguntas = resultset.getInt("nivel");
                //Pregunta pregunta = new Pregunta(1, null, respuestas, 1);

            }

            for (Pregunta pregunta : listaPreguntas) {
                System.out.println(pregunta.getText());
            }

        } catch (Exception e) {
            System.out.println("Algo paso y no se que ocurrio" + e.getMessage());
        }
    }
    
    public void enlazarDatos(){
        
    }
}
