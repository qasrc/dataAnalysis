
package com.example.dataanalysis.basic;

import java.io.Serializable;
import lombok.Data;

/**
 * vpn_user
 * @author
 */
@Data
public class VpnUser implements Serializable {
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 所属组路径
     */
    private String groupPath;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 虚拟IP地址
     */
    private String ipAddress;

    /**
     * 描述
     */
    private String desc;

    /**
     * 所属CA
     */
    private String ca;

    /**
     * 证书绑定字段
     */
    private String certificate;

    /**
     * 最后一次登录
     */
    private String lastLogin;

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
        VpnUser other = (VpnUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getGroupPath() == null ? other.getGroupPath() == null : this.getGroupPath().equals(other.getGroupPath()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getIpAddress() == null ? other.getIpAddress() == null : this.getIpAddress().equals(other.getIpAddress()))
                && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
                && (this.getCa() == null ? other.getCa() == null : this.getCa().equals(other.getCa()))
                && (this.getCertificate() == null ? other.getCertificate() == null : this.getCertificate().equals(other.getCertificate()))
                && (this.getLastLogin() == null ? other.getLastLogin() == null : this.getLastLogin().equals(other.getLastLogin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getGroupPath() == null) ? 0 : getGroupPath().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getCa() == null) ? 0 : getCa().hashCode());
        result = prime * result + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        result = prime * result + ((getLastLogin() == null) ? 0 : getLastLogin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", groupPath=").append(groupPath);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", desc=").append(desc);
        sb.append(", ca=").append(ca);
        sb.append(", certificate=").append(certificate);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
