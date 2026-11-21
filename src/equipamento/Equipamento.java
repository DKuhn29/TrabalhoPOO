package equipamento;
public abstract class Equipamento{
    private int codigoIndentificacao;
    private String descricao;
    private double valorDiaria;
    private boolean disponivel;

    public Equipamento(int codigoIdentificacao, String descricao, double valorDiaria, boolean disponivel){
        this.codigoIndentificacao = codigoIdentificacao;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }
    public abstract double calcularValorDiaria(int dias);
    public double getDiaria() {
        return valorDiaria;
    }
    public String getDescricao(){
        return descricao;
    }
    public  int getCodigo(){
        return codigoIndentificacao;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public boolean isDisponivel(){
        return disponivel;
    }

}