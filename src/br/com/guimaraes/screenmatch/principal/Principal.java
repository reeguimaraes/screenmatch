import br.com.guimaraes.screenmatch.calculos.FiltroRecomendacao;
import br.com.guimaraes.screenmatch.modelos.Episodio;
import br.com.guimaraes.screenmatch.modelos.Filme;
import br.com.guimaraes.screenmatch.modelos.Serie;
import br.com.guimaraes.screenmatch.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        System.out.println("Duracao do filme: " +meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliacoes: "+ meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar Lost: " +lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);

        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da Lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());




    }
}
