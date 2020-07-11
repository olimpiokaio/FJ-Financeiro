package br.financeiro;

public class GerenciadorDeDividas {
	public void afetuaPagamento(Divida divida, String nomePagador, String cnpjPagador, double valor) {
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);
		
		divida.registra(pagamento);
	}
}
