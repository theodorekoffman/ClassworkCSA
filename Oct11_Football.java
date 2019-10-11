
/**
 * Write a description of class Oct11_Fantasy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Oct11_Football
{
    //instance variables are the adj. to describe ur object
    private String playerName;
    private String teamName;
    private int jerseyNumber;
    private Boolean quarterBack;
    
    
    //constructor def
    public  Oct11_Football(String name, String team, int num, Boolean qb)
    {
    playerName = name; 
    teamName = team;
    jerseyNumber = num; 
    quarterBack = qb; 

}
   //muataor methos for changing private data
 public void setName(String p)
 {
     playerName = p;
     
    }
  //acccesor methos to accesing the private data
  public String getName(String n)
  {
      return playerName;
}

 public void setTeam(String t)
 {
     playerName = t;
     
    }
  //acccesor methos to accesing the private data
  public String getTeam(String t)
  {
      return teamName;
}

public void setNum(int number)
 {
     jerseyNumber = number;
     
    }
  //acccesor methos to accesing the private data
  public int getNum(int number)
  {
      return jerseyNumber;
}

public void setQB(Boolean q)
 {
     quarterBack = q;
     
    }
  //acccesor methos to accesing the private data
  public Boolean getQB(Boolean q)
  {
      return quarterBack;
}

}
