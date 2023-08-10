public class App {
    public static void main(String[] args) throws Exception {

        PessoaJuridica lojaDoBairro = new PessoaJuridica();
        lojaDoBairro.setNome("Loja do Bairro");
        lojaDoBairro.setCnpj("89.916.287/0001-08");
    
        PessoaFisica joao = new PessoaFisica();
        joao.setNome("João");
        joao.setCpf("548.849.760-96");
        joao.setDataNascimento("15/11/1999");

        Divida divida = new Divida(joao, lojaDoBairro, 1000.00);
        
        AcordoDivida AcordoDivida = new AcordoDivida(divida, FormaDePagamento.BOLETO);

        System.out.println("---- Dados do Devedor ----");
        System.out.println("Nome:"+AcordoDivida.getDivida().getDevedora().getNome());
        System.out.println("Data de Nascimento:"+AcordoDivida.getDivida().getDevedora().getDataFormada());
        System.out.println("Doumento:"+AcordoDivida.getDivida().getDevedora().getDocumento());
        System.out.println("----- Dados do Cobrador -----");
        System.out.println("Nome:"+AcordoDivida.getDivida().getCobradora().getNome());
        System.out.println("Documento:"+AcordoDivida.getDivida().getCobradora().getDocumento());

        System.out.println("Valor da Divida:"+AcordoDivida.getDivida().getValorDivida());
        System.out.println("Formas de Pagamento:"+AcordoDivida.getFormaDePagamento().name());
        System.out.println("Valor Total:"+AcordoDivida.getVslorTotal());



    }
}
