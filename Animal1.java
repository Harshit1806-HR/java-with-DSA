public class Animal1 {
    public void run(String name,int distance_km)
    {
        System.out.println(name+" run " +distance_km + "km");  
    }

    public static void main(String[] args) 
    {
        Animal1 jumbo = new Animal1();
        jumbo.run("jumbo" , 7);
        jumbo.eat("jumbo" , "grass");

        Animal1 tiger = new Animal1();
        tiger.run("tiger",12);
        tiger.eat("tiger" ,"meat");

    }
    public void eat(String name , String dish)
    {
        System.out.println(name+" is eating " + dish  );
    }
}

 //this is a code of class and object and methods.