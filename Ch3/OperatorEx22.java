class OperatorEx22 {
    public static void main(String args[]){
        int temp; //계산 결과를 담기 위한 변수

        System.out.println(-8);
        System.out.println(Integer.toBinaryString(-8)); //2진수로 표현한 문자열 변환
        System.out.println();

        temp = -8 << 1;
        System.out.println("-8 << 1 = " + temp);
        System.out.println(Integer.toBinaryString(temp));
        System.out.println();

        temp = -8 << 2;
        System.out.println("-8 << 2 = " + temp);
        System.out.println(Integer.toBinaryString(temp));
        System.out.println();

        System.out.println(-8);
        System.out.println(Integer.toBinaryString(-8)); 
        System.out.println();

        temp = -8 >> 1;
        System.out.println("-8 >> 1 = " + temp);
        System.out.println(Integer.toBinaryString(temp));
        System.out.println();

        temp = -8 >> 2;
        System.out.println("-8 >> 2 = " + temp);
        System.out.println(Integer.toBinaryString(temp));
        System.out.println();

        System.out.println(-8);
        System.out.println(Integer.toBinaryString(-8)); 
        System.out.println();

        temp = -8 >>> 1;
        System.out.println("-8 >>> 1 = " + temp);
        System.out.println(Integer.toBinaryString(temp));
        System.out.println();

        temp = -8 >>> 2;
        System.out.println("-8 >>> 2 = " + temp);
        System.out.println(Integer.toBinaryString(temp));
        System.out.println();

    }
}
