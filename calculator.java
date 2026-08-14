public class calculator {

    void add()
    {
        int a =10;
        int b =20;
        System.out.println(a + b);
    }

    void subtract(){
        int a = 20;
        int b = 10;
        System.out.println(a - b);
    }
    public static void main(String[] args) {
        calculator c1 = new calculator();
       c1.add();
       c1.subtract();
        
    }   // this is a program of add & subtract 2 number
    //using class object and method
    

}