package equipamento;
public class EquipamentoSom extends Equipamento{
    private int potenciaWatts;
    private int qtdCanaisAudio;


    public EquipamentoSom(int codigoIndentificacao, String descricao, double valorDiaria, boolean disponivel, int potenciaWatts, int qtdCanaisAudio){
        super(codigoIndentificacao, descricao, valorDiaria, disponivel);
        this.potenciaWatts = potenciaWatts;
        this.qtdCanaisAudio = qtdCanaisAudio;
    }
    public double calcularValorDiaria(int dias){
        return getDiaria()*dias;
    }
}