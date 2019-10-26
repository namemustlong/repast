package mapper;

import com.common.model.BaseUserAddress;
import com.common.model.BaseUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseUserAddressMapper {
    long countByExample(BaseUserAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseUserAddress record);

    int insertSelective(BaseUserAddress record);

    List<BaseUserAddress> selectByExample(BaseUserAddressExample example);

    BaseUserAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseUserAddress record, @Param("example") BaseUserAddressExample example);

    int updateByExample(@Param("record") BaseUserAddress record, @Param("example") BaseUserAddressExample example);

    int updateByPrimaryKeySelective(BaseUserAddress record);

    int updateByPrimaryKey(BaseUserAddress record);
}