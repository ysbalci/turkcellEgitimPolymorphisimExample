public class MySQLConnection extends DbConnection{
    public void openConnection(){
        System.out.println("MySQL bağlantısı açıldı");
    }
    public void closeConnection(){
        System.out.println("MySQL bağlantısı açıldı");
    }
    public void executeQuery(String sql){
        System.out.println("Sql sorgusu çalıştırıldı: " +sql);
    }
}
