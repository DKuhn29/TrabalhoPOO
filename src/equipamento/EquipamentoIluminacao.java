package equipamento;
public class EquipamentoIluminacao extends Equipamento{
    private int potenciaWatts;
    private TipoIluminacao tipo;

    public EquipamentoIluminacao(int codigoIndentificacao, String descricao, double valorDiaria, boolean disponivel, int potenciaWatts, TipoIluminacao tipo){
        super(codigoIndentificacao, descricao, valorDiaria, disponivel);
        this.potenciaWatts = potenciaWatts;
        this.tipo = tipo;
    }
    public double calcularValorDiaria(int dias){
        return getDiaria() *dias*1.10;
    }
}