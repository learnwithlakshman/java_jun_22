package com.careerit.ipl.stats.service.exception;

public class TeamNotFoundException extends  RuntimeException{

        public TeamNotFoundException(){
                super("Team details is not found, please check team label");
        }
        public TeamNotFoundException(String message){
                super(message);
        }

}
