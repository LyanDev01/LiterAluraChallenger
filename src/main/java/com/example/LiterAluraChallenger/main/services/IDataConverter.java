package com.example.LiterAluraChallenger.main.services;

public interface IDataConverter{
    <T> T getData(String json, Class<T> classe);
}
