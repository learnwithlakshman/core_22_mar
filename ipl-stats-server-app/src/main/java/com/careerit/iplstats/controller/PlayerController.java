package com.careerit.iplstats.controller;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.PlayerDto;
import com.careerit.iplstats.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/player/")
public class PlayerController {

        @Autowired
        private PlayerService playerService;
        @PostMapping("/addone")
        public ResponseEntity<PlayerDto> addPlayer(@RequestBody PlayerDto playerDto){
                playerDto=playerService.addPlayer(playerDto);
                return ResponseEntity.ok(playerDto);
        }

}
