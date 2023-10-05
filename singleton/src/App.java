import repository.Database;

public class App {
    public static void main(String[] args) throws Exception {
       Database database = Database.getInstance("any_connection");
       System.out.println(database.getConnection()); 
    }
}
