package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAL {
    DBUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public int insertUser(UserDTO userDTO){
	//thực hiện các lệnh kết nối CSDL
	con = dbUtils.getConnection();
	//thực hiện insert dữ liệu vào bảng users
	int result = 0;
	preparedStatement=con.prepareStatement(insert into users(userID, username, gioitinh…) values(?,?,?...));
	preparedStatement.setString(1,userDTO.getUserID());
	preparedStatement.setString(2,userDTO.getUserName());
	preparedStatement.setString(3,userDTO.getGioiTinh());
		…
	result=preparedStatement.executeUpdate();
	return result;
	}

}
