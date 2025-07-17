
public class ex {
     public static void check(int age) throws Exception{
        if(age<18){
            throw new Exception("age must be above 18");
        }
        System.out.println("access Granted");

    }   
     public static void main(String[] args){
        try{
            check(65
            
            
            
            
            
            );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
