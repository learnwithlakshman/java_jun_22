package com.careerit.cj.day16;

public class Player {
    
        private Long id;
        private String name;
        private String country;
        private String role;
        private String teamCode;
        private double amount;
             
        public Player(Long id, String name, String country, String role, String teamCode, double amount) {
            this.id = id;
            this.name = name;
            this.country = country;
            this.role = role;
            this.teamCode = teamCode;
            this.amount = amount;
        }
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
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        public String getTeamCode() {
            return teamCode;
        }
        public void setTeamCode(String teamCode) {
            this.teamCode = teamCode;
        }
        public double getAmount() {
            return amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }
        @Override
        public String toString() {
            return "Player [amount=" + amount + ", country=" + country + ", id=" + id + ", name=" + name + ", role="
                    + role + ", teamCode=" + teamCode + "]";
        }

        
}
