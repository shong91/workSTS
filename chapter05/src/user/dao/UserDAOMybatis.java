package user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import user.bean.UserDTO;

@Transactional //트랜잭션을 적용하고자 하는 서비스 클래스.
public class UserDAOMybatis implements UserDAO {
	@Setter
	private SqlSession sqlSession; 
	
	@Override
	public void userWrite(UserDTO userDTO) {
		sqlSession.insert("userSQL.userWrite", userDTO);
	}

	@Override
	public List<UserDTO> getUserList() {
		return sqlSession.selectList("userSQL.getUserList");
	}

	@Override
	public UserDTO getUser(String id) {		
		return sqlSession.selectOne("userSQL.getUser", id);
	}

	@Override
	public void updateUser(Map<String, String> map) {
		sqlSession.update("userSQL.updateUser", map);
	}

	@Override
	public int deleteUser(String id) {
		return sqlSession.delete("userSQL.deleteUser", id);
	}

	@Override
	public List<UserDTO> searchUserList(Map<String, String> map) {
		return sqlSession.selectList("userSQL.searchUserList", map);
	}

}
