package com.springsemweb.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public enum Categoria {
    ACAO("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIMINAL("Crime"),
    TERROR("Horror"),
    FANTASIA("Fantasy");

    private String categoriaOMDB;

    Categoria(String categoriaOMDB){
        this.categoriaOMDB = categoriaOMDB;
    }

    //SE VEIO A PALAVRA ACTION DO OMDB ELE VAI TRANSFORMAR EM AÇÃO
    public static Categoria fromString(String text){
        for (Categoria categoria : Categoria.values()){
            if(categoria.categoriaOMDB.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida");
    }


}
