package locacao;

import java.util.ArrayList;

public class Locadora {
    private ArrayList<Locacao> historico = new ArrayList<>();

    public void registrarLocacao(Locacao l) {
        this.historico.add(l);
    }

    public void listarLocacoesAtivas() {
        for (int i = 0; i < this.historico.size(); i++) {
            Locacao l = this.historico.get(i);
            if (l.getStatus() == StatusLocacao.ATIVA) {
                l.exibirDetalhes();
                System.out.println(" ");
            }
        }
    }

    public void consultarHistoricoCliente(int idCliente) {
        for (int i = 0; i < this.historico.size(); i++) {
            Locacao l = this.historico.get(i);
            if (l.getCliente().getId() == idCliente) {
                l.exibirDetalhes();
                System.out.println(" ");
            }
        }
    }
}