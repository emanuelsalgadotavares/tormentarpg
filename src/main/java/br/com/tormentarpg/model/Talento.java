package br.com.tormentarpg.model;

/*import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

public class Talento {
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")*/
	private Long id;

	/*@Column(name = "nome")*/
	private String nome;

	/*@Column(name = "descricao")*/
	private String descricao;

	/*@Column(name = "prerequisito")*/
	private String preRequisito;

	/*@Column(name = "beneficio")*/
	private String beneficio;

	/*@Column(name = "observacao")*/
	private String observacao;

	/*@Column(name = "tipomagia")*/
	private String tipoMagia;

	/*@Column(name = "custo")*/
	private String custo;

	/*@Column(name = "tipotalento")*/
	private String tipoTalento;

	/*@Column(name = "manual")*/
	private String manual;
	
	/* GET & SET */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPreRequisito() {
		return preRequisito;
	}
	public void setPreRequisito(String preRequisito) {
		this.preRequisito = preRequisito;
	}
	public String getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getTipoMagia() {
		return tipoMagia;
	}
	public void setTipoMagia(String tipoMagia) {
		this.tipoMagia = tipoMagia;
	}
	public String getCusto() {
		return custo;
	}
	public void setCusto(String custo) {
		this.custo = custo;
	}
	public String getTipoTalento() {
		return tipoTalento;
	}
	public void setTipoTalento(String tipoTalento) {
		this.tipoTalento = tipoTalento;
	}
	public String getManual() {
		return manual;
	}
	public void setManual(String manual) {
		this.manual = manual;
	}

}
