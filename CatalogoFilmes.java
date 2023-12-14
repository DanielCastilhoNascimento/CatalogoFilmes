import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CatalogoFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Filme oEloPerdido = new Filme("O Elo Perdido", LocalDate.of(1970,1,1)
                , 350000, "Filme juvenil baseado na pré-história");

        System.out.println("Titulo     : " + oEloPerdido.getNome());
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Lançamento : " + oEloPerdido.getDataLancamento().format(dataFormatada));
        System.out.printf ("Orçamento  : US$ %.2f %n", oEloPerdido.getOrcamento());
        System.out.println("Descrição  : " + oEloPerdido.getDescricao());

        scanner.close();
    }

}