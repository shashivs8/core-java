class CitizenOfIndia{

	public static void showResponsibility(int age , char gender){
	int age = 25;
	char gender='f';
	System.out.println("Inside showResponsibility()");

	if(age >= 10 && age < 16){
	System.out.println("Responsibility is going to school");
	}
	if (age == 16){
	
		System.out.println("Responsibility is going to college");

	}
	
	if (age >= 21) {
			System.out.println("Responsibility is votting");
		if( gender == 'f'){
			System.out.println("Girl can legally Marry");
		}
		
		else {
			System.out.println("Boy cannot legally marry");
	}
	}
		System.out.println("Out of showResponsibility()");

	
	
	}


}