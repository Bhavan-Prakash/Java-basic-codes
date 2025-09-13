class employee{
    public void emp(){
        System.out.println("employee method");
    }
}

class manager extends employee{
    public void man(){
        System.out.println("manager method");
    }
}


class developer extends manager{
    public void dev(){
        System.out.println("developer method");
    }
}


public class Q9 extends manager{
    public static void main(String[] args) {

    }
}



