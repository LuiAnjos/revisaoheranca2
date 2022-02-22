public class Principal {
    public static void main (String [] args){

        Imovel i = new Imovel();
        Novo n = new Novo();
        Velho v = new Velho();

        i.setEndereco("Castelo Branco, 666");
        i.setPreco(100000);

        n.setAdicional(i.getPreco() + 10000);
        v.setDesconto(i.getPreco() - 5000);
       
        System.out.println("Endereço: " + i.getEndereco());
        System.out.println("Preço: " + i.getPreco());
        System.out.println("Preço adicional: " + n.getAdicional());
        System.out.println("Preço com desconto: " + v.getDesconto());
    }
    
}
