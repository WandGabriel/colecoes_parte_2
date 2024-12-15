import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);
        String nome;
        String sexo;
        String respostaDoUsuario;
        Integer quantidadeSexoMasculino = 0;
        Integer quantidadeSexoFeminino = 0;
        Integer quantidadeDeCadastros;

        List<Pessoa> pessoa = new ArrayList<Pessoa>();

        do {
            System.out.println("*** ---- Cadastro de Pessoas ---- ***");
            System.out.print("Digite um nome: ");
            nome = entradaDeDados.nextLine();
            System.out.print("Digite sexo: ");
            sexo = entradaDeDados.nextLine();

            pessoa.add(new Pessoa(nome, sexo));

            exibirMensagemNovoNome();
            respostaDoUsuario = entradaDeDados.nextLine();

        } while (!respostaDoUsuario.equals("não"));

        for(Pessoa listaDePessoas : pessoa) {
            if (listaDePessoas.getSexo().equalsIgnoreCase("masculino")) {
                quantidadeSexoMasculino++;
            } else {
                quantidadeSexoFeminino++;
            }
        }

        quantidadeDeCadastros = pessoa.size();

        exibirMensagemResultadoMasculinoEFeminino(quantidadeSexoMasculino, quantidadeSexoFeminino ,quantidadeDeCadastros);
    }

    public static void exibirMensagemNovoNome() {
        System.out.println("Deseja inserir novo nome? ");
        System.out.println("sim []  não[]");
        System.out.println("Resposta:");
    }

    public static void exibirMensagemResultadoMasculinoEFeminino(Integer masculino, Integer feminino, Integer quantidadeUsuariosCadastrados) {
        System.out.println("**** ----- Usuários Cadastrados ------ ****");
        System.out.println("Total usuários cadastrados: " + quantidadeUsuariosCadastrados);
        System.out.println("Masculino: " + masculino);
        System.out.println("Feminino: " + feminino);
    }

}