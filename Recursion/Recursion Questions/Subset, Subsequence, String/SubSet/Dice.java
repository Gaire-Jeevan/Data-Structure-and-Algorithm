import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 6);

        System.out.println("\n\nDice return " + diceReturn("", 4));

        System.out.print("\nDice Face:- " );
        diceFace("", 4, 7);

        System.out.println("\n\nDice face return:- " + diceFaceReturn("", 4, 7));
    }

    static void dice(String p, int target) {
        if(target == 0) {
            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    
    // diceFace
    static void diceFace(String p, int target, int face) {
        if(target == 0) {
            System.out.print(p + " ");
            return;
        }
    
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }

    
    // function returning ArrayList
    static ArrayList<String> diceReturn(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 1; i <= 6 && i <= target; i++) {
            
            list.addAll(diceReturn(p + i, target - i));
        }
        return list;
    }

    // dice face Return
    static ArrayList<String> diceFaceReturn(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 1; i <= face && i <= target; i++) {
            
            list.addAll(diceFaceReturn(p + i, target - i, face));
        }
        return list;
    }

}
