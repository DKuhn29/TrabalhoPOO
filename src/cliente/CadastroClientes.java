package cliente;
import java.util.ArrayList;
public class CadastroClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente buscarPorId(int id) {
        for (int i = 0; i < this.clientes.size(); i++) {
            Cliente aux = this.clientes.get(i);
            if (aux.getId() == id) {
                return aux;
            }
        }
        return null;
    }

    public void cadastrarCliente(Cliente c) {
        if (buscarPorId(c.getId()) != null) {
            System.out.println("Este cliente já está cadastrado!! ");
            return;
        }
        this.clientes.add(c);
    }

    public void listarClientes() {
        for (int i = 0; i < this.clientes.size(); i++) {
            Cliente aux = this.clientes.get(i);
            System.out.println("Cliente " + (i + 1) + ":" + aux.getNome() + " - " + aux.getEmail() + " - " + aux.getTelefone() + " - " + aux.getId());
        }
    }

    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
}