package beans;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity
@javax.persistence.Table(name = "T_LIVRE")
public class LivreBean {
	@Id
	private int id;
	@Column
	private String titre;
	@Column
	private AuteurBean auteurBean;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_auteur", referencedColumnName = "id")
	public AuteurBean getAuteurBean() {
		return auteurBean;
	}

	public void setAuteurBean(AuteurBean auteurBean) {
		this.auteurBean = auteurBean;
	}
}
