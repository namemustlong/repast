package mapper;

import com.common.model.BaseOrder;
import com.common.model.BaseOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrderMapper {
    long countByExample(BaseOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseOrder record);

    int insertSelective(BaseOrder record);

    List<BaseOrder> selectByExample(BaseOrderExample example);

    BaseOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseOrder record, @Param("example") BaseOrderExample example);

    int updateByExample(@Param("record") BaseOrder record, @Param("example") BaseOrderExample example);

    int updateByPrimaryKeySelective(BaseOrder record);

    int updateByPrimaryKey(BaseOrder record);
}