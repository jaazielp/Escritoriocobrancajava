
public class AcordoDivida {
    private Divida divida;
    private FormaDePagamento formaDePagamento;
    private Double valorTotal;

    public AcordoDivida(Divida divida, FormaDePagamento formaDePagamento) {
        this.divida = divida; 
        this.setFormaDePagamento(formaDePagamento);
    }

    public Divida getDivida() {
        return divida;
    }

    private void setValorTotal () {
        this.formaDePagamento = formaDePagamento;
        if (this.formaDePagamento.equals(formaDePagamento.CREDIDO)){
            this.valorTotal = this.divida.getValorDivida() * (1+ 0.15);
        } else if (this.formaDePagamento.equals(formaDePagamento.BOLETO)){
            this.valorTotal = this.divida.getValorDivida() * (1+ 0.10);
        } else if (this.formaDePagamento.equals(formaDePagamento.DEBITO)){
            this.valorTotal = this.divida.getValorDivida() * (1+ 0.05);
        } else this.valorTotal = this.divida.getValorDivida() * (1+ 0.5);
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
        setValorTotal();
    }

    public Double getVslorTotal() {
        return valorTotal;
    }


    
    
}
