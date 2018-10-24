package Cadastros;

public class DuracaoMinutos {

    private final Viagem viagem;
    private int minutosInicio;
    private int minutosTermino;
    private int duracaoMinutos;


    public DuracaoMinutos(Viagem viagem) {
        super();
        this.viagem = viagem;
        this.minutosInicio = viagem.getMinutoInicio();
        this.minutosTermino = viagem.getMinutosTermino();
    }

    public int getDuracaoMinutos(){
        if (minutosTermino > minutosInicio)
            duracaoMinutos = minutosTermino - minutosInicio;
        else {
            duracaoMinutos = 60 - minutosInicio + minutosTermino;
            if (duracaoMinutos == 60) //caso especial
                duracaoMinutos = 0;
        }
        return duracaoMinutos;
    }
}
