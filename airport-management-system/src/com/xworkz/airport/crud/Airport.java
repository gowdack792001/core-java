package com.xworkz.airport.crud;

import com.xworkz.airport.dto.TerminalDTO;

public interface Airport {
	

	     boolean createTerminal(TerminalDTO terminal);
		 void getTerminalDetails();
		 boolean updateLoadingBridgeById(int id, int noOfLoadingBridges);
		 boolean updateNoOfCheckInCoountersByName(String name, int noOfCheckIncounters);
		 boolean deleteTerminalsByName(String name);
		 boolean deleteTerminalsById(int id);
		 String[] getAllTerminalName();
		 String getTerminalNameById(int id);
		 
	    



	}


