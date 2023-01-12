public class Proprietario
{
    String cpf;
    String nome;
    String telefoneContato;

    public Proprietario(String cpf, String nome, String telefoneContato)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.telefoneContato = telefoneContato;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTelefoneContato()
    {
        return telefoneContato;
    }
    
    public void setTelefoneContato(String telefoneContato)
    {
        this.telefoneContato = telefoneContato;
    }

}