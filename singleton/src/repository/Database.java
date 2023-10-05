package repository;

public class Database {
  private static Database database = null;
  private String connection;
  private Database(String connection){
    this.connection = connection;
  }
 public static Database getInstance(String connection){
    if(database == null){
      database = new Database(connection);
    }
    return database;
  }
   public String getConnection() {
    return connection;
  }
}
