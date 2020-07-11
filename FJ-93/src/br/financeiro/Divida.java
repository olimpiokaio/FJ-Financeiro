package br.financeiro;

public class Divida {
	private double total;
	
	private String credor;
	private Cnpj CnpjCredor = new Cnpj();
	private Pagamentos pagamentos = new Pagamentos();

	public Cnpj getCnpjCredor() {
		return CnpjCredor;
	}

	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void setValorPago(double total) {
		this.total = total;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}

	public double getValorDivida() {
		return pagamentos.getValorPago();
	}

}
