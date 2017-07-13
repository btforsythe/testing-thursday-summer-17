package virtualpet;

import java.util.HashSet;
import java.util.Set;

public class VirtualPetShelter {

	private Set<VirtualPet> pets = new HashSet<>();

	public VirtualPetShelter() {
	}
	
	/**
	 * For testing
	 */
	VirtualPetShelter(Set<VirtualPet> pets) {
		this.pets = pets;
	}

	public void intake(VirtualPet pet) {
		pets.add(pet);
	}

	public Set<VirtualPet> getPets() {
		return pets;
	}

}
