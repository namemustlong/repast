package mapper;

import com.common.model.GoodDetailExt;
import com.common.model.GoodDetailExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodDetailExtMapper {
    long countByExample(GoodDetailExtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodDetailExt record);

    int insertSelective(GoodDetailExt record);

    List<GoodDetailExt> selectByExample(GoodDetailExtExample example);

    GoodDetailExt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodDetailExt record, @Param("example") GoodDetailExtExample example);

    int updateByExample(@Param("record") GoodDetailExt record, @Param("example") GoodDetailExtExample example);

    int updateByPrimaryKeySelective(GoodDetailExt record);

    int updateByPrimaryKey(GoodDetailExt record);
}