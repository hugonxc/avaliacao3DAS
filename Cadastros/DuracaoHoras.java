package Cadastros;

public class DuracaoHoras {
    private final Viagem viagem;
    private int horaInicio;
    private int minutosInicio;
    private int horaTermino;
    private int minutosTermino;
    private int duracaoHoras;

    public DuracaoHoras(Viagem viagem) {
        super();
        this.viagem = viagem;
        this.horaInicio = viagem.getHoraInicio();
        this.minutosInicio = viagem.getMinutoInicio();
        this.horaTermino = viagem.getHoraTermino();
        this.minutosTermino = viagem.getMinutosTermino();
    }

    public int getDuracaoHoras(){
        int diferencaHoras = this.calculaDiferencaHoras(horaInicio, horaTermino);

        if ((minutosTermino < minutosInicio))  //Arredonda horas no meio para baixo
            duracaoHoras = diferencaHoras - 1;

       else{
            duracaoHoras = diferencaHoras;
        }

        return duracaoHoras;
    }

    private int calculaDiferencaHoras(int horaInicio, int horaTermino){
        return horaTermino - horaInicio;
    }
}
