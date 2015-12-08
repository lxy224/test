
public class Service {
	/*public static void main(String args[]){
		 String sql ="insert into test.user (username,password) values ('11','11')";  
  	   Jdbc.update(sql);
	}*/
	
      public static void insert(String name,String password){
    	  System.out.println(name+"　"+password); 
    	  String sql ="insert into test.user (username,password) values ('11','11')";  
    	  System.out.println(name+"　"+password); 
    	   Jdbc.update(sql);
    	 //  System.out.println("dddd");
       }
}
