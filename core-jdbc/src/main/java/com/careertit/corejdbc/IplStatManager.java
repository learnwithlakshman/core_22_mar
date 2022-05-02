package com.careertit.corejdbc;

import java.util.List;

import com.careertit.corejdbc.model.Player;
import com.careertit.corejdbc.model.Role;
import com.careertit.corejdbc.service.IplStatService;
import com.careertit.corejdbc.service.IplStatServiceImpl;
import com.careertit.corejdbc.util.DBInit;

public class IplStatManager {
	
		
	
		public static void main(String[] args) {
			
			
//			DBInit.util.init();
//			IplStatService iplStatService = new IplStatServiceImpl();
//			
//			List<Player> playerList = iplStatService.getPlayerOf("CKS");

			
			for(Role role:Role.values()) {
				System.out.println(role);
			}
			
		}
}
