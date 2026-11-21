package cliente;

public class Cliente {
    private int identificacao;
    private String nome;
    private String email;
    private String telefone;


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

}
