package com.careerit.cj.day16;

import java.util.ArrayList;
import java.util.List;

public class Team{

        private Long id;
        private String name;
        private String code;

        
        public Team(Long id, String name, String code) {
            this.id = id;
            this.name = name;
            this.code = code;
        }
        private List<Player> players = new ArrayList<>();

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }

        public void addPlayer(Player player){
            this.players.add(player);
        }
        public void addPlayers(List<Player> playerList){
            this.players.addAll(playerList);
        }
        public List<Player> getPlayers(){
            return players;
        }
        @Override
        public String toString() {
            return "Team [code=" + code + ", id=" + id + ", name=" + name + ", players=" + players + "]";
        }
        
}