public class OracleDbConnection extends DbConnection{
    public void openConnection(){
        System.out.println("Oracle bağlantısı açıldı");
    }
    public void closeConnection(){
        System.out.println("Oracle bağlantısı açıldı");
    }
    public void executeQuery(String sql){
        System.out.println("Sql sorgusu çalıştırıldı: " +sql);
    }
}
