package br.com.guimaraes.screenmatch.modelos.calculos;

import br.com.guimaraes.screenmatch.modelos.Filme;
import br.com.guimaraes.screenmatch.modelos.Serie;
import br.com.guimaraes.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
