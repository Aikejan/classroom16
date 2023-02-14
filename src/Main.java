public class Main {
    public static void main(String[] args) {
       Person [] people =  {new Programmer(),
                           new Danser(),
                           new Singer()};
       for(Person a: people){
          a.walk();
       }
    }
}