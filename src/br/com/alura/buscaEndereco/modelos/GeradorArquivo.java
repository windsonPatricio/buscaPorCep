package br.com.alura.buscaEndereco.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {

    public void geraJson (CepClass endereco) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();


        try {
            FileWriter escrita = new FileWriter(endereco.cep() + ".json");
            escrita.write(gson.toJson(endereco));
            escrita.close();

        } catch (IOException e) {
            throw new RuntimeException("Não foi possivel criar o arquivo!!");
        }



    }
}
