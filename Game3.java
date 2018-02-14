package eecs1022.eecslab3;

/**
 * Created by user on 2/13/18.
 */
public class Game3
{
  String p1;
   String p2;

     String p31;
     String p32;
    public Game3(String p1, String p2,String p31,String p32){
        this.p1=p1;
        this.p2=p2;
        this.p31=p31;
        this.p32=p32;
    }
    public String toString(){
        String s = "Round 3 Finished," ;
        s += "\n";
        if(p31 == p32){
            s += "Tie between" + p1 + "and" +p2;



        }
        if (p31 == "Paper" && p32 == "Scissors"){
            s += "Winner is "+ p2;

        }
        if (p31 == "Paper" && p32 == "Rock"){
            s += "Winner is "+ p31;

        }
        if (p31 == "Rock" && p32 == "Scissors"){
            s += "Winner is "+ p1;

        }
        if (p31 == "Rock" && p32 == "Paper"){
            s += "Winner is "+ p2;

        }
        if (p31 == "Scissors" && p32 == "Paper"){
            s += "Winner is "+ p1;

        }
        if (p31 == "Scissors" && p32 == "Rock"){
            s += "Winner is "+ p2;

        }
        s += "Game is over.";

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

    public void setP31(String p31)
    {
        this.p31 = p31;
    }

    public void setP32(String p32)
    {
        this.p32 = p32;
    }
}
