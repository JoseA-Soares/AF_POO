import java.util.*;

public class App {
    public static void main(String[] args) throws Exception
    {
        int imoveisUsados = 0;
        double valorMin, valorMax;
        valorMin = valorMax = 0;
        
        ArrayList <Imovel> Imoveis = new ArrayList<Imovel>();
        Imoveis.add(new Imovel("01123456789", "Ana", "(00)5555-5555", "Alameda dos anjos 111", 225, 300000, true));
        Imoveis.add(new Imovel("98765432110", "Beatriz", "(00)9999-9999", "Rua da esquina 222", 100, 150000, false));
        Imoveis.add(new Imovel("01223456789", "Marcos", "(00)1111-1111", "Travessa do tranco 333", 80, 100000, false));
        Imoveis.add(new Imovel("98765432210", "William", "(00)3333-3333", "Avenida das brumas 444", 300, 800000, true));

        for(int i=0; i < Imoveis.size(); i++)
        {
            if(Imoveis.get(i).getNovo() == false)
            {
                imoveisUsados++;
            }
        }
        System.out.println("\nImóveis usados à venda: " + imoveisUsados);

        valorMin = 1000.00;
        valorMax = 2000.00;

        for(int i =0; i < Imoveis.size(); i++)
        {
            if(Imoveis.get(i).valorMetro2() <= valorMax && Imoveis.get(i).valorMetro2() >= valorMin)
            {
                System.out.println("\nPropietário: " + Imoveis.get(i).getNome());
                System.out.println("Telefone: " + Imoveis.get(i).getTelefoneContato());
                System.out.println("CPF: " + Imoveis.get(i).getCpf());
                System.out.println("Endereço: " + Imoveis.get(i).getEndereco());
                if(Imoveis.get(i).getNovo() == true)
                    System.out.println("O imóvel é novo.");
                else
                    System.out.println("O imóvel é usado");
            }
        }


    }
}