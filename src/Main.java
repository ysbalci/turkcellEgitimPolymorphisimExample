import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       //Compile time polymorphism
        DbConnection dbConnection = new OracleDbConnection();
        dbConnection.openConnection();
        dbConnection.executeQuery("Select * from Product");
        dbConnection.closeConnection();


        //Runtime Polymorphism
        Scanner scanner = new Scanner(System.in);
        System.out.println("Database tipini seçininz [1 (MsSQL), 2 (MySQL), 3 (Oracle)] ");
        int dbType = scanner.nextInt();
        DbConnection dbConnection1=null;
        switch (dbType){
            case 1:
                dbConnection1=new MsSQLConnection();
                break;
            case 2:
                dbConnection1=new MySQLConnection();
                break;
            case 3:
                dbConnection1=new OracleDbConnection();
                break;
            default:
                System.out.println("Hatalı seçim yaptınız");
                break;
        }
        if (dbConnection1 != null) {
            dbConnection1.openConnection();
            dbConnection1.executeQuery("Select * from Product");
            dbConnection1.closeConnection();
        }


    }
}