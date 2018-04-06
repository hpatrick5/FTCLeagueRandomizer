
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hannah
 */
public class Model implements Serializable{
  private TreeMap<Integer, Team> teams;
  private ArrayList<League> leagues;
  
  public  Model(){
      teams = new TreeMap();
      leagues = new ArrayList();
  }
  
  public TreeMap<Integer, Team> getTeams() {
        return teams;
    }

    public void setTeams(TreeMap<Integer, Team> teams) {
        this.teams = teams;
    }

    public ArrayList<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(ArrayList<League> leagues) {
        this.leagues = leagues;
    }
}
