package com.careerit.cj.day16;

public class TeamAmount {
    
    private String teamCode;
    private String teamName;
    private double totalAmount;
    public TeamAmount(String teamCode, String teamName, double totalAmount) {
        this.teamCode = teamCode;
        this.teamName = teamName;
        this.totalAmount = totalAmount;
    }
    public String getTeamCode() {
        return teamCode;
    }
    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    @Override
    public String toString() {
        return "TeamAmount [teamCode=" + teamCode + ", teamName=" + teamName + ", totalAmount=" + totalAmount + "]";
    }

    
    
}
