package mybatis.mybatis.generate.po;

public class TLoginLog {
    private Integer loginLogId;

    private Integer userId;

    private String ip;

    private String loginDatetime;

    public Integer getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(String loginDatetime) {
        this.loginDatetime = loginDatetime == null ? null : loginDatetime.trim();
    }
}