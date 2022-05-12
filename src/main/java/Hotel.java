
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


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getPrecoDiaSemanaRegular() {
		return precoDiaSemanaRegular;
	}


	public void setPrecoDiaSemanaRegular(Integer precoDiaSemanaRegular) {
		this.precoDiaSemanaRegular = precoDiaSemanaRegular;
	}


	public Integer getPrecoFimDeSemanaRegular() {
		return precoFimDeSemanaRegular;
	}


	public void setPrecoFimDeSemanaRegular(Integer precoFimDeSemanaRegular) {
		this.precoFimDeSemanaRegular = precoFimDeSemanaRegular;
	}


	public Integer getPrecoDiaSemanaReward() {
		return precoDiaSemanaReward;
	}


	public void setPrecoDiaSemanaReward(Integer precoDiaSemanaReward) {
		this.precoDiaSemanaReward = precoDiaSemanaReward;
	}


	public Integer getPrecoFimDeSemanaReward() {
		return precoFimDeSemanaReward;
	}


	public void setPrecoFimDeSemanaReward(Integer precoFimDeSemanaReward) {
		this.precoFimDeSemanaReward = precoFimDeSemanaReward;
	}


	public int getEstrela() {
		return estrela;
	}


	public void setEstrela(int estrela) {
		this.estrela = estrela;
	}
	
	
	
	

}
