package equipamento;

public class EquipamentoProjecao extends Equipamento{
    private int luminosidadeLumens;
    private Resolucao resolucao;


    public EquipamentoProjecao(int codigoIndentificacao, String descricao, double valorDiaria, boolean disponivel, int luminosidadeLumens, Resolucao resolucao){
        super(codigoIndentificacao, descricao, valorDiaria, disponivel);
        this.luminosidadeLumens = luminosidadeLumens;
        this.resolucao = resolucao;
    }
    public double calcularValorDiaria(int dias){
        if(dias >= 5){
            return getDiaria() * dias * 0.90;
        }
        else{
            return getDiaria() * dias;
        }
    }
}