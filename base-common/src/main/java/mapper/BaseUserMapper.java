package mapper;

import com.common.model.BaseUser;
import com.common.model.BaseUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseUserMapper {
    long countByExample(BaseUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    List<BaseUser> selectByExample(BaseUserExample example);

    BaseUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

    int updateByExample(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
}