import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       Filme meuFilme = new Filme();
       meuFilme.setNome("O poderoso chefão");
       meuFilme.setAnoDeLancamento(1970);
       meuFilme.setDuracaoEmMinutos(180);
       System.out.println(("Duração do Filme: " + meuFilme.getDuracaoEmMinutos()));

       meuFilme.exibeFichaTecnica();
       meuFilme.avalia(5);
       meuFilme.avalia(7);
       meuFilme.avalia(10);
       System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacao());
       System.out.println(meuFilme.pegaMedia());

       Serie lost = new Serie();
       lost.setNome("Lost");
       lost.setAnoDeLancamento(2000);
       lost.exibeFichaTecnica();
       lost.setTemporadas(10);
       lost.setEpisodiosPorTemporada(10);
       lost.setMinutosPorEpisodio(50);
       System.out.println("Duração para maratonar: " + lost.getDuracaoEmMinutos());

       Filme outroFilme = new Filme();
       outroFilme.setNome("Avatar");
       outroFilme.setAnoDeLancamento(2023);
       outroFilme.setDuracaoEmMinutos(200);

       System.out.println(calculadora.getTempoTotal());
       System.out.println();

       Recomendacao filtro = new Recomendacao();

       filtro.filtra(meuFilme);

       Episodio episodio = new Episodio();
       episodio.setNumero(1);
       episodio.setSerie(String.valueOf(lost));
       episodio.setTotalVisualizacoes(101);
       filtro.filtra(episodio);
    }
}