package com.example.dataanalysis.basic;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * virus_log
 * @author
 */
@Data
public class VirusLog implements Serializable {
    private String id;

    private Date date;

    /**
     * 终端
     */
    private String terminal;

    /**
     * 域
     */
    private String domain;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 平台
     */
    private String platform;

    /**
     * 安全威胁
     */
    private String securityThreat;

    /**
     * 感染源
     */
    private String infectSource;

    /**
     * 受感染的文件
     */
    private String infectFile;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 扫描类型
     */
    private String type;

    /**
     * 结果
     */
    private String result;

    /**
     * ip地址
     */
    private String ipAddress;

    /**
     * mac地址
     */
    private String macAddress;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        VirusLog other = (VirusLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
                && (this.getTerminal() == null ? other.getTerminal() == null : this.getTerminal().equals(other.getTerminal()))
                && (this.getDomain() == null ? other.getDomain() == null : this.getDomain().equals(other.getDomain()))
                && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
                && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
                && (this.getSecurityThreat() == null ? other.getSecurityThreat() == null : this.getSecurityThreat().equals(other.getSecurityThreat()))
                && (this.getInfectSource() == null ? other.getInfectSource() == null : this.getInfectSource().equals(other.getInfectSource()))
                && (this.getInfectFile() == null ? other.getInfectFile() == null : this.getInfectFile().equals(other.getInfectFile()))
                && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
                && (this.getIpAddress() == null ? other.getIpAddress() == null : this.getIpAddress().equals(other.getIpAddress()))
                && (this.getMacAddress() == null ? other.getMacAddress() == null : this.getMacAddress().equals(other.getMacAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getTerminal() == null) ? 0 : getTerminal().hashCode());
        result = prime * result + ((getDomain() == null) ? 0 : getDomain().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getSecurityThreat() == null) ? 0 : getSecurityThreat().hashCode());
        result = prime * result + ((getInfectSource() == null) ? 0 : getInfectSource().hashCode());
        result = prime * result + ((getInfectFile() == null) ? 0 : getInfectFile().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        result = prime * result + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", terminal=").append(terminal);
        sb.append(", domain=").append(domain);
        sb.append(", loginName=").append(loginName);
        sb.append(", platform=").append(platform);
        sb.append(", securityThreat=").append(securityThreat);
        sb.append(", infectSource=").append(infectSource);
        sb.append(", infectFile=").append(infectFile);
        sb.append(", filePath=").append(filePath);
        sb.append(", type=").append(type);
        sb.append(", result=").append(result);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", macAddress=").append(macAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
