package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneFinder {
    public static void main(String[] args) {
        // Texto a ser pesquisado
        String text = """
                Contate-nos pelos números: 
                (351) 91234-5678, (123) 98765-4321 ou pelo telefone fixo 21234-5678.
                Emails não são aceitos: email@domain.com (08-01).
                """;

        // Expressão regular para encontrar números de telefone (com ou sem código de área)
        String phoneRegex = "(\\(\\d{3}\\) )?\\d{5}-\\d{4}";

        // Compilar o padrão
        Pattern pattern = Pattern.compile(phoneRegex);

        // Criar o matcher para pesquisar no texto
        Matcher matcher = pattern.matcher(text);

        // Procurar correspondências
        System.out.println("Números de telefone encontrados:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

