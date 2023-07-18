import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M/F):");
            String sexo = scanner.nextLine();

            pessoas.add(new Pessoa(nome, sexo));
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        System.out.println("Mulheres:");
        for (Pessoa mulher : mulheres) {
            if (mulher.getSexo().equalsIgnoreCase("F")) {
                System.out.println(mulher.getNome());
            }
        }
    }
}

class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }
}
