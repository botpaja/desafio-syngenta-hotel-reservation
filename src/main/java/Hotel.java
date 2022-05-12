
public class Hotel {
	
	private String nome;
	private Integer precoDiaSemanaRegular;
	private Integer precoFimDeSemanaRegular;
	private Integer precoDiaSemanaReward;
	private Integer precoFimDeSemanaReward;
	private int estrela;
	
	
	public Hotel(String nome, Integer precoDiaSemanaRegular, Integer precoFimDeSemanaRegular,
			Integer precoDiaSemanaReward, Integer precoFimDeSemanaReward, int estrela) {
		super();
		this.nome = nome;
		this.precoDiaSemanaRegular = precoDiaSemanaRegular;
		this.precoFimDeSemanaRegular = precoFimDeSemanaRegular;
		this.precoDiaSemanaReward = precoDiaSemanaReward;
		this.precoFimDeSemanaReward = precoFimDeSemanaReward;
		this.estrela = estrela;
	}


	public String getNome() {
		return nome;
	}


	public Integer getPrecoDiaSemanaRegular() {
		return precoDiaSemanaRegular;
	}


	public Integer getPrecoFimDeSemanaRegular() {
		return precoFimDeSemanaRegular;
	}


	public Integer getPrecoDiaSemanaReward() {
		return precoDiaSemanaReward;
	}


	public Integer getPrecoFimDeSemanaReward() {
		return precoFimDeSemanaReward;
	}


	public int getEstrela() {
		return estrela;
	}


}
