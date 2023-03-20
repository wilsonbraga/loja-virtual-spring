package wilson.braga.lojavirtual.enums;

public enum TipoEndereco {
	
	COBRNCA("Cobrança"),
	ENTREGA("Entrega");
	
	private String descricao;

	TipoEndereco(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
	
}
