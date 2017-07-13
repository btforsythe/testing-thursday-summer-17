package virtualpet;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collections;
import java.util.Set;

import org.junit.Test;

public class StateVerificationVirtualPetShelterTest {

	@Test
	public void shouldBeEmptyWhenCreated() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		
		Set<VirtualPet> pets = underTest.getPets();
		
		assertThat(pets, is(empty()));
		assertEquals(Collections.emptySet(), pets);
	}
	
	@Test
	public void shouldIntakePet() {
		
		// arrange
		VirtualPet pet = new VirtualPet("hope");
		VirtualPetShelter underTest = new VirtualPetShelter();
		
		// act
		underTest.intake(pet);
		
		// assert
		Set<VirtualPet> pets = underTest.getPets();
		assertThat(pets, contains(pet));
	}
}
