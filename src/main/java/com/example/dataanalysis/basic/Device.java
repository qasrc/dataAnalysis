
package com.example.dataanalysis.basic;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * device
 * @author
 */
@Data
public class Device implements Serializable {
    private String id;

    /**
     * 分支机构
     */
    private String orgName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 单位名称
     */
    private String departName;

    /**
     * 手机号码
     */
    private String cellphone;

    /**
     * 座机号码
     */
    private String landlinePhone;

    /**
     * 计算机名
     */
    private String computerName;

    /**
     * 状态
     */
    private String status;

    /**
     * 所属组
     */
    private String group;

    /**
     * ip地址
     */
    private String ipAddress;

    /**
     * 序号
     */
    private Integer index;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 浏览器版本
     */
    private String browserVersion;

    /**
     * 客户端版本
     */
    private String clientVersion;

    /**
     * 平台
     */
    private String platform;

    /**
     * 系统类型
     */
    private String systemType;

    /**
     * 系统版本
     */
    private String systemVersion;

    /**
     * 最后连接时间
     */
    private Date lastConnTime;

    /**
     * 最后断开时间
     */
    private Date lastBrokenTime;

    /**
     * 登录账号
     */
    private String loginAccount;

    /**
     * 通信IP地址
     */
    private String commIpAddress;

    /**
     * mac地址
     */
    private String macAddress;

    private String email;

    /**
     * 办公地点
     */
    private String location;

    /**
     * 职位
     */
    private String position;

    /**
     * 使用人姓名
     */
    private String useName;

    /**
     * 所属部门
     */
    private String useDepartment;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 电话
     */
    private String usePhone;

    /**
     * 人员状态
     */
    private String useStatus;

    /**
     * 注册状态
     */
    private String registerStatus;

    /**
     * 计算机来源
     */
    private String computerSource;

    /**
     * 资产编号
     */
    private String balanceNo;

    /**
     * 入网申请开始时间
     */
    private Date netinStartTime;

    /**
     * 入网申请结束时间
     */
    private Date netinEndTime;

    /**
     * 注册类型
     */
    private String registerType;

    /**
     * 审批状态
     */
    private String approveStatus;

    /**
     * 杀毒软件名称
     */
    private String antivirusName;

    /**
     * 杀毒软件版本
     */
    private String antivirusVersion;

    /**
     * 杀毒软件是否最新
     */
    private String antivirusNewest;

    /**
     * 病毒库版本
     */
    private String virusDatabaseVersion;

    /**
     * 默认浏览器
     */
    private String defaultBrowser;

    /**
     * 激活状态
     */
    private String activeStatus;

