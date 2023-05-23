package demo6;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 2;
            if (y<5){
                throw new Exception("Không đúng giá trị");//chủ động phát ra ngoại lệ (tạo ra ngoại lê)
            }
            int z = x / y;
            System.out.println("z="+z);
            demoException();
        }catch (ArithmeticException e){
            System.out.println("Ari:"+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Except: "+e.getMessage());
        }finally {

        }
        System.out.println("Done");

    }
    public static void demoException() throws Exception{
        
    }
}
