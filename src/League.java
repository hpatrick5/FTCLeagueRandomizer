
import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Hannah
 */
public class League implements Serializable{
    
    private String name;
    private ArrayList<Team> teams;

    public League(){
        this.name = "";
        this.teams = new ArrayList();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    
    public String toString(){
        String data = name + "\n";
        
        for(Team t : teams){
            data += "\t" + t.toString();
        }
        data += "\n";
        
        return data;
    }
    
}
