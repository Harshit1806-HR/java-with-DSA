public class animal2 {
    int no_of_eyes;
    String color;

    public void details(String details){
        System.out.println("eyes:" + no_of_eyes);
        System.out.println("color:" + color);
    }

    public static void main(String[] args) {
        animal2 jumbo = new animal2();
        jumbo.no_of_eyes = 2;
        jumbo.color = "brown";
        jumbo.details ("jumbo");



    }
}
//this is also a part of C<O<M{class , object , method}