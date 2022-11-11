package com.example.bbdd;

import java.util.stream.BaseStream;

public class EstructuraBBDD {
    private EstructuraBBDD(){

    }
    public static final String NOMBRE_TABLA = "DATOSPERSONALES";
    public static final String NOMBRE_COLUMNA1 = "ID";
    public static final String NOMBRE_COLUMNA2 = "NOMBRE";
    public static final String NOMBRE_COLUMNA3 = "APELLIDO";

    private static final String TIPO_TEXTO = " TEXTO";
    private static final String COMA_SEP = ",";
    protected static final String SQL_CREAR_ENTRADA =
            "CREATE TABLE " + EstructuraBBDD.NOMBRE_TABLA + " (" +
                EstructuraBBDD.NOMBRE_COLUMNA1 + " ID," +
                EstructuraBBDD.NOMBRE_COLUMNA2 + TIPO_TEXTO + COMA_SEP +
                EstructuraBBDD.NOMBRE_COLUMNA3 + TIPO_TEXTO + " )";

    protected static final String SQL_BORRAR_ENTRADA =
            "DROP TABLE IF EXISTS " + EstructuraBBDD.NOMBRE_TABLA;

}
