package com.careerit.iplstats.controller;

import com.careerit.iplstats.domain.Team;
import com.careerit.iplstats.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/v1/team/")
public class TeamController {

        @Autowired
        private TeamService teamService;

        @PostMapping
        public ResponseEntity<Team> addTeam(@RequestBody Team team){
            team=teamService.addTeam(team);
            return ResponseEntity.ok(team);
        }
        @PostMapping("/addall")
        public ResponseEntity<List<Team>> addTeams(@RequestBody List<Team> teams){
            teams=teamService.addTeams(teams);
            return ResponseEntity.ok(teams);
        }


        @GetMapping
        public ResponseEntity<List<Team>> getTeams(){
            List<Team>  teamList = teamService.getTeams();
            return ResponseEntity.ok(teamList);
        }
        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteTeam(@PathVariable("id") Long id){
            boolean status=teamService.deleteTeamById(id);
            String message = "";
            if(status){
                message = String.format("Team with id %s is deleted",id);
                return  ResponseEntity.ok(message);
            }else{
                message = String.format("Team with id %s was not able delete",id);
                return ResponseEntity.badRequest().body(message);
            }
        }
        @GetMapping("/{id}")
        public ResponseEntity<Team> getTeamById(@PathVariable("id") Long id){
            Team team=teamService.getTeamById(id);
            return  ResponseEntity.ok(team);
        }

        @PutMapping
        public ResponseEntity<Team> updateTeam(@RequestBody Team team){
            team=teamService.updateTeam(team);
            return ResponseEntity.ok(team);
        }
        @GetMapping("/search")
        public ResponseEntity<List<Team>> search(@RequestParam("str")String str, HttpServletRequest request){
            String apiKey=request.getHeader("api-key");
            List<Team>  teamList = teamService.search(str);
            return ResponseEntity.ok(teamList);
        }



}