    /**
     * 授权状态
     */
    private String authorizeStatus;

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
        Device other = (Device) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getDepartName() == null ? other.getDepartName() == null : this.getDepartName().equals(other.getDepartName()))
                && (this.getCellphone() == null ? other.getCellphone() == null : this.getCellphone().equals(other.getCellphone()))
                && (this.getLandlinePhone() == null ? other.getLandlinePhone() == null : this.getLandlinePhone().equals(other.getLandlinePhone()))
                && (this.getComputerName() == null ? other.getComputerName() == null : this.getComputerName().equals(other.getComputerName()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getGroup() == null ? other.getGroup() == null : this.getGroup().equals(other.getGroup()))
                && (this.getIpAddress() == null ? other.getIpAddress() == null : this.getIpAddress().equals(other.getIpAddress()))
                && (this.getIndex() == null ? other.getIndex() == null : this.getIndex().equals(other.getIndex()))
                && (this.getDeviceType() == null ? other.getDeviceType() == null : this.getDeviceType().equals(other.getDeviceType()))
                && (this.getBrowserVersion() == null ? other.getBrowserVersion() == null : this.getBrowserVersion().equals(other.getBrowserVersion()))
                && (this.getClientVersion() == null ? other.getClientVersion() == null : this.getClientVersion().equals(other.getClientVersion()))
                && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
                && (this.getSystemType() == null ? other.getSystemType() == null : this.getSystemType().equals(other.getSystemType()))
                && (this.getSystemVersion() == null ? other.getSystemVersion() == null : this.getSystemVersion().equals(other.getSystemVersion()))
                && (this.getLastConnTime() == null ? other.getLastConnTime() == null : this.getLastConnTime().equals(other.getLastConnTime()))
                && (this.getLastBrokenTime() == null ? other.getLastBrokenTime() == null : this.getLastBrokenTime().equals(other.getLastBrokenTime()))
                && (this.getLoginAccount() == null ? other.getLoginAccount() == null : this.getLoginAccount().equals(other.getLoginAccount()))
                && (this.getCommIpAddress() == null ? other.getCommIpAddress() == null : this.getCommIpAddress().equals(other.getCommIpAddress()))
                && (this.getMacAddress() == null ? other.getMacAddress() == null : this.getMacAddress().equals(other.getMacAddress()))
                && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
                && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
                && (this.getUseName() == null ? other.getUseName() == null : this.getUseName().equals(other.getUseName()))
                && (this.getUseDepartment() == null ? other.getUseDepartment() == null : this.getUseDepartment().equals(other.getUseDepartment()))
                && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
                && (this.getUsePhone() == null ? other.getUsePhone() == null : this.getUsePhone().equals(other.getUsePhone()))
                && (this.getUseStatus() == null ? other.getUseStatus() == null : this.getUseStatus().equals(other.getUseStatus()))
                && (this.getRegisterStatus() == null ? other.getRegisterStatus() == null : this.getRegisterStatus().equals(other.getRegisterStatus()))
                && (this.getComputerSource() == null ? other.getComputerSource() == null : this.getComputerSource().equals(other.getComputerSource()))
                && (this.getBalanceNo() == null ? other.getBalanceNo() == null : this.getBalanceNo().equals(other.getBalanceNo()))
                && (this.getNetinStartTime() == null ? other.getNetinStartTime() == null : this.getNetinStartTime().equals(other.getNetinStartTime()))
                && (this.getNetinEndTime() == null ? other.getNetinEndTime() == null : this.getNetinEndTime().equals(other.getNetinEndTime()))
                && (this.getRegisterType() == null ? other.getRegisterType() == null : this.getRegisterType().equals(other.getRegisterType()))
                && (this.getApproveStatus() == null ? other.getApproveStatus() == null : this.getApproveStatus().equals(other.getApproveStatus()))
                && (this.getAntivirusName() == null ? other.getAntivirusName() == null : this.getAntivirusName().equals(other.getAntivirusName()))
                && (this.getAntivirusVersion() == null ? other.getAntivirusVersion() == null : this.getAntivirusVersion().equals(other.getAntivirusVersion()))
                && (this.getAntivirusNewest() == null ? other.getAntivirusNewest() == null : this.getAntivirusNewest().equals(other.getAntivirusNewest()))
                && (this.getVirusDatabaseVersion() == null ? other.getVirusDatabaseVersion() == null : this.getVirusDatabaseVersion().equals(other.getVirusDatabaseVersion()))
                && (this.getDefaultBrowser() == null ? other.getDefaultBrowser() == null : this.getDefaultBrowser().equals(other.getDefaultBrowser()))
                && (this.getActiveStatus() == null ? other.getActiveStatus() == null : this.getActiveStatus().equals(other.getActiveStatus()))
                && (this.getAuthorizeStatus() == null ? other.getAuthorizeStatus() == null : this.getAuthorizeStatus().equals(other.getAuthorizeStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDepartName() == null) ? 0 : getDepartName().hashCode());
        result = prime * result + ((getCellphone() == null) ? 0 : getCellphone().hashCode());
        result = prime * result + ((getLandlinePhone() == null) ? 0 : getLandlinePhone().hashCode());
        result = prime * result + ((getComputerName() == null) ? 0 : getComputerName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGroup() == null) ? 0 : getGroup().hashCode());
        result = prime * result + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        result = prime * result + ((getIndex() == null) ? 0 : getIndex().hashCode());
        result = prime * result + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        result = prime * result + ((getBrowserVersion() == null) ? 0 : getBrowserVersion().hashCode());
        result = prime * result + ((getClientVersion() == null) ? 0 : getClientVersion().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getSystemType() == null) ? 0 : getSystemType().hashCode());
        result = prime * result + ((getSystemVersion() == null) ? 0 : getSystemVersion().hashCode());
        result = prime * result + ((getLastConnTime() == null) ? 0 : getLastConnTime().hashCode());
        result = prime * result + ((getLastBrokenTime() == null) ? 0 : getLastBrokenTime().hashCode());
        result = prime * result + ((getLoginAccount() == null) ? 0 : getLoginAccount().hashCode());
        result = prime * result + ((getCommIpAddress() == null) ? 0 : getCommIpAddress().hashCode());
        result = prime * result + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getUseName() == null) ? 0 : getUseName().hashCode());
        result = prime * result + ((getUseDepartment() == null) ? 0 : getUseDepartment().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getUsePhone() == null) ? 0 : getUsePhone().hashCode());
        result = prime * result + ((getUseStatus() == null) ? 0 : getUseStatus().hashCode());
        result = prime * result + ((getRegisterStatus() == null) ? 0 : getRegisterStatus().hashCode());
        result = prime * result + ((getComputerSource() == null) ? 0 : getComputerSource().hashCode());
        result = prime * result + ((getBalanceNo() == null) ? 0 : getBalanceNo().hashCode());
        result = prime * result + ((getNetinStartTime() == null) ? 0 : getNetinStartTime().hashCode());
        result = prime * result + ((getNetinEndTime() == null) ? 0 : getNetinEndTime().hashCode());
        result = prime * result + ((getRegisterType() == null) ? 0 : getRegisterType().hashCode());
        result = prime * result + ((getApproveStatus() == null) ? 0 : getApproveStatus().hashCode());
        result = prime * result + ((getAntivirusName() == null) ? 0 : getAntivirusName().hashCode());
        result = prime * result + ((getAntivirusVersion() == null) ? 0 : getAntivirusVersion().hashCode());
        result = prime * result + ((getAntivirusNewest() == null) ? 0 : getAntivirusNewest().hashCode());
        result = prime * result + ((getVirusDatabaseVersion() == null) ? 0 : getVirusDatabaseVersion().hashCode());
        result = prime * result + ((getDefaultBrowser() == null) ? 0 : getDefaultBrowser().hashCode());
        result = prime * result + ((getActiveStatus() == null) ? 0 : getActiveStatus().hashCode());
        result = prime * result + ((getAuthorizeStatus() == null) ? 0 : getAuthorizeStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgName=").append(orgName);
        sb.append(", remark=").append(remark);
        sb.append(", departName=").append(departName);
        sb.append(", cellphone=").append(cellphone);
        sb.append(", landlinePhone=").append(landlinePhone);
        sb.append(", computerName=").append(computerName);
        sb.append(", status=").append(status);
        sb.append(", group=").append(group);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", index=").append(index);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", browserVersion=").append(browserVersion);
        sb.append(", clientVersion=").append(clientVersion);
        sb.append(", platform=").append(platform);
        sb.append(", systemType=").append(systemType);
        sb.append(", systemVersion=").append(systemVersion);
        sb.append(", lastConnTime=").append(lastConnTime);
        sb.append(", lastBrokenTime=").append(lastBrokenTime);
        sb.append(", loginAccount=").append(loginAccount);
        sb.append(", commIpAddress=").append(commIpAddress);
        sb.append(", macAddress=").append(macAddress);
        sb.append(", email=").append(email);
        sb.append(", location=").append(location);
        sb.append(", position=").append(position);
        sb.append(", useName=").append(useName);
        sb.append(", useDepartment=").append(useDepartment);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", usePhone=").append(usePhone);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", registerStatus=").append(registerStatus);
        sb.append(", computerSource=").append(computerSource);
        sb.append(", balanceNo=").append(balanceNo);
        sb.append(", netinStartTime=").append(netinStartTime);
        sb.append(", netinEndTime=").append(netinEndTime);
        sb.append(", registerType=").append(registerType);
        sb.append(", approveStatus=").append(approveStatus);
        sb.append(", antivirusName=").append(antivirusName);
        sb.append(", antivirusVersion=").append(antivirusVersion);
        sb.append(", antivirusNewest=").append(antivirusNewest);
        sb.append(", virusDatabaseVersion=").append(virusDatabaseVersion);
        sb.append(", defaultBrowser=").append(defaultBrowser);
        sb.append(", activeStatus=").append(activeStatus);
        sb.append(", authorizeStatus=").append(authorizeStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
