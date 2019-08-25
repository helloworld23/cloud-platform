package com.github.wxiaoqi.security.tenant.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * node
 * @author 
 */
public class Node implements Serializable {
    /**
     * 设备id
     */
    private String id;

    /**
     * 服务器ip
     */
    private String ip;

    /**
     * 远程端口
     */
    private String remotePort;

    /**
     * 本地端口
     */
    private String localPort;

    /**
     * 密码
     */
    private String password;

    /**
     * 加密方式
     */
    private String encryptMethod;

    /**
     * 协议
     */
    private String protocol;

    /**
     * 混淆参数
     */
    private String obfs;

    /**
     * 是否绑定0:未绑定;1:绑定
     */
    private Byte status;

    /**
     * 是否启用0:未启用;1:启用
     */
    private Byte flag;

    private Date createdate;

    private Byte delFlag;

    private Date contractDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(String remotePort) {
        this.remotePort = remotePort;
    }

    public String getLocalPort() {
        return localPort;
    }

    public void setLocalPort(String localPort) {
        this.localPort = localPort;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptMethod() {
        return encryptMethod;
    }

    public void setEncryptMethod(String encryptMethod) {
        this.encryptMethod = encryptMethod;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getObfs() {
        return obfs;
    }

    public void setObfs(String obfs) {
        this.obfs = obfs;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

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
        Node other = (Node) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getRemotePort() == null ? other.getRemotePort() == null : this.getRemotePort().equals(other.getRemotePort()))
            && (this.getLocalPort() == null ? other.getLocalPort() == null : this.getLocalPort().equals(other.getLocalPort()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEncryptMethod() == null ? other.getEncryptMethod() == null : this.getEncryptMethod().equals(other.getEncryptMethod()))
            && (this.getProtocol() == null ? other.getProtocol() == null : this.getProtocol().equals(other.getProtocol()))
            && (this.getObfs() == null ? other.getObfs() == null : this.getObfs().equals(other.getObfs()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getContractDate() == null ? other.getContractDate() == null : this.getContractDate().equals(other.getContractDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getRemotePort() == null) ? 0 : getRemotePort().hashCode());
        result = prime * result + ((getLocalPort() == null) ? 0 : getLocalPort().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEncryptMethod() == null) ? 0 : getEncryptMethod().hashCode());
        result = prime * result + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        result = prime * result + ((getObfs() == null) ? 0 : getObfs().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getContractDate() == null) ? 0 : getContractDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ip=").append(ip);
        sb.append(", remotePort=").append(remotePort);
        sb.append(", localPort=").append(localPort);
        sb.append(", password=").append(password);
        sb.append(", encryptMethod=").append(encryptMethod);
        sb.append(", protocol=").append(protocol);
        sb.append(", obfs=").append(obfs);
        sb.append(", status=").append(status);
        sb.append(", flag=").append(flag);
        sb.append(", createdate=").append(createdate);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", contractDate=").append(contractDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}