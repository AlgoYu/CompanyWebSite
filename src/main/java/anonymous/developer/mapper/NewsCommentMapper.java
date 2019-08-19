package anonymous.developer.mapper;

import anonymous.developer.model.NewsComment;
import anonymous.developer.model.NewsCommentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NewsCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    long countByExample(NewsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    int deleteByExample(NewsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    int deleteByPrimaryKey(Integer newsCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    int insert(NewsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    int insertSelective(NewsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    List<NewsComment> selectByExample(NewsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    NewsComment selectByPrimaryKey(Integer newsCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") NewsComment record, @Param("example") NewsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    int updateByExample(@Param("record") NewsComment record, @Param("example") NewsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    int updateByPrimaryKeySelective(NewsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_comment
     *
     * @mbg.generated Sat Jun 15 02:57:41 CST 2019
     */
    int updateByPrimaryKey(NewsComment record);
}