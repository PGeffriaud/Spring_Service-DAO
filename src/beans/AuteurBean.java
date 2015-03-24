package beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;

@javax.persistence.Entity
@javax.persistence.Table(name = "T_AUTEUR")
public class AuteurBean {
	private Set<LivreBean> livres = new HashSet<LivreBean>();

	@OneToMany(mappedBy = "auteurBean", targetEntity = LivreBean.class)
	public Set<LivreBean> getLivres() {
		return livres;
	}

	public void setLivres(Set<LivreBean> details) {
		this.livres = details;
	}
}
