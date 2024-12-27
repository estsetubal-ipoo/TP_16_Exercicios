package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFinder {
    public static void main(String[] args) {
        // Texto contendo emails
        String text = """
                Contatos: 
                alice@example.com, bob.smith@domain.org
                ou marketing-team@company.net.
                Endereços inválidos: john.doe@domain, @missing.com.
                """;

        // Expressão regular para validar e-mails
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compilar o padrão
        Pattern pattern = Pattern.compile(emailRegex);

        // Criar o matcher
        Matcher matcher = pattern.matcher(text);

        // Procurar e-mails válidos
        System.out.println("E-mails encontrados:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

