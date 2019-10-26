package mapper;

import com.common.model.GoodDetail;
import com.common.model.GoodDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodDetailMapper {
    long countByExample(GoodDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodDetail record);

    int insertSelective(GoodDetail record);

    List<GoodDetail> selectByExample(GoodDetailExample example);

    GoodDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodDetail record, @Param("example") GoodDetailExample example);

    int updateByExample(@Param("record") GoodDetail record, @Param("example") GoodDetailExample example);

    int updateByPrimaryKeySelective(GoodDetail record);

    int updateByPrimaryKey(GoodDetail record);
}