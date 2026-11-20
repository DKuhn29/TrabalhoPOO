package locacao;

import equipamentos.Equipamento;

public class ItemLocacao {
    private Equipamento equipamento;
    private int dias;

    public ItemLocacao(Equipamento e, int d){
        this.equipamento = e;
        this.dias = d;
    }

    public Equipamento getEquipamento() {
        return this.equipamento;
    }

    public int getDias(){
        return this.dias;
    }

    public double calcularValor() {
        return equipamento.calcularValor(dias);
    }

}
