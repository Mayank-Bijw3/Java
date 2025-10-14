class typeCasting{

    public static void main(String args[]){

        
        byte b = 127;
        //implicit casting
        int i = b;

        System.out.println(i);


        int a =257;
        //explicit casting
        byte c = (byte) a;   // 256(max limit) % 257(a)
        // byte c = a;  error

        System.out.println(c);


        // type promotion

        byte k1=10;
        byte k2=30;

        int res=k1*k2;   // 300 will out of range of byte so it get promoted to int

        System.out.println(res);
    }
}