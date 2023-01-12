public class Imovel extends Proprietario
{
    String endereco;
    double metragem;
    double valorMercado;
    boolean novo;

    public Imovel(String cpf, String nome, String telefoneContato, String endereco, double metragem, double valorMercado, boolean novo)
    {   
        super(cpf, nome, telefoneContato);
        this.endereco = endereco;
        this.metragem = metragem;
        this.valorMercado = valorMercado;
        this.novo = novo;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public double getMetragem()
    {
        return metragem;
    }

    public void setMetragem(double metragem)
    {
        this.metragem = metragem;
    }

    public double getValorMercado()
    {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado)
    {
        this.valorMercado = valorMercado;
    }

    public boolean getNovo()
    {
        return novo;
    }

    public void setNovo(boolean novo)
    {
        this.novo = novo;
    }

    public double valorMetro2()
    {
        double valorMetro = 0;
        valorMetro = valorMercado / metragem;
        return valorMetro;
    }

}