<<<<<<< HEAD
package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;


public class SoldierRepoImpl implements SoldierRepo {

	
	public  SoldierRepoImpl() {
		System.out.println("Creating SoldierRepoImpl using No-Arg Constructur");
	}
	
	@Override
	public boolean save(SoldierDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

}
=======
package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;


public class SoldierRepoImpl implements SoldierRepo {

	
	public  SoldierRepoImpl() {
		System.out.println("Creating SoldierRepoImpl using No-Arg Constructur");
	}
	
	@Override
	public boolean save(SoldierDTO dto) {
System.out.println("dto : " + dto);
		return false;
	}

}
>>>>>>> 6a5ff40 (commiting spring management)
