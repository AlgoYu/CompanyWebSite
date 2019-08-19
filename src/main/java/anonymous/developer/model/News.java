package anonymous.developer.model;

import java.util.Date;

public class News {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.news_id
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    private Integer newsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.news_cover
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    private String newsCover;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.news_title
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    private String newsTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.news_content
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    private String newsContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.news_datetime
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    private Date newsDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.news_classification_id
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    private Integer newsClassificationId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.news_id
     *
     * @return the value of news.news_id
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public Integer getNewsId() {
        return newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.news_id
     *
     * @param newsId the value for news.news_id
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.news_cover
     *
     * @return the value of news.news_cover
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public String getNewsCover() {
        return newsCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.news_cover
     *
     * @param newsCover the value for news.news_cover
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public void setNewsCover(String newsCover) {
        this.newsCover = newsCover == null ? null : newsCover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.news_title
     *
     * @return the value of news.news_title
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.news_title
     *
     * @param newsTitle the value for news.news_title
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.news_content
     *
     * @return the value of news.news_content
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public String getNewsContent() {
        return newsContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.news_content
     *
     * @param newsContent the value for news.news_content
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.news_datetime
     *
     * @return the value of news.news_datetime
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public Date getNewsDatetime() {
        return newsDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.news_datetime
     *
     * @param newsDatetime the value for news.news_datetime
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public void setNewsDatetime(Date newsDatetime) {
        this.newsDatetime = newsDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.news_classification_id
     *
     * @return the value of news.news_classification_id
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public Integer getNewsClassificationId() {
        return newsClassificationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.news_classification_id
     *
     * @param newsClassificationId the value for news.news_classification_id
     *
     * @mbg.generated Sat Jun 15 02:56:11 CST 2019
     */
    public void setNewsClassificationId(Integer newsClassificationId) {
        this.newsClassificationId = newsClassificationId;
    }
}