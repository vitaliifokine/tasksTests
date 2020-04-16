package sample;

class Init {
    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public Init(){
        System.out.println("3");
    }
}
