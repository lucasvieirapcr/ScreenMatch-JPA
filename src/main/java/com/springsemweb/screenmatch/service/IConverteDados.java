package com.springsemweb.screenmatch.service;

public interface IConverteDados {
    <T> T ObterDados(String json, Class<T> classe);
}
