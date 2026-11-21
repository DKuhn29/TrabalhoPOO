package locacao;
import java.util.ArrayList;
import equipamento.Equipamento;
import cliente.Cliente;

public class Locacao {
    private Cliente cliente;
    private ArrayList <ItemLocacao> itens = new ArrayList<>();
    private int dias;
    private StatusLocacao status;
    private double multa;

    public Locacao(Cliente cliente, int dias) {
        this.cliente = cliente;
        this.dias = dias;
        this.status = StatusLocacao.ATIVA;
    }

    public Cliente getCliente(){
        return this.cliente;
    }
    public ArrayList<ItemLocacao> getItens(){
        return this.itens;
    }
    public int getDias(){
        return this.dias;
    }
    public StatusLocacao getStatus(){
        return this.status;
    }
    public double getMulta(){
        return this.multa;
    }

    public boolean adicionarEquipamento(Equipamento e) {
        if (!e.isDisponivel()) {
            System.out.println("O equipamento " + e.getDescricao() + " já está alugado");
            return false;
        }
        for (int i = 0; i < this.itens.size(); i++) {
            if (itens.get(i).getEquipamento().getCodigo() == e.getCodigo()) {
                System.out.println("O equipamento "+ e.getDescricao() + " já foi alugado");
                return false;
            }
        }
        ItemLocacao item = new ItemLocacao(e, dias);
        itens.add(item);
        e.setDisponivel(false);
        return true;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).calcularValor();
        }
        return total;
    }

    public void devolver(int diasUsados) {
        if (this.status == StatusLocacao.DEVOLVIDA) {
            System.out.println("Essa locação já foi devolvida.");
            return;
        }
        int diasAtraso = diasUsados - this.dias;
        if (diasAtraso > 0) {
            for (int i = 0; i < itens.size(); i++) {
                multa += itens.get(i).getEquipamento().getDiaria() * 0.5 * diasAtraso;
            }
        }

        for (int i = 0; i < itens.size(); i++) {
            itens.get(i).getEquipamento().setDisponivel(true);
        }
        status = StatusLocacao.DEVOLVIDA;
    }

    public void exibirDetalhes() {
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Dias: " + this.dias + " - Situação: " + this.status);
        for (int i = 0; i < itens.size(); i++) {
            ItemLocacao item = itens.get(i);
            System.out.println("Nome: " + item.getEquipamento().getDescricao()
                    + ": R$ " + item.calcularValor());
        }
        System.out.println("Total: R$ " + calcularValorTotal());
        if (status == StatusLocacao.DEVOLVIDA) {
            System.out.println("Multa: R$ " + multa);
        }
    }

}