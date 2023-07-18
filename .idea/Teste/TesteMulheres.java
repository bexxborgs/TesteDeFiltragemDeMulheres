
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteMulheres {

        @Test
        public void testarApenasMulheres() {
            List<Pessoa> pessoas = new ArrayList<>();
            pessoas.add(new Pessoa("Maria", "F"));
            pessoas.add(new Pessoa("João", "M"));
            pessoas.add(new Pessoa("Ana", "F"));
            pessoas.add(new Pessoa("Pedro", "M"));
            pessoas.add(new Pessoa("Julia", "F"));

            List<Pessoa> mulheres = pessoas.stream()
                    .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                    .collect(Collectors.toList());

            for (Pessoa mulher : mulheres) {
                assertEquals("F", mulher.getSexo().toUpperCase());
            }
        }
    }

