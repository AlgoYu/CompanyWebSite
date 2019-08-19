package anonymous.developer.mapper;

import anonymous.developer.model.CasePicture;
import anonymous.developer.model.CasePictureExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CasePictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    long countByExample(CasePictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    int deleteByExample(CasePictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    int deleteByPrimaryKey(Integer casePictureId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    int insert(CasePicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    int insertSelective(CasePicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    List<CasePicture> selectByExample(CasePictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    CasePicture selectByPrimaryKey(Integer casePictureId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") CasePicture record, @Param("example") CasePictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    int updateByExample(@Param("record") CasePicture record, @Param("example") CasePictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    int updateByPrimaryKeySelective(CasePicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_picture
     *
     * @mbg.generated Sat Jun 15 02:59:09 CST 2019
     */
    int updateByPrimaryKey(CasePicture record);
}