package anonymous.developer.model;

public class Log {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.log_id
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    private Integer logId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.log_action
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    private String logAction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.log_user
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    private String logUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.log_result
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    private Integer logResult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.log_content
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    private String logContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.log_id
     *
     * @return the value of log.log_id
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.log_id
     *
     * @param logId the value for log.log_id
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.log_action
     *
     * @return the value of log.log_action
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public String getLogAction() {
        return logAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.log_action
     *
     * @param logAction the value for log.log_action
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public void setLogAction(String logAction) {
        this.logAction = logAction == null ? null : logAction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.log_user
     *
     * @return the value of log.log_user
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public String getLogUser() {
        return logUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.log_user
     *
     * @param logUser the value for log.log_user
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public void setLogUser(String logUser) {
        this.logUser = logUser == null ? null : logUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.log_result
     *
     * @return the value of log.log_result
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public Integer getLogResult() {
        return logResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.log_result
     *
     * @param logResult the value for log.log_result
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public void setLogResult(Integer logResult) {
        this.logResult = logResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.log_content
     *
     * @return the value of log.log_content
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public String getLogContent() {
        return logContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.log_content
     *
     * @param logContent the value for log.log_content
     *
     * @mbg.generated Sat Jun 22 22:46:22 CST 2019
     */
    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }
}