public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){

//        int bigCountInt = Integer.parseInt(bigCount);
//        int smallCountInt = Integer.parseInt(smallCount);

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int sum = (bigCount * 5) + smallCount;

        if (sum >= goal && smallCount >= goal % 5){
            return true;

        }else {
            return false;
        }

    }
}
