package cliente;
import java.util.ArrayList;
public class Cliente {
    private int identificacao;
    private String nome;
    private String email;
    private String telefone;
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente(int id, String nome, String email, String telefone){
        this.email = email;
        this.identificacao = id;
        this.nome = nome;
        this.telefone = telefone;
    }
    public int getId(){
        return this.identificacao;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void getClientes(){
        for (int i= 0; i<this.clientes.size();i++){
            Cliente aux = this.clientes.get(i);
            System.out.println("Cliente " + (i+1) + ":");
            System.out.println(aux.getNome() + " - " + aux.getEmail() + " - " + aux.getTelefone() + " - " + aux.getId());
        }
    }

    public void cadastrarClientes(Cliente c){
        clientes.add(c);
    }

}
