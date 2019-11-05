package com.developers.bountyhunter.model.world;

import com.developers.bountyhunter.model.base.IdentifiableEntity;
import com.developers.bountyhunter.model.contract.Contract;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class District extends IdentifiableEntity {

	private String name;

	@OneToMany(mappedBy = "district")
	private List<Contract> contracts;

	@ManyToOne()
	@JoinColumn(name = "planet_id", referencedColumnName = "id")
	private Planet planet;

}
