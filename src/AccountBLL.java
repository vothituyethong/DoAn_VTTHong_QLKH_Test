package BLL;

import DAL.AccountDAL;
import java.sql.SQLException;

public class AccountBLL{
    AccountDAL accountDAL;
    public void Login(String username, String password) throws SQLException, ClassNotFoundException{
	accountDAL.Login(username, password);
    }
}

