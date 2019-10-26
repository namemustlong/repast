package mapper;

import com.common.model.BaseDeliveryAddress;
import com.common.model.BaseDeliveryAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDeliveryAddressMapper {
    long countByExample(BaseDeliveryAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseDeliveryAddress record);

    int insertSelective(BaseDeliveryAddress record);

    List<BaseDeliveryAddress> selectByExample(BaseDeliveryAddressExample example);

    BaseDeliveryAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseDeliveryAddress record, @Param("example") BaseDeliveryAddressExample example);

    int updateByExample(@Param("record") BaseDeliveryAddress record, @Param("example") BaseDeliveryAddressExample example);

    int updateByPrimaryKeySelective(BaseDeliveryAddress record);

    int updateByPrimaryKey(BaseDeliveryAddress record);
}