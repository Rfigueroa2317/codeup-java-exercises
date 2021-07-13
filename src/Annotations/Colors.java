package Annotations;


class Red {
    public void show(){
        System.out.println("I am red");
    }


}

class Orange extends Red {
    @Override // comments for the compiler // it checks to see if that
    // comment is doing what it's supposed to do
    public void show(){
        System.out.println("I am orange");
    }
}

public class Colors {
    public static void main(String[] args) {
        Red redobj = new Red();
        Orange orangeobj = new Orange();
        redobj.show();      // I am red
        orangeobj.show();   // I am orange
    }
}

//@Deprecated
//usually above methods