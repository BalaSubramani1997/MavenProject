import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;


@SpringBootApplication
//@PropertySource({"classpath:/com/your/path/app.properties"})
public class Success extends Exception{

    @Autowired
    Environment env;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        Environment env = (Environment) context.getEnvironment();
        int bala = 7;
        try {
            if (bala <= 10) {
                throw new Exception("New_Exception_Created");
            }else{
                try{
                    if(bala == 15){
                        throw new Exception("Exception2");
                    }else{
                        try{
                            if(bala == 17){
                                throw new Exception("Exception3");
                            }else{
                                System.out.println("Successful");
                            }
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        catch(Exception e){

//            System.out.println(messageSource.getMessage("New_Exception_Created",null,Locale.ENGLISH));
            System.out.println(env.getProperty("New_Exception_Created"));
//            printProperty();
            System.out.println(e.getMessage());
        }
    }
//    public void printProperty(){
//        System.out.println(env.getProperty("New_Exception_Created"));
//    }

}
