package package1;

// ".*" means import everything from that package.
import package2.*;

public class A {
    
    //PUBLIC variables/methods are available to all classes within the same project.
   public String  publicStr = "This is public";


   //DEFAULT variables/methods are available to all classes within the same package.
   String defaultStr = "This is default";

   //PROTECTED variables/methods are available to all sub-classes.
   protected String protectedStr= "Class is protected";

    //PRIVATE variables/methods are available to the class itself.
    private String privatedStr = "This is private";
}
