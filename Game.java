package eecs1022.eecslab3;

/**
 * Created by user on 2/13/18.
 */
public class Game
{
     String p1;
    String p2;
     String p11;
    String p12;


    public Game (String p1, String p2, String p11, String p12){

        this.p1=p1;
        this.p2=p2;
        this.p11=p11;
        this.p12=p12;

    }







    public String toString(){

        String s = "Round 1 Finished," ;
        s += "\n";
        if(p11 == p12){
            s += "Tie between" + p1 + "and" +p2;



        }
        if (p11 == "Paper" && p12 == "Scissors"){
            s += "Winner is "+ p2;

        }
        if (p11 == "Paper" && p12 == "Rock"){
            s += "Winner is "+ p1;

        }
        if (p11 == "Rock" && p12 == "Scissors"){
            s += "Winner is "+ p1;

        }
        if (p11 == "Rock" && p12 == "Paper"){
            s += "Winner is "+ p2;

        }
        if (p11 == "Scissors" && p12 == "Paper"){
            s += "Winner is "+ p1;

        }
        if (p11 == "Scissors" && p12 == "Rock"){
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

    public void setP11(String p11)
    {
        this.p11 = p11;
    }

    public void setP12(String p12)
    {
        this.p12 = p12;
    }
}
