package anonymous.developer.model;

public class NewsLabel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_label.news_label_id
     *
     * @mbg.generated Sat Jun 15 02:55:45 CST 2019
     */
    private Integer newsLabelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_label.news_label_name
     *
     * @mbg.generated Sat Jun 15 02:55:45 CST 2019
     */
    private String newsLabelName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_label.news_label_id
     *
     * @return the value of news_label.news_label_id
     *
     * @mbg.generated Sat Jun 15 02:55:45 CST 2019
     */
    public Integer getNewsLabelId() {
        return newsLabelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_label.news_label_id
     *
     * @param newsLabelId the value for news_label.news_label_id
     *
     * @mbg.generated Sat Jun 15 02:55:45 CST 2019
     */
    public void setNewsLabelId(Integer newsLabelId) {
        this.newsLabelId = newsLabelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_label.news_label_name
     *
     * @return the value of news_label.news_label_name
     *
     * @mbg.generated Sat Jun 15 02:55:45 CST 2019
     */
    public String getNewsLabelName() {
        return newsLabelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_label.news_label_name
     *
     * @param newsLabelName the value for news_label.news_label_name
     *
     * @mbg.generated Sat Jun 15 02:55:45 CST 2019
     */
    public void setNewsLabelName(String newsLabelName) {
        this.newsLabelName = newsLabelName == null ? null : newsLabelName.trim();
    }
}