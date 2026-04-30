public class Example {
    public static void main (String[] args){
        int a =10;
        int b = 0;
        try{
            int result = a/b;
            System.out.println(result);
            System.out.println("end of program");
        }
        catch(ArithmeticException e){
            System.out.println("Print by Exception");
        }
        finally{
            System.out.println("Done Complete");
        }

    }
}
  