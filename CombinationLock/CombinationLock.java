public class CombinationLock
{
    private String combo;
    public CombinationLock(String c){
        c.toLowerCase();
        if(c.length() == 4){
            combo = c;
        }
        else if(c.length() > 4){
            combo = c.substring(0, 5);
        }
        else{
            while(c.length() != 4){
                c += "a";
            }
            combo = c;
        }
    }
    public String getClue(String s){
        String clue = "";
        s.toLowerCase();
        if(s.length() == 4){
            s = s;
        }
        else if(s.length() > 4){
            s = s.substring(0, 5);
        }
        else{
            while(s.length() != 4){
                s += "a";
            }
            s = s;
        }
        for(int i = 0; i < 4; i++){
            if(s.substring(i, i + 1).equals(combo.substring(i, i + 1))){
                clue += combo.substring(i, i + 1);
            }

            else if(combo.indexOf(s.substring(i, i + 1)) >= 0){
                clue += "+";
            }
            else{
                clue += "*";
            }
        }
        return clue;
    }
}

