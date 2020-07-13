package br.financeiro;

public class Divida {
	private double total;

	private String credor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();

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

	public Documento getDocumentoCredor() {
		return this.documentoCredor;
	}

	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}

}
