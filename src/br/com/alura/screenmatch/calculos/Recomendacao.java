package br.com.alura.screenmatch.calculos;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificavel classficicavel){
        if (classficicavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os preferidos do momento");
        } else if (classficicavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloco na sua lista para assistir depois");
        }
    }
}
