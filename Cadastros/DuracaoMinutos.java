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
        int duracaoMinutos = minutosTermino - minutosInicio;

        if (duracaoMinutos < 0)
            duracaoMinutos = this.adicionaHoraEmMinutos(duracaoMinutos);

        return duracaoMinutos;
    }

    private int adicionaHoraEmMinutos(int minutos){
        return minutos + 60;
    }
}
