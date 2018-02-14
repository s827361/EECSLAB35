package eecs1022.eecslab3;

/**
 * Created by user on 2/13/18.
 */
public class Game2

{
 String p1;
   String p2;

  String p21;
    String p22;
    public Game2(String p1, String p2, String p21,String p22){
        this.p1=p1;
        this.p2=p2;
        this.p21=p21;
        this.p22=p22;
    }
    public String toString(){
        String s = "Round 2 Finished," ;
            s += "\n";
        if(p21 == p22){
            s += "Tie between" + p1 + "and" +p2;



        }
        if (p21 == "Paper" && p22 == "Scissors"){
             s += "Winner is "+ p2;

        }
        if (p21 == "Paper" && p22 == "Rock"){
            s += "Winner is "+ p1;

        }
        if (p21 == "Rock" && p22 == "Scissors"){
            s += "Winner is "+ p1;

        }
        if (p21 == "Rock" && p22 == "Paper"){
            s += "Winner is "+ p2;

        }
        if (p21 == "Scissors" && p22 == "Paper"){
            s += "Winner is "+ p1;

        }
        if (p21 == "Scissors" && p22 == "Rock"){
            s += "Winner is "+ p2;

        }

        return s;
    }

    public void setP1(String p1)
    {
        this.p1 = p1;
    }

    public void setP2(String p2)
    {
        this.p2 = p2;
    }

    public void setP21(String p21)
    {
        this.p21 = p21;
    }

    public void setP22(String p22)
    {
        this.p22 = p22;
    }
}
