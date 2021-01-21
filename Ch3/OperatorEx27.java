class OperatorEx27 {
    public static void main(String args[]){
        int x = 10;
        int y = -10;

        int absX = (x >= 0) ? x : -x;
        int absY = (y >= 0) ? y : -y;

        System.out.println(absX);
        System.out.println(absY);
    }
}
