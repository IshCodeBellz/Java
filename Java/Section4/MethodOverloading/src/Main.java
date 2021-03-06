public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double  centimeters = calcFeetAndInchesToCentimeters(6,0);
        if (centimeters < 0.0){
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player" + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >=0 && (inches >=0 && inches <=12)){
            double feetConv = feet * 12 * 2.54;
            double inchesConv = inches * 2.54;
            double cmTotal = feetConv + inchesConv;
            System.out.println(feet + " feet " + inches + " inches = " + cmTotal + " cm");
            return cmTotal;
        }
        System.out.println("Invalid Parameters, please put correct feet or inches");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        return -1;
    }
}