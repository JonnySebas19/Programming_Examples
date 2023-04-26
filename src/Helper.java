public class Helper {
    public static void main(String args){


    }
    public static double foo(double x, double y){
        return x+y;
    }

    public static boolean isSymmetrical(int[] data){
        if (data == null || data.length == 0 || data.length == 1){
            return true;
        }

        for (int i = 0; i < data.length / 2; i++){
            if (data[i] != data[data.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
