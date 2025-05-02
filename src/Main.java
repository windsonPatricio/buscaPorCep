import br.com.alura.buscaEndereco.modelos.BuscaJson;
import br.com.alura.buscaEndereco.modelos.CepClass;
import br.com.alura.buscaEndereco.modelos.GeradorArquivo;


import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String digitado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("LOCALIZADOR DE CIDADES POR CEP!");
        System.out.println("digite um cep:");
        digitado = scanner.nextLine();

        try {
            String endereco = "https://viacep.com.br/ws/" + digitado + "/json/";

            BuscaJson busca = new BuscaJson();
            CepClass resultado = busca.buscaJson(endereco);

            System.out.println(resultado);

            GeradorArquivo geradorArquivo = new GeradorArquivo();
            geradorArquivo.geraJson(resultado);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Nao deu certo!!");
        }
        }
    }
