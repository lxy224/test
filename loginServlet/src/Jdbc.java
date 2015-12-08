//package haomei.data;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
	public static Connection conn;
	static Statement st; 
	public synchronized static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection(
//					"jdbc:mysql://10.82.58.116:3306", "admin", "15243");
//			服务器数据库
//			con = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306","root","root");
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306","root","root");
//			本地数据库
			
		} catch (Exception e) {
			System.out.println("connect failed" + e.getMessage());
		}
		return con; 
		
	}
	
	public static void insert(String sql) {  
        
        conn = getConnection(); 
  
        try {  
            st = (Statement) conn.createStatement();    
              
            int count = st.executeUpdate(sql);    
              
            System.out.println("inserted " + count + "things");
              
            conn.close();
        } catch (Exception e) {  
            System.out.println("insert failed" + e.getMessage());  
        }  
    }  
      
   
    public static int update(String sql) {  
        conn = getConnection();
        try {    
            st = (Statement) conn.createStatement(); 
            int count = st.executeUpdate(sql); 
            conn.close();
            
            return count;
              
        } catch (Exception e) {  
            System.out.println("update failed" + e.getMessage());  
        }
		return 0;  
    }  
  
   
    public static ResultSet query(String sql) {  
        conn = getConnection();
        ResultSet rs = null;
        try {         
            st = (Statement) conn.createStatement(); 
            rs = st.executeQuery(sql);
//            conn.close();
        } catch (Exception e) {  
            System.out.println("query error" + e.getMessage());  
        }  
        return rs;
    }    
    public static void delete(String sql) {  
  
        conn = getConnection();
        try {    
            st = (Statement) conn.createStatement();  
              
            int count = st.executeUpdate(sql);  
              
            System.out.println("deleted " + count + "things");  
              
            conn.close();  
        } catch (Exception e) {  
            System.out.println("delete failed" + e.getMessage());  
        }  
          
    }  
	
	
	
}
