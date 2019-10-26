package mapper;

import com.common.model.AdPic;
import com.common.model.AdPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdPicMapper {
    long countByExample(AdPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdPic record);

    int insertSelective(AdPic record);

    List<AdPic> selectByExample(AdPicExample example);

    AdPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdPic record, @Param("example") AdPicExample example);

    int updateByExample(@Param("record") AdPic record, @Param("example") AdPicExample example);

    int updateByPrimaryKeySelective(AdPic record);

    int updateByPrimaryKey(AdPic record);
}