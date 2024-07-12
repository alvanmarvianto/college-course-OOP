public class SmallIntegerException extends Exception{
    private static int total_exception;
    
    public SmallIntegerException(String msg ){
        System.out.println(msg);
        total_exception++;
       print();
    }

    public static int getTotalException() {
        return total_exception;
    }
    
    public void print(){
        System.out.println("jumlah small int exception: " + getTotalException());
    }
}
