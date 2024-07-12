import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws SmallIntegerException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Small Integer Tester");
        while (true) {
            try {
                System.out.print("Masukkan integer: ");
                int input = scanner.nextInt();
                if (input == -99) {
                    break;
                }

                if (input < 0 ) {
                    throw new SmallIntegerException("nilai lebih kecil dari 0");
                } else if (input > 9) {
                    throw new SmallIntegerException("nilai lebih besar dari 9");
                } else {
                    System.out.println("nilai benar");
                }
            } catch (SmallIntegerException e) {
                
            } catch (Exception e) {
                break;
            }
        }
        throw new SmallIntegerException("Input bukan bilangan bulat!");
    }   
}