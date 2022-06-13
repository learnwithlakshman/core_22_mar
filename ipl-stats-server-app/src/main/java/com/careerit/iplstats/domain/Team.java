package com.careerit.iplstats.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Team{
	
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String teamCode;
     private String teamName;
     @OneToMany(mappedBy = "team",orphanRemoval = true)
     private List<Player> playerList = new ArrayList<>();

     public void addPlayer(Player player){
         this.playerList.add(player);
         player.setTeam(this);
     }
     public void removePlayer(Player player){
         this.playerList.remove(player);
         player.setTeam(null);
     }
}