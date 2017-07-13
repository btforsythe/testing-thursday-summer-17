package virtualpet;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class VirtualPetShelterTest {
	
	private VirtualPet pet = new VirtualPet("hope");
	
	@InjectMocks
	private VirtualPetShelter underTest;

	@Mock
	private Set<VirtualPet> pets;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldIntakePet() {
		
		// act
		underTest.intake(pet);
		
		// assert (behavior)
		Mockito.verify(pets).add(pet);
		
		System.out.println("Size of pets: " + pets.size());
		System.out.println("Is empty? " + pets.isEmpty());
	}
}
