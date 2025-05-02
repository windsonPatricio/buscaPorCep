package br.com.alura.buscaEndereco.Excecao;

public class ErroExcepion extends RuntimeException{

    private String mensagem;

    public ErroExcepion (String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return this.mensagem;
    }
}
