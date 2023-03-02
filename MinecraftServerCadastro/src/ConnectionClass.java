import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectionClass {
	String retorno;
	List<String> RetornarLista;
	
	    String nome = "";
	    String cpf = "";
	    String telefone = "";
	    String cidade = "";
	    String uf = "";
	    String email = "";
	    
	    static String connectionUrl = "jdbc:sqlserver://NOME DO SERVIDOR:1433;encrypt=true;trustServerCertificate=true;;databaseName=db_8;user=USUARIO;password=SENHA";;
	    static Connection conexao = null;
		static Statement statement = null;
		
//	    public static void Conexao() {
//	    	
//
//	    }
		
	public static void CInsert(String insert) throws SQLException {
		
		

         conexao = DriverManager.getConnection(connectionUrl);
       
			statement = conexao.createStatement();

			statement.executeUpdate(insert);
		
		conexao.close();
}
	
	public List<String> SelectMethod(String selecao) throws SQLException{
		

         conexao = DriverManager.getConnection(connectionUrl);
       
			statement = conexao.createStatement();

			ResultSet result = statement.executeQuery(selecao);

			while (result.next()){
			    nome = result.getString(1);
			    cpf = result.getString(2);
			    telefone = result.getString(3);
			     cidade = result.getString(4);
			     uf = result.getString(5);
			     email = result.getString(6);
			}
		conexao.close();
		//List<String> RetornarLista = new ArrayList<>();
		List<String> RetornarLista = Arrays.asList(nome, cpf, telefone, cidade, uf, email);
		  //retorno = nome + "  " + cpf + "  " + telefone + "  " + cidade + "  " + uf + "  " + email;
		return RetornarLista;
	}
	
	public static void CDelete(String delete) throws SQLException {


         conexao = DriverManager.getConnection(connectionUrl);
       
			statement = conexao.createStatement();

			statement.executeUpdate(delete);
		
		conexao.close();
	}
	
	public static void CUpdate(String update) throws SQLException {
		
         conexao = DriverManager.getConnection(connectionUrl);
       
			PreparedStatement statement = conexao.prepareStatement(update);

			statement.executeUpdate();
		
		conexao.close();
	}
		}