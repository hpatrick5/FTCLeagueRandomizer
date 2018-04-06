
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hannah
 */
public class Team implements Serializable{

   private int id;
   private String name;
   private String school;
   private int strength;
   private int league;
   
   public Team (int id, String name, String school, int strength){
       this.id = id;
       this.name = name;
       this.school = school;
       this.strength = strength;
       this.league = 0;
   }
   
   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLeague() {
        return league;
    }

    public void setLeague(int league) {
        this.league = league;
    }
    
    @Override
    public String toString(){
        String output = id + " " + school + " " + name + " L:" + league + " S:" + strength;
        return output;
    }
}
