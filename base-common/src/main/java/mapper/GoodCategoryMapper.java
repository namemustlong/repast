package mapper;

import com.common.model.GoodCategory;
import com.common.model.GoodCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodCategoryMapper {
    long countByExample(GoodCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodCategory record);

    int insertSelective(GoodCategory record);

    List<GoodCategory> selectByExample(GoodCategoryExample example);

    GoodCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodCategory record, @Param("example") GoodCategoryExample example);

    int updateByExample(@Param("record") GoodCategory record, @Param("example") GoodCategoryExample example);

    int updateByPrimaryKeySelective(GoodCategory record);

    int updateByPrimaryKey(GoodCategory record);
}