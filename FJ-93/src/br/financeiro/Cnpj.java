package br.financeiro;

public class Cnpj {
	
	private String valor;
	
	public String getValor() {
		return valor;
	}

	public void setValor(String novoValor) {
		this.valor = novoValor;
	}
	
	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	private int primeiroDigitoCorreto() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo cnpj
		return 2;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo cnpj
		return 2;
	}

	private int segundoDigitoCorreto() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
		return 2;
	}

	private int segundoDigitoVerificador() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
		return 2;
	}

}
