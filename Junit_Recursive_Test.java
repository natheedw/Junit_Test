package c2a3q3_2022_EthanEdwards;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

class c2a3q4_2022_EthanEdwards extends ArraySum {

	@Test
	void testarrayone() {    // Junit test for array of one element
		int [] a = {10}; // original array	
		int [] b = {0}; // expected output
		FindSum (a, 0, a.length, 0); // calling findsum on the original array
		
		Assert.assertArrayEquals(a, b);  // checking if the original array after it has been modified matches the expected output
	}
	
	@Test
	void testarraytwo() {
		int [] a = {10, 12}; // original array
		int [] b = {12, 12}; // expected output
		FindSum (a, 0, a.length, 0); // calling findsum on the original array
		
		Assert.assertArrayEquals(a,b); // checking if the original array after it has been modified matches the expected output
	}
	
	
	void testarraythree() {
		int [] a = {10, 12, 14}; // original array
		int [] b = {26, 12, 22}; // expected output
		FindSum (a, 0, a.length, 0); // calling findsum on the original array
		
		Assert.assertArrayEquals(a,b); // checking if the original array after it has been modified matches the expected output
	}
		
		
	
	
	void testarrayseven () {
		
		int [] a = {10, 12, 14, 16, 18, 20, 22}; // original array 
		int [] b = {102, 12, 100, 16, 94, 20, 90}; // expected output
		FindSum (a, 0, a.length, 0); // calling findsum on the original array
		 
		 Assert.assertArrayEquals(a,b); // checking if the original array after it has been modified matches the expected output
	
	}

}
